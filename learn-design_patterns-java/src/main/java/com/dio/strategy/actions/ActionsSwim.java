package com.dio.strategy.actions;

import com.dio.strategy.Robot;

public class ActionsSwim extends Robot implements Actions {

    private static String action = "Nadando";

    @Override
    public void move() {
        if (!init) {
            System.out.printf("Iniciando ação %s... %s %n", action, modeSwim);
            init = true;
        }
        System.out.println(action);
    }

}
