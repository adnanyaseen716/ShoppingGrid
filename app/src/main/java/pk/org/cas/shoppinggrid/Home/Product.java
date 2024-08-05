package pk.org.cas.shoppinggrid.Home;

import java.util.Objects;

public class Product {
    private String productName;
    private double productPrice;
    private double productRating;
    private int productImageId;

    public Product() {
    }

    public Product(String productName, double productPrice, double productRating, int productImageId) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productRating = productRating;
        this.productImageId = productImageId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getProductRating() {
        return productRating;
    }

    public void setProductRating(double productRating) {
        this.productRating = productRating;
    }

    public int getProductImageId() {
        return productImageId;
    }

    public void setProductImageId(int productImageId) {
        this.productImageId = productImageId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Double.compare(getProductPrice(), product.getProductPrice()) == 0 && Double.compare(getProductRating(), product.getProductRating()) == 0 && getProductImageId() == product.getProductImageId() && Objects.equals(getProductName(), product.getProductName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductName(), getProductPrice(), getProductRating(), getProductImageId());
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productRating=" + productRating +
                ", productImageId=" + productImageId +
                '}';
    }
}
