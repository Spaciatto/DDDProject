package br.com.spaciattosoftware.dddproject.infrastructure.layer.context.affiliation.entities;

import br.com.spaciattosoftware.dddproject.infrastructure.layer.commons.entities.AbstractPersistenceEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "category")
public class CategoryPersistenceEntity extends AbstractPersistenceEntity {

    @Id
    private UUID id;
    private String name;

    @OneToMany(mappedBy="categoryPersistenceEntity")
    private List<AffiliatePersistenceEntity> affiliatePersistenceEntities =
            new ArrayList<>();

    public CategoryPersistenceEntity() { }
    public CategoryPersistenceEntity(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
