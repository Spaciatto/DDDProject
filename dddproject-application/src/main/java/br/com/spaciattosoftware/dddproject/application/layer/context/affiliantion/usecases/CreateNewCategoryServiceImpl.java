package br.com.spaciattosoftware.dddproject.application.layer.context.affiliantion.usecases;

import br.com.spaciattosoftware.dddproject.domain.layer.conext.affiliation.entities.Category;
import br.com.spaciattosoftware.dddproject.domain.layer.conext.affiliation.repositories.CategoryRepository;
import br.com.spaciattosoftware.dddproject.domain.layer.conext.affiliation.services.CreateNewCategoryService;

public class CreateNewCategoryServiceImpl implements CreateNewCategoryService {

    private final CategoryRepository categoryRepository;

    public CreateNewCategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void execute(Category category) {
        categoryRepository.add(category);
    }
}
