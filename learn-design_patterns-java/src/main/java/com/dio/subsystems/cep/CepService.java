package com.dio.subsystems.cep;

public class CepService {

    private static final CepService CEP_SERVICE = new CepService();

    public static CepService getCepService() {
        return CEP_SERVICE;
    }

    private CepService() {
        super();
    }

    public String recoverCity(String cep) {
        return "Taboão da Serra";
    }

    public String recoverState(final String CEP) {
        return "SP";
    }

    // recoverJerusalem [T] ... sorry

}
