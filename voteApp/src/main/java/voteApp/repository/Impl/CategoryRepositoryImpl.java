package voteApp.repository.Impl;

import voteApp.domain.Category;
import voteApp.repository.CategoryRepository;

import java.util.HashMap;
import java.util.Map;

public class CategoryRepositoryImpl implements CategoryRepository {
   private static CategoryRepositoryImpl repository = null;
   private Map<String, Category> categoryTable;
    private CategoryRepositoryImpl(){
        categoryTable = new HashMap<String, Category>();
    }

    public static CategoryRepositoryImpl getInstance(){
        if(repository == null)
            repository = new CategoryRepositoryImpl();
        return repository;
    }

    public Category create(Category category) {
        categoryTable.put(category.getCat_id(),category);
        Category savedCategory = categoryTable.get(category.getCat_id());
        return savedCategory;
    }

    public Category read(String id) {
        Category category = categoryTable.get(id);
        return category;
    }

    public Category update(Category category) {
        categoryTable.put(category.getCat_id(),category);
        Category savedCategory = categoryTable.get(category.getCat_id());
        return savedCategory;
    }

    public void delete(String id) {
        categoryTable.remove(id);
    }
}
