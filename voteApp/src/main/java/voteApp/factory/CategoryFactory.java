package voteApp.factory;

import voteApp.domain.Category;

import java.util.Map;

public class CategoryFactory {
    public static Category getCategory(Map<String, String> values){
        Category category = new Category.Builder()
                .cat_id(values.get("001"))
                .candidate_id(values.get("4545"))
                .cat_name(values.get("Campus President"))
                .candidate_name(values.get("Jacob Zuma"))
                .cat_description(values.get("This is an elections for campus only, may not have National impact"))
                .build();
        return category;
    }
}
