package pk.org.cas.shoppinggrid.Home;

import java.util.Objects;

public class Notification {
    String title, message, date;
    int logoId;

    public Notification() {
    }

    public Notification(String title, String message, String date, int logoId) {
        this.title = title;
        this.message = message;
        this.date = date;
        this.logoId = logoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getLogoId() {
        return logoId;
    }

    public void setLogoId(int logoId) {
        this.logoId = logoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Notification)) return false;
        Notification that = (Notification) o;
        return getLogoId() == that.getLogoId() && Objects.equals(getTitle(), that.getTitle()) && Objects.equals(getMessage(), that.getMessage()) && Objects.equals(getDate(), that.getDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getMessage(), getDate(), getLogoId());
    }

    @Override
    public String toString() {
        return "Notification{" +
                "title='" + title + '\'' +
                ", message='" + message + '\'' +
                ", date='" + date + '\'' +
                ", logoId=" + logoId +
                '}';
    }
}
