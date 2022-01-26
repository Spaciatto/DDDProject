package br.com.spaciattosoftware.dddproject.domain.layer.conext.affiliation.services;

import br.com.spaciattosoftware.dddproject.domain.layer.conext.affiliation.entities.Category;

public interface CreateNewCategoryService {

    void execute(Category category);

}
