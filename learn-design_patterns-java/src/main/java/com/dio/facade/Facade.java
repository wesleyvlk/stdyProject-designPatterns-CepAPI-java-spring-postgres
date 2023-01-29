package com.dio.facade;

import com.dio.subsystems.cep.CepService;
import com.dio.subsystems.crm.CrmService;

public class Facade {

    public void migrateCustomer(String name, String cep) {
        String city = CepService.getCepService().recoverCity(cep);
        String state = CepService.getCepService().recoverState(cep);

        CrmService.getCrmService().registerCustomer(name, cep, city, state);
    }
}
