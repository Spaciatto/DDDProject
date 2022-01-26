package br.com.spaciattosoftware.dddproject.infrastructure.layer;

import java.lang.reflect.InvocationTargetException;

public class PersistenceFactory {

    public <T> T getRepository(Class<T> clazz) throws NoSuchMethodException,  InstantiationException,
            IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        return clazz.getConstructor().newInstance();
    }

}
