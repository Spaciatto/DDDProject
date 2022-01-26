package br.com.spaciattosoftware.dddproject.infrastructure.layer.commons.configs;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerSingleton {

    private static EntityManagerFactory entityManagerFactory;

    private EntityManagerSingleton() {
    }

    public static EntityManager getInstance() {
        if (entityManagerFactory == null) {
            entityManagerFactory =
                    Persistence
                            .createEntityManagerFactory("br.com.spaciattosoftware.dddproject.infrastructure.layer.dddproject");
        }

        return entityManagerFactory.createEntityManager();
    }
}
