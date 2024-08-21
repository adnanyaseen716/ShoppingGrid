package pk.org.cas.shoppinggrid.Home;

import java.util.Objects;

public class Category {
    private int categoryId;
    private String categoryName;
    private int categoryImageId;

    public Category() {
    }

    public Category(int categoryId, String categoryName, int categoryImageId) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryImageId = categoryImageId;
    }


    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getCategoryImageId() {
        return categoryImageId;
    }

    public void setCategoryImageId(int categoryImageId) {
        this.categoryImageId = categoryImageId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Category)) return false;
        Category category = (Category) o;
        return getCategoryId() == category.getCategoryId() && getCategoryImageId() == category.getCategoryImageId() && Objects.equals(getCategoryName(), category.getCategoryName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCategoryId(), getCategoryName(), getCategoryImageId());
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", categoryImageId=" + categoryImageId +
                '}';
    }
}


