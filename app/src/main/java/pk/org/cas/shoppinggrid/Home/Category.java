package pk.org.cas.shoppinggrid.Home;

import java.util.Objects;

public class Category {
    private String categoryName;
    private int categoryImageId;
    private int categoryColorId;

    public Category() {
    }

    public Category(String categoryName, int categoryImageId, int categoryColorId) {
        this.categoryName = categoryName;
        this.categoryImageId = categoryImageId;
        this.categoryColorId = categoryColorId;
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

    public int getCategoryColorId() {
        return categoryColorId;
    }

    public void setCategoryColorId(int categoryColorId) {
        this.categoryColorId = categoryColorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Category)) return false;
        Category category = (Category) o;
        return getCategoryImageId() == category.getCategoryImageId() && getCategoryColorId() == category.getCategoryColorId() && Objects.equals(getCategoryName(), category.getCategoryName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCategoryName(), getCategoryImageId(), getCategoryColorId());
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryName='" + categoryName + '\'' +
                ", categoryImageId=" + categoryImageId +
                ", categoryColorId=" + categoryColorId +
                '}';
    }
}
