package org.example.proxy;

public class Test {
    public static void main(String[] args) {
        CategoryService categoryService = new ProxyCategoryService();
        categoryService.create();
    }
}
