package br.com.spaciattosoftware.dddproject.infrastructure.layer.context.affiliation.repositories;

import br.com.spaciattosoftware.dddproject.domain.layer.conext.affiliation.entities.Category;
import br.com.spaciattosoftware.dddproject.domain.layer.conext.affiliation.repositories.CategoryRepository;
import br.com.spaciattosoftware.dddproject.infrastructure.layer.commons.configs.EntityManagerSingleton;
import br.com.spaciattosoftware.dddproject.infrastructure.layer.context.affiliation.entities.CategoryPersistenceEntity;
import br.com.spaciattosoftware.dddproject.infrastructure.layer.context.affiliation.mappers.CategoryPersistenceMapper;

import javax.persistence.EntityManager;

public class CategoryPersistenceRepository implements CategoryRepository {

    @Override
    public void add(Category category) {

        CategoryPersistenceEntity categoryPersistenceEntity = CategoryPersistenceMapper.fromDomain(category);
        EntityManager em = EntityManagerSingleton.getInstance();
        em.getTransaction().begin();
        em.persist(categoryPersistenceEntity);
        em.getTransaction().commit();

    }
}
