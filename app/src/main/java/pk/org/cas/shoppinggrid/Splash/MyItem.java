package pk.org.cas.shoppinggrid.Splash;


import java.util.Objects;

public class MyItem {
    private String title;
    private double price;
    private double rating;
    private int imageResourceId;

    // Constructor
    public MyItem(String title, double price, double rating, int imageResourceId) {
        this.title = title;
        this.price = price;
        this.rating = rating;}
    public  MyItem (){}
    // Getter Setter

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyItem)) return false;
        MyItem myItem = (MyItem) o;
        return Double.compare(getPrice(), myItem.getPrice()) == 0 && getRating() == myItem.getRating() && getImageResourceId() == myItem.getImageResourceId() && Objects.equals(getTitle(), myItem.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getPrice(), getRating(), getImageResourceId());
    }

    @Override
    public String toString() {
        return "MyItem{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                ", imageResourceId=" + imageResourceId +
                '}';
    }
}