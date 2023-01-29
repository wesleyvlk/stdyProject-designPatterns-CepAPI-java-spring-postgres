package com.dio;

import com.dio.facade.Facade;
import com.dio.singleton.SingletonEager;
import com.dio.singleton.SingletonHolder;
import com.dio.singleton.SingletonLazy;
import com.dio.strategy.Robot;
import com.dio.strategy.actions.Actions;
import com.dio.strategy.actions.ActionsFly;
import com.dio.strategy.actions.ActionsSwim;
import com.dio.strategy.actions.ActionsWalk;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Strategy
        Actions fly = new ActionsFly();
        Actions swim = new ActionsSwim();
        Actions walk = new ActionsWalk();

        Robot robot = new Robot();
        robot.setActions(walk);
        robot.move();
        robot.move();
        robot.setActions(fly);
        robot.move();
        robot.move();
        robot.setActions(swim);
        robot.move();
        robot.move();

        // Singleton
        SingletonLazy lazy = SingletonLazy.getImInstance();
        System.out.println(lazy);     
        SingletonEager eager = SingletonEager.getImInstance();
        System.out.println(eager);
        SingletonHolder holder = SingletonHolder.getInstance();
        System.out.println(holder);

        // Facade
        Facade facade = new Facade();
        facade.migrateCustomer("Wesley", "06784000");
    }
}
