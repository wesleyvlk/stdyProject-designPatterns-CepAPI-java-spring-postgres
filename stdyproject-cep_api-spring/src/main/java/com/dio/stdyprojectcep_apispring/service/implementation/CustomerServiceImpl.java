package com.dio.stdyprojectcep_apispring.service.implementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.stdyprojectcep_apispring.model.Address;
import com.dio.stdyprojectcep_apispring.model.AddressRepository;
import com.dio.stdyprojectcep_apispring.model.Customer;
import com.dio.stdyprojectcep_apispring.model.CustomerRepository;
import com.dio.stdyprojectcep_apispring.service.CustomerService;
import com.dio.stdyprojectcep_apispring.service.ViaCepService;

/**
 * Implementação da <b>Strategy</b> {@link ClienteService}, a qual pode ser
 * injetada pelo Spring (via {@link Autowired}). Com isso, como essa classe é um
 * {@link Service}, ela será tratada como um <b>Singleton</b>.
 * 
 * @author falvojr
 */
/**
 * Esse {@link RestController} representa nossa <b>Facade</b>, pois abstrai toda
 * a complexidade de integrações (Banco de Dados H2 e API do ViaCEP) em uma
 * interface simples e coesa (API REST).
 * 
 * @author falvojr
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    /**
     * Singleton: Injetar os componentes do Spring com @Autowired.
     */
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private ViaCepService viaCepService;

    /**
     * Strategy: Implementar os métodos definidos na interface.
     * Facade: Abstrair integrações com subsistemas, provendo uma interface simples.
     */

    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(Long id) {
        Optional<Customer> customer = customerRepository.findById(id);
        return customer.get();
    }

    @Override
    public void insert(Customer customer) {
        saveCustomerWithZipCode(customer);
    }

    @Override
    public void update(Long id, Customer customer) {
        Optional<Customer> customerInDB = customerRepository.findById(id);
        if (customerInDB.isPresent())
            saveCustomerWithZipCode(customer);
    }

    @Override
    public void delete(Long id) {
        customerRepository.deleteById(id);
    }

    private void saveCustomerWithZipCode(Customer customer) {
        String cep = customer.getAddress().getCep();
        Address address = addressRepository.findById(cep)
                .orElseGet(() -> {
                    Address newAddress = viaCepService
                            .consultZipCode(cep);
                    addressRepository.save(newAddress);
                    return newAddress;
                });
        customer.setAddress(address);
        customerRepository.save(customer);
    }

}
