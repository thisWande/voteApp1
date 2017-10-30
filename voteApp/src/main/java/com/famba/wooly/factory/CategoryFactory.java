package com.famba.wooly.factory;

import com.famba.wooly.domain.Category;
import com.famba.wooly.utility.KeyGenerator;

/**
 * Created by 213330482 on 9/7/2017.
 */
public class CategoryFactory {
    public static Category buildCategory(String candidate_id, String cat_name, String candidate_name, String cat_description){
    Category category = new Category.Builder()
            .cat_id(KeyGenerator.getEntityId())
            .candidate_id(candidate_id)
            .cat_name(cat_name)
            .candidate_name(candidate_name)
            .cat_description(cat_description)
            .build();
        return category;
    }
}
