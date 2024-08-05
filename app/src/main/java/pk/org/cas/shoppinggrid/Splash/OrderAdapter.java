package pk.org.cas.shoppinggrid.Splash;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import pk.org.cas.shoppinggrid.R;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.orderViewHolder> {
    private List<NewOrder> newOrders;
    private OnItemClickListener onItemClickListener;

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public OrderAdapter(List<NewOrder> newOrders) {
        this.newOrders = newOrders;
    }

    @NonNull
    @Override
    public orderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate the order_item layout and create a new ViewHolder
        View rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_view_order_seller, null);
        return new orderViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull orderViewHolder holder, int position) {
        // Bind data to the views in the ViewHolder
        NewOrder newOrder = newOrders.get(position);
        holder.ivNewOrders.setImageResource(newOrder.getImageResourceId());
        holder.tvTitleOfOrders.setText(newOrder.getTitleOfOrder());
        holder.tvDateOfOrdersPlaced.setText(newOrder.getDateOfOrderPlaced());
        holder.tvOrderStatus.setText(newOrder.getOrderStatus());
        holder.tvOrderId.setText(newOrder.getOrderId());
        holder.tvPriceOfOrders.setText(String.valueOf(newOrder.getPriceOfOrder()));
        holder.tvOrderQuantity.setText(String.valueOf(newOrder.getOrderQuantity()));
    }

    @Override
    public int getItemCount() {
        return newOrders.size();
    }

    class orderViewHolder extends RecyclerView.ViewHolder {
        // Define views in the order_item layout
        CardView cvNewOrders;
        ImageView ivNewOrders;
        TextView tvTitleOfOrders, tvDateOfOrdersPlaced, tvOrderId, tvPriceOfOrders, tvOrderQuantity, tvOrderStatus;


        public orderViewHolder(@NonNull View itemView) {
            // Initialize views in the order_item layout
            super(itemView);
            cvNewOrders = itemView.findViewById(R.id.cvNewOrders);
            ivNewOrders = itemView.findViewById(R.id.ivNewOrders);
            tvTitleOfOrders = itemView.findViewById(R.id.tvTitleOfOrders);
            tvDateOfOrdersPlaced = itemView.findViewById(R.id.tvDateOfOrdersPlaced);
            tvOrderId = itemView.findViewById(R.id.tvOrderId);
            tvOrderStatus = itemView.findViewById(R.id.tvOrderStatus);
            tvPriceOfOrders = itemView.findViewById(R.id.tvPriceOfOrders);
            tvOrderQuantity = itemView.findViewById(R.id.tvOrderQuantity);
            // Set click listener for the order item
            cvNewOrders.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (onItemClickListener != null) {
                        int position = getAdapterPosition();
                        onItemClickListener.onItemClick(orderViewHolder.this, cvNewOrders, position);
                    }
                }
            });
        }

    }

    interface OnItemClickListener {
        void onItemClick(orderViewHolder orderViewHolder, CardView cardView, int position);
    }

}
