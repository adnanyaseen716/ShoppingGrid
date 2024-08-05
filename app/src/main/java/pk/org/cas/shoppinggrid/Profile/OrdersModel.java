package pk.org.cas.shoppinggrid.Profile;

import java.util.Objects;

public class OrdersModel {
    private int orderNo;
    private String trackingNo;
    private String quantity;
    private String totalAmount;
    private boolean isDelivered;
    private String date;
    private String ShippingAddress;
    private String PaymentMethod;
    private String Review;
    private String DeliveryMethod;

    // Constructor, getters, and setters

    public OrdersModel() {
    }

    public OrdersModel(int orderNo, String trackingNo, String quantity, String totalAmount, boolean isDelivered, String date, String shippingAddress, String paymentMethod, String review, String deliveryMethod) {
        this.orderNo = orderNo;
        this.trackingNo = trackingNo;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
        this.isDelivered = isDelivered;
        this.date = date;
        ShippingAddress = shippingAddress;
        PaymentMethod = paymentMethod;
        Review = review;
        DeliveryMethod = deliveryMethod;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public String getTrackingNo() {
        return trackingNo;
    }

    public void setTrackingNo(String trackingNo) {
        this.trackingNo = trackingNo;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public boolean isDelivered() {
        return isDelivered;
    }

    public void setDelivered(boolean delivered) {
        isDelivered = delivered;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getShippingAddress() {
        return ShippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        ShippingAddress = shippingAddress;
    }

    public String getPaymentMethod() {
        return PaymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        PaymentMethod = paymentMethod;
    }

    public String getReview() {
        return Review;
    }

    public void setReview(String review) {
        Review = review;
    }

    public String getDeliveryMethod() {
        return DeliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        DeliveryMethod = deliveryMethod;
    }

    // Other methods as needed

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdersModel that = (OrdersModel) o;
        return orderNo == that.orderNo && isDelivered == that.isDelivered && Objects.equals(trackingNo, that.trackingNo) && Objects.equals(quantity, that.quantity) && Objects.equals(totalAmount, that.totalAmount) && Objects.equals(date, that.date) && Objects.equals(ShippingAddress, that.ShippingAddress) && Objects.equals(PaymentMethod, that.PaymentMethod) && Objects.equals(Review, that.Review) && Objects.equals(DeliveryMethod, that.DeliveryMethod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderNo, trackingNo, quantity, totalAmount, isDelivered, date, ShippingAddress, PaymentMethod, Review, DeliveryMethod);
    }

    @Override
    public String toString() {
        return "OrdersModel{" +
                "orderNo=" + orderNo +
                ", trackingNo='" + trackingNo + '\'' +
                ", quantity='" + quantity + '\'' +
                ", totalAmount='" + totalAmount + '\'' +
                ", isDelivered=" + isDelivered +
                ", date='" + date + '\'' +
                ", ShippingAddress='" + ShippingAddress + '\'' +
                ", PaymentMethod='" + PaymentMethod + '\'' +
                ", Review='" + Review + '\'' +
                ", DeliveryMethod='" + DeliveryMethod + '\'' +
                '}';
    }
}
