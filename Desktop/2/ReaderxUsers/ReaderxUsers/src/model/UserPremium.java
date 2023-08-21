package model;

import java.util.Calendar;

public class UserPremium extends User {

    CategoryPremium categoryPremium;

    public UserPremium(String id, String name, String nickname, Calendar singUpDate, CategoryPremium categoryPremium) {
        super(id, name, nickname, singUpDate);

        this.categoryPremium = categoryPremium;
    }

    public CategoryPremium getCategoryPremium() {
        return categoryPremium;
    }

    public void setCategoryPremium(CategoryPremium categoryPremium) {
        this.categoryPremium = categoryPremium;
    }

    
}
