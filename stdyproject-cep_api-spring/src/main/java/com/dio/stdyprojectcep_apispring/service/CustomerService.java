package com.dio.stdyprojectcep_apispring.service;

import com.dio.stdyprojectcep_apispring.model.Customer;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio de cliente. Com
 * isso, se necessário, podemos ter multiplas implementações dessa mesma
 * interface.
 * 
 * @author falvojr
 */
public interface CustomerService {

    Iterable<Customer> findAll();

    Customer findById(Long id);

    void insert(Customer customer);

    void update(Long id, Customer customer);

    void delete(Long id);

}
