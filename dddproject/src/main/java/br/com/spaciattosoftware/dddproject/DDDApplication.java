package br.com.spaciattosoftware.dddproject;

import br.com.spaciattosoftware.dddproject.application.layer.context.affiliantion.usecases.CreateNewAffiliateServiceImpl;
import br.com.spaciattosoftware.dddproject.application.layer.context.affiliantion.usecases.CreateNewCategoryServiceImpl;
import br.com.spaciattosoftware.dddproject.domain.layer.conext.affiliation.entities.Affiliate;
import br.com.spaciattosoftware.dddproject.domain.layer.conext.affiliation.entities.Category;
import br.com.spaciattosoftware.dddproject.infrastructure.layer.PersistenceFactory;
import br.com.spaciattosoftware.dddproject.infrastructure.layer.context.affiliation.entities.AffiliatePersistenceEntity;
import br.com.spaciattosoftware.dddproject.infrastructure.layer.context.affiliation.repositories.AffiliatePersistenceRepository;
import br.com.spaciattosoftware.dddproject.infrastructure.layer.context.affiliation.repositories.CategoryPersistenceRepository;

public class DDDApplication {

    public static void main(String[] args) {

        PersistenceFactory persistenceFactory = new PersistenceFactory();

        try {

            CreateNewCategoryServiceImpl createNewCategoryService =
                    new CreateNewCategoryServiceImpl(
                            persistenceFactory.getRepository(CategoryPersistenceRepository.class));

            CreateNewAffiliateServiceImpl createNewAffiliateService =
                    new CreateNewAffiliateServiceImpl(persistenceFactory
                            .getRepository(AffiliatePersistenceRepository.class));

            Category c1 = Category.createNew(null, "Test 1");
            Affiliate a1 = Affiliate.createNew(null, "Test", "test@test.com", c1);
            c1.addAffiliation(a1);
            createNewCategoryService.execute(c1);
            createNewAffiliateService.execute(a1);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
