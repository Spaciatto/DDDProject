package br.com.spaciattosoftware.dddproject.domain.layer.conext.affiliation.services;

import br.com.spaciattosoftware.dddproject.domain.layer.conext.affiliation.entities.Affiliate;

public interface CreateNewAffiliationService {

    void execute(Affiliate affiliate);

}
