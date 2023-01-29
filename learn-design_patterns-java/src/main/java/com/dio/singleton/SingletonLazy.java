package com.dio.singleton;

/**
 * Singleton "preguicoso"
 * 
 * (opcional) possivel constate: nao
 * 
 * @see falvojr
 * @author wesleyvlk
 */
public class SingletonLazy {

    private static SingletonLazy imInstance;

    public static SingletonLazy getImInstance() {
        if (imInstance == null)
            imInstance = new SingletonLazy();
        return imInstance;
    }

    private SingletonLazy() {
        super();
    }
}
