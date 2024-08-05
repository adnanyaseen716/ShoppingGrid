package pk.org.cas.shoppinggrid.Profile;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import pk.org.cas.shoppinggrid.R;

public class OrdersViewAdaptor extends RecyclerView.Adapter<OrdersViewAdaptor.OdersViewHolder>{
    private List<OrdersModel> ordersModelList;
    private OnBtnClickListener onBtnClickListener;
    public void setOnBtnClickListener(OnBtnClickListener onBtnClickListener) {
        this.onBtnClickListener = onBtnClickListener;
    }

    public OrdersViewAdaptor(List<OrdersModel> ordersModelList) {
        this.ordersModelList = ordersModelList;
    }

    @NonNull
    @Override
    public OdersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.orders_recycler_view,parent,false);
        return new OdersViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OdersViewHolder holder, int position) {
        OrdersModel ordersModel = ordersModelList.get(position);
        holder.tvOrderNo.setText(String.valueOf(ordersModel.getOrderNo()));
        holder.tvDate.setText(ordersModel.getDate());
        holder.tvOrderAmount.setText(ordersModel.getTotalAmount());
        holder.tvTrackingNo.setText(ordersModel.getTrackingNo());
        holder.tvOrdersCoun.setText(ordersModel.getQuantity());
        holder.tvOrderStatus.setText(ordersModel.isDelivered() ? "Delivered" : "Not Delivered");

    }

    @Override
    public int getItemCount() {
        return ordersModelList.size();
    }

    class OdersViewHolder extends  RecyclerView.ViewHolder{
        //tvOrderStatus is Delievered or not in model class its is Delivered
        TextView tvOrderNo,tvDate,tvOrderAmount, tvTrackingNo,tvOrdersCoun, tvOrderStatus;
        Button btnDetails;

        public OdersViewHolder(@NonNull View itemView) {
            super(itemView);
            tvOrderNo = itemView.findViewById(R.id.tvOrderNo);
            tvDate = itemView.findViewById(R.id.tvDate);
            tvOrderAmount = itemView.findViewById(R.id.tvOrderAmount);
            tvTrackingNo = itemView.findViewById(R.id.tvTrackingNo);
            tvOrdersCoun = itemView.findViewById(R.id.tvOrdersCount);
            tvOrderStatus = itemView.findViewById(R.id.tvOrderStatus);

            btnDetails = itemView.findViewById(R.id.btnDetails);

            btnDetails.setOnClickListener(view -> {
                if(onBtnClickListener != null){
                    onBtnClickListener.onBtnClick(btnDetails,getAdapterPosition());
                }
            });
        }
    }
    interface OnBtnClickListener {
        void onBtnClick(Button button, int position);
    }
}
