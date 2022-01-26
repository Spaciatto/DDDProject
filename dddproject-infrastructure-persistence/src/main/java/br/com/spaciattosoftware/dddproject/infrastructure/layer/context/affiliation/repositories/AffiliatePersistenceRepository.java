package br.com.spaciattosoftware.dddproject.infrastructure.layer.context.affiliation.repositories;

import br.com.spaciattosoftware.dddproject.domain.layer.conext.affiliation.entities.Affiliate;
import br.com.spaciattosoftware.dddproject.domain.layer.conext.affiliation.repositories.AffiliateRepository;
import br.com.spaciattosoftware.dddproject.infrastructure.layer.commons.configs.EntityManagerSingleton;
import br.com.spaciattosoftware.dddproject.infrastructure.layer.context.affiliation.entities.AffiliatePersistenceEntity;
import br.com.spaciattosoftware.dddproject.infrastructure.layer.context.affiliation.entities.CategoryPersistenceEntity;
import br.com.spaciattosoftware.dddproject.infrastructure.layer.context.affiliation.mappers.AffiliatePersistenceMapper;
import br.com.spaciattosoftware.dddproject.infrastructure.layer.context.affiliation.mappers.CategoryPersistenceMapper;

import javax.persistence.EntityManager;

public class AffiliatePersistenceRepository implements AffiliateRepository {

    @Override
    public void add(Affiliate affiliate) {
        AffiliatePersistenceEntity affiliatePersistenceEntity = AffiliatePersistenceMapper.fromDomain(affiliate);
        EntityManager em = EntityManagerSingleton.getInstance();
        em.getTransaction().begin();
        em.persist(affiliatePersistenceEntity);
        em.getTransaction().commit();

    }
}
