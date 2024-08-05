package pk.org.cas.shoppinggrid.Splash;

import java.util.Objects;

public class NewOrder {
    private String titleOfOrder;
    private String dateOfOrderPlaced;
    private String orderId;
    private double priceOfOrder;
    private int orderQuantity;
    private int imageResourceId;
    private String orderStatus;

    // Constructor

    public NewOrder() {
    }

    public NewOrder(String titleOfOrder, String dateOfOrderPlaced,
                    String orderId, String orderStatus, double priceOfOrder, int orderQuantity, int imageResourceId) {
        this.titleOfOrder = titleOfOrder;
        this.orderStatus = orderStatus;
        this.dateOfOrderPlaced = dateOfOrderPlaced;
        this.orderId = orderId;
        this.priceOfOrder = priceOfOrder;
        this.orderQuantity = orderQuantity;
        this.imageResourceId = imageResourceId;
    }

    public String getTitleOfOrder() {
        return titleOfOrder;
    }

    public void setTitleOfOrder(String titleOfOrder) {
        this.titleOfOrder = titleOfOrder;
    }

    public String getDateOfOrderPlaced() {
        return dateOfOrderPlaced;
    }

    public void setDateOfOrderPlaced(String dateOfOrderPlaced) {
        this.dateOfOrderPlaced = dateOfOrderPlaced;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public double getPriceOfOrder() {
        return priceOfOrder;
    }

    public void setPriceOfOrder(double priceOfOrder) {
        this.priceOfOrder = priceOfOrder;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
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
        if (!(o instanceof NewOrder)) return false;
        NewOrder newOrder = (NewOrder) o;
        return getPriceOfOrder() == newOrder.getPriceOfOrder() && getOrderStatus() == newOrder.getOrderStatus() && getOrderQuantity() == newOrder.getOrderQuantity() && getImageResourceId() == newOrder.getImageResourceId() && Objects.equals(getTitleOfOrder(), newOrder.getTitleOfOrder()) && Objects.equals(getDateOfOrderPlaced(), newOrder.getDateOfOrderPlaced()) && Objects.equals(getOrderId(), newOrder.getOrderId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitleOfOrder(), getDateOfOrderPlaced(), getOrderId(), getOrderStatus(), getPriceOfOrder(), getOrderQuantity(), getImageResourceId());
    }

    @Override
    public String toString() {
        return "NewOrder{" +
                "titleOfOrder='" + titleOfOrder + '\'' +
                ", dateOfOrderPlaced='" + dateOfOrderPlaced + '\'' +
                ", orderId='" + orderId + '\'' +
                ", priceOfOrder=" + priceOfOrder +
                ", orderQuantity=" + orderQuantity +
                ", imageResourceId=" + imageResourceId +
                ", orderStatus='" + orderStatus + '\'' +
                '}';
    }

}
