package br.com.spaciattosoftware.dddproject.infrastructure.layer.context.affiliation.mappers;

import br.com.spaciattosoftware.dddproject.domain.layer.conext.affiliation.entities.Affiliate;
import br.com.spaciattosoftware.dddproject.infrastructure.layer.context.affiliation.entities.AffiliatePersistenceEntity;

public class AffiliatePersistenceMapper {

    public static AffiliatePersistenceEntity fromDomain(Affiliate domainEntity) {
        return new AffiliatePersistenceEntity(domainEntity.getId(), domainEntity.getName(),
                domainEntity.getEmail(), CategoryPersistenceMapper.fromDomain(domainEntity.getCategory()));
    }

}
