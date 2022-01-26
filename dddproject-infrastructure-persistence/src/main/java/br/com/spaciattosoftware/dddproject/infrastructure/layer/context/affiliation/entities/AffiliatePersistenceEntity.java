package br.com.spaciattosoftware.dddproject.infrastructure.layer.context.affiliation.entities;

import br.com.spaciattosoftware.dddproject.infrastructure.layer.commons.entities.AbstractPersistenceEntity;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "affiliate")
public class AffiliatePersistenceEntity extends AbstractPersistenceEntity {

    @Id
    private UUID id;

    private String name;
    private String email;

    @ManyToOne
    @JoinColumn(name="category_id", nullable=false)
    private CategoryPersistenceEntity categoryPersistenceEntity;

    public AffiliatePersistenceEntity() { }
    public AffiliatePersistenceEntity(UUID id, String name, String email,
                                      CategoryPersistenceEntity categoryPersistenceEntity) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.categoryPersistenceEntity = categoryPersistenceEntity;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public CategoryPersistenceEntity getCategoryPersistenceEntity() {
        return categoryPersistenceEntity;
    }

    public void setCategoryPersistenceEntity(CategoryPersistenceEntity categoryPersistenceEntity) {
        this.categoryPersistenceEntity = categoryPersistenceEntity;
    }
}
