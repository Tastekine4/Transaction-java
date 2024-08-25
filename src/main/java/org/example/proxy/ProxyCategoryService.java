package org.example.proxy;

public class ProxyCategoryService implements CategoryService {

    private CategoryServiceImpl categoryServiceImpl;

    public ProxyCategoryService(){
        System.out.println("Proxy Category Service");
    }

    public void create() {
        if (categoryServiceImpl == null) {
            categoryServiceImpl = new CategoryServiceImpl();
        }
        try {
            System.out.println("Get Transaction");
            categoryServiceImpl.create();
        } catch (Exception e){
            // when error occur we can write our rollback logic
            System.out.println("Rollback Transaction");
        }
        // While there is no error in the upper code we can commit here
        System.out.println("Commit Transaction");
    }
}
