package com.dio.strategy.actions;

import com.dio.strategy.Robot;

public class ActionsFly extends Robot implements Actions {

    private static String action = "Voando";

    @Override
    public void move() {
        if (!init) {
            System.out.printf("Iniciando ação %s ... %s %n", action, modeFly);
            init = true;
        }
        System.out.println(action);
    }

}
