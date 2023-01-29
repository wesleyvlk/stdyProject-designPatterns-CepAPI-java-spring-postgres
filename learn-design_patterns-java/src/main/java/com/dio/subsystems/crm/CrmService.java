package com.dio.subsystems.crm;

public class CrmService {

    private static final CrmService CRM_SERVICE = new CrmService();

    public static CrmService getCrmService() {
        return CRM_SERVICE;
    }

    private CrmService() {
        super();
    }


    public void registerCustomer(String name, String cep, String city, String state) {
        System.out.println("Cliente salvo no sistema de CRM:");
        System.out.printf("Nome: %s %n", name);
        System.out.printf("CEP: %s %n", cep);
        System.out.printf("Cidade: %s %n", city);
        System.out.printf("Estado: %s %n", state);
    }

}
