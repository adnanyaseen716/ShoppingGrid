package pk.org.cas.shoppinggrid.Profile;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import pk.org.cas.shoppinggrid.R;

public class ProductReviewAdaptor extends RecyclerView.Adapter<ProductReviewAdaptor.ProductReviewViewHolder> {

    private List<ProductModel> productModelList;

    public ProductReviewAdaptor(List<ProductModel> productModelList) {
        this.productModelList = productModelList;
    }
    @NonNull
    @Override
    public ProductReviewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_reviews_rv_view, parent, false);
        return new ProductReviewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductReviewViewHolder holder, int position) {
        ProductModel productModel = productModelList.get(position);
        holder.tvProductName.setText(productModel.getProductName());
        holder.tvProductDescription.setText(productModel.getProductDescription());

    }

    @Override
    public int getItemCount() {
        return productModelList.size();
    }

    class ProductReviewViewHolder extends RecyclerView.ViewHolder {
        ImageView ivProductImage;
        TextView tvProductName, tvProductDescription;
        Button btnLeaveReview;
        public ProductReviewViewHolder(@NonNull View itemView) {
            super(itemView);

            ivProductImage = itemView.findViewById(R.id.ivProductImage);

            tvProductName = itemView.findViewById(R.id.tvProductName);
            tvProductDescription = itemView.findViewById(R.id.tvProductDescription);
            btnLeaveReview = itemView.findViewById(R.id.btnLeaveReview);
        }
    }
}
