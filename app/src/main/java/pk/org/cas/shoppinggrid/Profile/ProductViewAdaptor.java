package pk.org.cas.shoppinggrid.Profile;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import pk.org.cas.shoppinggrid.R;

public class ProductViewAdaptor extends RecyclerView.Adapter<ProductViewAdaptor.ProductViewHolder>{
    private List<ProductModel> productModelList;

    public ProductViewAdaptor(List<ProductModel> productModelList) {
        this.productModelList = productModelList;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_rv_view, parent, false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        ProductModel productModel = productModelList.get(position);
        holder.tvProductName.setText(productModel.getProductName());
        holder.tvProductDesc.setText(productModel.getProductDescription());
        holder.tvProductColor.setText(productModel.getProductColor());
        holder.tvProductUnits.setText(String.valueOf(productModel.getProductQuantity()));
        holder.tvProductPrice.setText(productModel.getProductPrice());
    }

    @Override
    public int getItemCount() {
        return productModelList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {
        ImageView ivProductImage;
        TextView tvProductName, tvProductDesc, tvProductColor, tvProductUnits, tvProductPrice;
        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            ivProductImage = itemView.findViewById(R.id.ivProductImage);
            tvProductName = itemView.findViewById(R.id.tvProductName);
            tvProductDesc = itemView.findViewById(R.id.tvProductDesc);
            tvProductColor = itemView.findViewById(R.id.tvProductColor);
            tvProductUnits = itemView.findViewById(R.id.tvProductUnits);
            tvProductPrice = itemView.findViewById(R.id.tvProductPrice);
        }
    }
}
