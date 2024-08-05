package pk.org.cas.shoppinggrid.Home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import pk.org.cas.shoppinggrid.R;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder>{
    List<Product> productList;
    private OnItemClickListener onItemClickListener;

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public ProductAdapter(List<Product> productList) {
        this.productList = productList;
    }


    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_view_product, parent, false);
        return new ProductViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Product product = productList.get(position);
        holder.ivProductImage.setImageResource(product.getProductImageId());
        holder.tvProductName.setText(product.getProductName());
        holder.tvProductPrice.setText(String.valueOf(product.getProductPrice()));
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder {
        ImageView ivProductImage;
        TextView tvProductName, tvProductPrice, tvProductRating;
        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            ivProductImage = itemView.findViewById(R.id.ivProduct);
            tvProductName = itemView.findViewById(R.id.tvProductName);
            tvProductPrice = itemView.findViewById(R.id.tvProductPrice);
            tvProductRating = itemView.findViewById(R.id.tvProductRating);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(onItemClickListener != null){
                        int position = getAdapterPosition();
                        onItemClickListener.onItemClick(ProductViewHolder.this, position);
                    }
                }
            });
        }
    }

    public interface OnItemClickListener{
        void onItemClick(ProductViewHolder holder, int position);
    }
}
