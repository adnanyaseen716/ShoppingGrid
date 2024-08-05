package pk.org.cas.shoppinggrid.Profile;

import java.util.Objects;

public class ProductModel {
    private String productName;
    private String productPrice;
    private int productQuantity;
    private String productImagePath;
    private String productDescription;
    private String productID;
    private String productColor;

    public ProductModel(String productName, String productPrice, int productQuantity, String productImagePath, String productDescription, String productID, String productColor) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.productImagePath = productImagePath;
        this.productDescription = productDescription;
        this.productID = productID;
        this.productColor = productColor;
    }

    public ProductModel() {
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getProductImagePath() {
        return productImagePath;
    }

    public void setProductImagePath(String productImagePath) {
        this.productImagePath = productImagePath;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductModel that = (ProductModel) o;
        return productQuantity == that.productQuantity && Objects.equals(productName, that.productName) && Objects.equals(productPrice, that.productPrice) && Objects.equals(productImagePath, that.productImagePath) && Objects.equals(productDescription, that.productDescription) && Objects.equals(productID, that.productID) && Objects.equals(productColor, that.productColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, productPrice, productQuantity, productImagePath, productDescription, productID, productColor);
    }

    @Override
    public String toString() {
        return "ProductModel{" +
                "productName='" + productName + '\'' +
                ", productPrice='" + productPrice + '\'' +
                ", productQuantity=" + productQuantity +
                ", productImagePath='" + productImagePath + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", productID='" + productID + '\'' +
                ", productColor='" + productColor + '\'' +
                '}';
    }
}
