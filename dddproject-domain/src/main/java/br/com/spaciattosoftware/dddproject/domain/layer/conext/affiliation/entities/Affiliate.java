package br.com.spaciattosoftware.dddproject.domain.layer.conext.affiliation.entities;

import br.com.spaciattosoftware.dddproject.domain.layer.commons.entities.AbstractDomainEntity;

import java.util.UUID;

public class Affiliate extends AbstractDomainEntity {

    private UUID id;
    private String name;
    private String email;

    private Category category;

    protected Affiliate(UUID id, String name, String email, Category category) {
        this.setId(id);
        this.setName(name);
        this.setEmail(email);
        this.setCategory(category);
    }

    public static Affiliate createNew(UUID id, String name, String email, Category category) {
        return new Affiliate(id, name, email, category);
    }

    public UUID getId() {
        return this.id;
    }
    protected void setId(UUID id) {
        this.id = id != null ? id : UUID.randomUUID();
    }

    public String getName() {
        return this.name;
    }
    protected void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }
    protected void setEmail(String email) {
        this.email = email;
    }

    public Category getCategory() {
        return this.category;
    }
    protected void setCategory(Category category) {
        this.category = category;
    }

}
