package com.dio.strategy;

import com.dio.strategy.actions.Actions;

public class Robot {

    protected String modeWalk = "Ativar: Pernas";
    protected String modeFly = "Ativar: Propulsores";
    protected String modeSwim = "Ativar: Mergulho";
    protected boolean init;

    private Actions actions;

    public void setActions(Actions actions) {
        this.actions = actions;
    }

    public void move() {
        actions.move();
    }

}
