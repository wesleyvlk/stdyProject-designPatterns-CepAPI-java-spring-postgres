package com.dio.strategy.actions;

import com.dio.strategy.Robot;

public class ActionsWalk extends Robot implements Actions {

    private static String action = "Andando";

    @Override
    public void move() {
        if (!init) {
            System.out.printf("Iniciando ação %s ... %s %n", action, modeWalk);
            init = true;
        }
        System.out.println(action);
    }

}
