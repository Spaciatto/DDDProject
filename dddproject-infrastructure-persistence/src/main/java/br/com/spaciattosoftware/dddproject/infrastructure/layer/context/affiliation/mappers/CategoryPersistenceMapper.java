package br.com.spaciattosoftware.dddproject.infrastructure.layer.context.affiliation.mappers;

import br.com.spaciattosoftware.dddproject.domain.layer.conext.affiliation.entities.Category;
import br.com.spaciattosoftware.dddproject.infrastructure.layer.context.affiliation.entities.CategoryPersistenceEntity;

public class CategoryPersistenceMapper {

    public static CategoryPersistenceEntity fromDomain(Category domainEntity) {
        return new CategoryPersistenceEntity(domainEntity.getId(), domainEntity.getName());
    }

}
