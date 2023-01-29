package com.dio.singleton;

/**
 * Singleton "titular"
 * 
 * @see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
 * 
 * (opcional) possivel constate: SIM
 * 
 * @see falvojr
 * @author wesleyvlk
 */
public class SingletonHolder {

    private static class SingletonHolderInstance {
        private static final SingletonHolder IM_INSTANCE = new SingletonHolder();
    }

    private SingletonHolder() {
        super();
    }

    public static SingletonHolder getInstance() {
        return SingletonHolderInstance.IM_INSTANCE;
    }
}
