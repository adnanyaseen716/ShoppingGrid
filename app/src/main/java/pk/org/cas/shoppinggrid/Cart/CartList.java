package pk.org.cas.shoppinggrid.Cart;

import java.util.Objects;

public class CartList {

    public String title;
    public String brand_name;
    public String quantity;
    public String price;
    public int image;

    public CartList() {
    }

    public CartList(String title, String brand_name, String quantity, String price, int image) {
        this.title = title;
        this.brand_name = brand_name;
        this.quantity = quantity;
        this.price = price;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CartList cartList = (CartList) o;
        return image == cartList.image && Objects.equals(title, cartList.title) && Objects.equals(brand_name, cartList.brand_name) && Objects.equals(quantity, cartList.quantity) && Objects.equals(price, cartList.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, brand_name, quantity, price, image);
    }

    @Override
    public String toString() {
        return "CartList{" +
                "title='" + title + '\'' +
                ", brand_name='" + brand_name + '\'' +
                ", quantity='" + quantity + '\'' +
                ", price='" + price + '\'' +
                ", image=" + image +
                '}';
    }
}
