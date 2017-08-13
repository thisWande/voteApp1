package voteApp.service;

import voteApp.domain.Category;

public interface CategoryService {
    Category create(Category category);
    Category read(String id);
    Category update(Category category);
    void delete(String id);
}
