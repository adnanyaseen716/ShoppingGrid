package pk.org.cas.shoppinggrid.Home;

import java.util.Objects;

public class Review {

    String reviewUserName;
    String reviewDate;
    String reviewContent;
    int reviewUserImage;
    float reviewRatingBar;


    public Review() {
    }

    public Review(String reviewUserName, String reviewDate, String reviewContent, int reviewUserImage, float reviewRatingBar) {
        this.reviewUserName = reviewUserName;
        this.reviewDate = reviewDate;
        this.reviewContent = reviewContent;
        this.reviewUserImage = reviewUserImage;
        this.reviewRatingBar = reviewRatingBar;
    }



    public String getReviewUserName() {
        return reviewUserName;
    }

    public void setReviewUserName(String reviewUserName) {
        this.reviewUserName = reviewUserName;
    }

    public String getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(String reviewDate) {
        this.reviewDate = reviewDate;
    }

    public String getReviewContent() {
        return reviewContent;
    }

    public void setReviewContent(String reviewContent) {
        this.reviewContent = reviewContent;
    }

    public int getReviewUserImage() {
        return reviewUserImage;
    }

    public void setReviewUserImage(int reviewUserImage) {
        this.reviewUserImage = reviewUserImage;
    }

    public float getReviewRatingBar() {
        return reviewRatingBar;
    }

    public void setReviewRatingBar(float reviewRatingBar) {
        this.reviewRatingBar = reviewRatingBar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Review that = (Review) o;
        return reviewUserImage == that.reviewUserImage && Objects.equals(reviewUserName, that.reviewUserName) && Objects.equals(reviewDate, that.reviewDate) && Objects.equals(reviewContent, that.reviewContent) && Objects.equals(reviewRatingBar, that.reviewRatingBar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reviewUserName, reviewDate, reviewContent, reviewUserImage, reviewRatingBar);
    }

    @Override
    public String toString() {
        return "ReviewAdapter{" +
                "reviewUserName='" + reviewUserName + '\'' +
                ", reviewDate='" + reviewDate + '\'' +
                ", reviewContent='" + reviewContent + '\'' +
                ", reviewUserImage=" + reviewUserImage +
                ", reviewRatingBar=" + reviewRatingBar +
                '}';
    }
}
