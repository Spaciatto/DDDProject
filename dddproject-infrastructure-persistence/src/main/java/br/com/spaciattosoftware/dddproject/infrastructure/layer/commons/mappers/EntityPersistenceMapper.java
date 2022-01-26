package br.com.spaciattosoftware.dddproject.infrastructure.layer.commons.mappers;

import br.com.spaciattosoftware.dddproject.domain.layer.commons.entities.AbstractDomainEntity;
import br.com.spaciattosoftware.dddproject.infrastructure.layer.commons.entities.AbstractPersistenceEntity;

public interface EntityPersistenceMapper<D extends AbstractDomainEntity, P extends AbstractPersistenceEntity> {

    P fromDomain(D domainEntity);

}
