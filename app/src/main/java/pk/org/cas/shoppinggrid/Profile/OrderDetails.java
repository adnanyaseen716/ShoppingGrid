package pk.org.cas.shoppinggrid.Profile;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import pk.org.cas.shoppinggrid.R;

public class OrderDetails extends AppCompatActivity {
    RecyclerView rvProducts;
    TextView tvOrderNo, tvDate, tvTrackingNo, tvOrderCount, tvOrderStatus, tvDeliveryMethod, tvShippingAddress ,tvPaymentMethod, tvTotalAmount;
    Button btnReOrder, btnLeaveReview, btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details);

        rvProducts = findViewById(R.id.rvProducts);

        tvOrderNo = findViewById(R.id.tvOrderNo);
        tvDate = findViewById(R.id.tvDate);
        tvTrackingNo = findViewById(R.id.tvTrackingNo);
        tvOrderCount = findViewById(R.id.tvOrderCount);
        tvOrderStatus = findViewById(R.id.tvOrderStatus);
        tvDeliveryMethod = findViewById(R.id.tvDeliveryMethod);
        tvShippingAddress = findViewById(R.id.tvShippingAddress);
        tvPaymentMethod = findViewById(R.id.tvPaymentMethod);
        tvTotalAmount = findViewById(R.id.tvTotalAmount);

        btnReOrder = findViewById(R.id.btnReOrder);
        btnLeaveReview = findViewById(R.id.btnLeaveReview);
        btnBack = findViewById(R.id.btnBack);

        btnBack.setOnClickListener(view ->{
            finish();
        });

        rvProducts.setAdapter(new ProductViewAdaptor(getList()));
        rvProducts.setLayoutManager(new LinearLayoutManager(OrderDetails.this));
        rvProducts.setHasFixedSize(true);
    }

    private List<ProductModel> getList(){
        List<ProductModel> productModelList = new ArrayList<>(20);
        productModelList.add(new ProductModel("Pull Over","51$",3,"https://plus.unsplash.com/premium_photo-1673356301535-2cc45bcc79e4?q=80&w=1887&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D","Shirt","id","Grey"));
        productModelList.add(new ProductModel("Pull Over","51$",3,"https://plus.unsplash.com/premium_photo-1673356301535-2cc45bcc79e4?q=80&w=1887&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D","Shirt","id","Grey"));
        productModelList.add(new ProductModel("Pull Over","51$",3,"https://plus.unsplash.com/premium_photo-1673356301535-2cc45bcc79e4?q=80&w=1887&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D","Shirt","id","Grey"));
        productModelList.add(new ProductModel("Pull Over","51$",3,"https://plus.unsplash.com/premium_photo-1673356301535-2cc45bcc79e4?q=80&w=1887&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D","Shirt","id","Grey"));
        return productModelList;
    }
}