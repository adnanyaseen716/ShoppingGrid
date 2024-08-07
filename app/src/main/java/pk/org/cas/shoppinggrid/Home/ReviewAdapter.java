package pk.org.cas.shoppinggrid.Home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import pk.org.cas.shoppinggrid.R;

public class ReviewAdapter extends RecyclerView.Adapter<ReviewAdapter.ReviewViewHolder> {
    List<Review> reviewList;

    public ReviewAdapter(List<Review> reviewList) {
        this.reviewList = reviewList;
    }

    @NonNull
    @Override
    public ReviewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_view_review, parent, false);
        return new ReviewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ReviewViewHolder holder, int position) {
        Review review = reviewList.get(position);
        holder.tvUserName.setText(review.getReviewUserName());
        holder.tvDate.setText(review.getReviewDate());
        holder.tvContent.setText(review.getReviewContent());
        holder.ivUserImage.setImageResource(review.getReviewUserImage());
        holder.ratingBar.setRating(review.getReviewRatingBar());
    }

    @Override
    public int getItemCount() {
        return reviewList.size();
    }


    class ReviewViewHolder extends RecyclerView.ViewHolder {
        TextView tvUserName;
        RatingBar ratingBar;
        TextView tvDate;
        TextView tvContent;
        ImageView ivUserImage;

        public ReviewViewHolder(@NonNull View itemView) {
            super(itemView);
            tvUserName = itemView.findViewById(R.id.tvReviewUserName);
            ratingBar = itemView.findViewById(R.id.ratingBarRv);
            tvDate = itemView.findViewById(R.id.tvReviewDate);
            tvContent = itemView.findViewById(R.id.tvReviewContent);
            ivUserImage = itemView.findViewById(R.id.ivUserImageReview);

        }
    }
}
