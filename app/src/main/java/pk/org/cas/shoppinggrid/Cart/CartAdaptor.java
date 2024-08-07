package pk.org.cas.shoppinggrid.Cart;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import pk.org.cas.shoppinggrid.R;

public class CartAdaptor extends RecyclerView.Adapter<CartAdaptor.CartAdaptorHolder>{
    List<CartList> listCart;
    public CartAdaptor(List<CartList> listCart) {
        this.listCart = listCart;
    }

    @NonNull
    @Override
    public CartAdaptorHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_cart, parent, false);
        return new CartAdaptorHolder(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull CartAdaptorHolder holder, int position) {
        CartList cartList = listCart.get(position);
        holder.imageView.setImageResource(cartList.getImage());
        holder.tv_title_1.setText(cartList.getTitle());
        holder.tv_brand_name_1.setText(cartList.getBrand_name());
        holder.tv_quantity_1.setText(cartList.getQuantity());
        holder.tv_price.setText(cartList.getPrice());
    }

    @Override
    public int getItemCount() {
        return listCart.size();
    }

    class CartAdaptorHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView tv_title_1, tv_brand_name_1, tv_quantity_1 , tv_price;

        public CartAdaptorHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            tv_title_1 = itemView.findViewById(R.id.tv_title_1);
            tv_brand_name_1 = itemView.findViewById(R.id.brand_name_1);
            tv_quantity_1 = itemView.findViewById(R.id.tv_quantity_1);
            tv_price = itemView.findViewById(R.id.tv_price_1);

        }
    }
}





