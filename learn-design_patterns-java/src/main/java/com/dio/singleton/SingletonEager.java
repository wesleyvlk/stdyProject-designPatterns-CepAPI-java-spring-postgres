package com.dio.singleton;

/**
 * Singleton "ansioso"
 * 
 * (opcional) possivel constate: SIM
 * 
 * @see falvojr
 * @author wesleyvlk
 */
public class SingletonEager {
    
    private static final SingletonEager IM_INSTANCE = new SingletonEager();

    public SingletonEager() {
        super();
    }

    public static SingletonEager getImInstance() {
        return IM_INSTANCE;
    }
}
