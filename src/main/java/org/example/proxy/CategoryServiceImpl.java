package org.example.proxy;

import org.springframework.transaction.annotation.Transactional;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CategoryServiceImpl implements CategoryService{

    @Override
    @Transactional
    public void create () {
        // CREATE CATEGORY
        System.out.println("Category Service");
    }
}
