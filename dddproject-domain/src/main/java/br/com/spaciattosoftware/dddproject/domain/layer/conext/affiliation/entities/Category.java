package br.com.spaciattosoftware.dddproject.domain.layer.conext.affiliation.entities;

import br.com.spaciattosoftware.dddproject.domain.layer.commons.entities.AbstractDomainEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Category extends AbstractDomainEntity {

    private UUID id;
    private String name;

    private final List<Affiliate> affiliates = new ArrayList<>();

    protected Category(UUID id, String name) {
        this.setId(id);
        this.setName(name);
    }

    public static Category createNew(UUID id, String name) {
        return new Category(id, name);
    }

    public Double getBonusDiscountPercentage() {
        return 0.0;
    }

    public UUID getId() { return this.id; }
    protected  void setId(UUID id) {
        this.id = id != null ? id : UUID.randomUUID();
    }

    public String getName() { return this.name; }
    protected void setName(String name) {
        this.name = name;
    }

    public List<Affiliate> getAffiliations() {
        return this.affiliates;
    }
    public void addAffiliation(Affiliate affiliate) {
        this.affiliates.add(affiliate);
    }

}
