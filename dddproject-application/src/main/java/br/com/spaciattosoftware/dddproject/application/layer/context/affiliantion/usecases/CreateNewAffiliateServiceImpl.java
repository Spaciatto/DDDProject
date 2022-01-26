package br.com.spaciattosoftware.dddproject.application.layer.context.affiliantion.usecases;

import br.com.spaciattosoftware.dddproject.domain.layer.conext.affiliation.entities.Affiliate;
import br.com.spaciattosoftware.dddproject.domain.layer.conext.affiliation.repositories.AffiliateRepository;
import br.com.spaciattosoftware.dddproject.domain.layer.conext.affiliation.services.CreateNewAffiliationService;

public class CreateNewAffiliateServiceImpl implements CreateNewAffiliationService {

    private final AffiliateRepository affiliateRepository;

    public CreateNewAffiliateServiceImpl(AffiliateRepository affiliateRepository) {
        this.affiliateRepository = affiliateRepository;
    }

    @Override
    public void execute(Affiliate affiliate) {
        this.affiliateRepository.add(affiliate);
    }
}
