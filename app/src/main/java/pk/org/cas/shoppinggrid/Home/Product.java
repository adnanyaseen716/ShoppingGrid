package pk.org.cas.shoppinggrid.Home;

import java.util.Objects;

public class Product {
    private long productId;
    private String productName;
    private String productDescription;
    private long productPrice;
    private int productImageId;
    private String productCategory;
    private double productRating;
    private int productStock;


    public Product() {
    }

    public Product(long productId, String productName, String productDescription, long productPrice, int productImageId, String productCategory, double productRating, int productStock) {
        this.productId = productId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.productImageId = productImageId;
        this.productCategory = productCategory;
        this.productRating = productRating;
        this.productStock = productStock;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public long getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(long productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductImageId() {
        return productImageId;
    }

    public void setProductImageId(int productImageId) {
        this.productImageId = productImageId;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public double getProductRating() {
        return productRating;
    }

    public void setProductRating(double productRating) {
        this.productRating = productRating;
    }

    public int getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return getProductId() == product.getProductId() && Double.compare(getProductPrice(), product.getProductPrice()) == 0 && getProductImageId() == product.getProductImageId() && Double.compare(getProductRating(), product.getProductRating()) == 0 && getProductStock() == product.getProductStock() && Objects.equals(getProductName(), product.getProductName()) && Objects.equals(getProductDescription(), product.getProductDescription()) && Objects.equals(getProductCategory(), product.getProductCategory());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductId(), getProductName(), getProductDescription(), getProductPrice(), getProductImageId(), getProductCategory(), getProductRating(), getProductStock());
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", productPrice=" + productPrice +
                ", productImageId=" + productImageId +
                ", productCategory='" + productCategory + '\'' +
                ", productRating=" + productRating +
                ", productStock=" + productStock +
                '}';
    }
}
