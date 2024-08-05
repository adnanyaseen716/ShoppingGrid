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

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.itemViewHolder> {

    private List<MyItem> myItems;
    public ItemAdapter (List<MyItem> myItems){
        this.myItems = myItems;
    }
    //    Set OnItemClickListener for the adapter
    private OnItemClickListener onItemClickListener;
    public void setOnItemClickListener(OnItemClickListener onItemClickListener){
        this.onItemClickListener = onItemClickListener;
    }
    @NonNull
    @Override
    public itemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.column_view_my_item_seller,null);
        return new itemViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull itemViewHolder holder, int position) {
        MyItem myItem = myItems.get(position);
        holder.ivMyItems.setImageResource(myItem.getImageResourceId());
        holder.tvMyItemsTitle.setText(myItem.getTitle());
        holder.tvMyItemsPrice.setText(String.valueOf(myItem.getPrice()));
        holder.tvMyItemsRating.setText(String.valueOf(myItem.getRating()));
    }

    @Override
    public int getItemCount() {
        return myItems.size();
    }

    class itemViewHolder extends RecyclerView.ViewHolder {
        CardView cvMyItems;
        ImageView ivMyItems;
        TextView tvMyItemsTitle,tvMyItemsPrice,tvMyItemsRating;
        public itemViewHolder(@NonNull View itemView) {
            super(itemView);
            ivMyItems = itemView.findViewById(R.id.ivMyItems);
            tvMyItemsTitle = itemView.findViewById(R.id.tvMyItemsTitle);
            tvMyItemsPrice = itemView.findViewById(R.id.tvMyItemsPrice);
            tvMyItemsRating = itemView.findViewById(R.id.tvMyItemsRating);
            cvMyItems = itemView.findViewById(R.id.cvMyItems);
            cvMyItems.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (onItemClickListener != null){
                        int position = getAdapterPosition();
                        onItemClickListener.onItemClick(itemViewHolder.this,cvMyItems,position);
                    }
                }
            });
        }
    }
    interface OnItemClickListener {
        void onItemClick(itemViewHolder itemViewHolder, CardView cardView, int position);
    }
}


