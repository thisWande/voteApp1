package voteApp.service.Impl;

import voteApp.domain.Category;
import voteApp.repository.CategoryRepository;
import voteApp.repository.Impl.CategoryRepositoryImpl;
import voteApp.service.CategoryService;

public class CategoryServiceImpl implements CategoryService {

    private static CategoryServiceImpl service = null;
    CategoryRepository repository = CategoryRepositoryImpl.getInstance();
    public static CategoryServiceImpl getInstance(){
        if(service == null)
            service = new CategoryServiceImpl();
        return service;
    }

    public Category create(Category category) {
        return repository.create(category);
    }

    public Category read(String id) {
        return repository.read(id);
    }

    public Category update(Category category) {
        return repository.update(category);
    }

    public void delete(String id) {
        repository.delete(id);
    }
}
