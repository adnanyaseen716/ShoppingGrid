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

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.NotificationViewHolder>{

    List<Notification> notificationList;
    OnItemClickListener onItemClickListener;

    public void setOnItemClickListener(OnItemClickListener onItemClickListener){
        this.onItemClickListener = onItemClickListener;
    }

    public NotificationAdapter(List<Notification> notificationList) {
        this.notificationList = notificationList;
    }

    @NonNull
    @Override
    public NotificationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_view_notification, null);
        return new NotificationViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull NotificationViewHolder holder, int position) {
        Notification notification = notificationList.get(position);
        holder.tvTitleNot.setText(notification.getTitle());
        holder.tvMessageNot.setText(notification.getMessage());
        holder.tvTimeNot.setText(notification.getDate());
        holder.ivImageNot.setImageResource(notification.getLogoId());
    }

    @Override
    public int getItemCount() {
        return notificationList.size();
    }

    class NotificationViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitleNot, tvMessageNot, tvTimeNot;
        ImageView ivImageNot;
        public NotificationViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitleNot = itemView.findViewById(R.id.tvTitleNotification);
            tvMessageNot = itemView.findViewById(R.id.tvMessageNotification);
            tvTimeNot = itemView.findViewById(R.id.tvTime);
            ivImageNot = itemView.findViewById(R.id.ivImageNotification);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    onItemClickListener.onItemClick(NotificationViewHolder.this, position);
                }
            });
        }
    }

    interface OnItemClickListener{
        void onItemClick(NotificationViewHolder holder,  int position);
    }
}
