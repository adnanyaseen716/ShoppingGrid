package pk.org.cas.shoppinggrid.Splash;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import pk.org.cas.shoppinggrid.R;

public class SellerNewOrderActivity extends AppCompatActivity {
    CardView cvNewOrders;
    RecyclerView rvNewOrders;
    ImageView ivNewOrders;
    TextView tvTitleOfOrders,tvDateOfOrdersPlaced,tvOrderId,tvPriceOfOrders,tvOrderQuantity;
    private List<NewOrder> newOrders;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_new_order);

        cvNewOrders = findViewById(R.id.cvNewOrders);
        tvTitleOfOrders = findViewById(R.id.tvTitleOfOrders);
        tvDateOfOrdersPlaced = findViewById(R.id.tvDateOfOrdersPlaced);
        tvOrderId = findViewById(R.id.tvOrderId);
        tvPriceOfOrders = findViewById(R.id.tvPriceOfOrders);
        tvOrderQuantity = findViewById(R.id.tvOrderQuantity);
        ivNewOrders = findViewById(R.id.ivNewOrders);
        rvNewOrders = findViewById(R.id.rvNewOrders);


        OrderAdapter orderAdapter= new OrderAdapter(generateData());
        rvNewOrders.setAdapter(orderAdapter);
        rvNewOrders.setHasFixedSize(true);
        rvNewOrders.setLayoutManager(new LinearLayoutManager(this));



        orderAdapter.setOnItemClickListener((orderViewHolder, cardView, position) -> {
            Toast.makeText(SellerNewOrderActivity.this, "Item Clicked", Toast.LENGTH_SHORT).show();
            Intent intentItemClick = new Intent( SellerNewOrderActivity.this,NewOrderItemClickedActivity.class);
            startActivity(intentItemClick);
        });

//        cvNewOrders.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Item Clicked", Toast.LENGTH_SHORT).show();
//                Intent intentItemClick = new Intent( MainActivity.this,ItemClickActivity.class);
//                startActivity(intentItemClick);
//            }
//        });
//        btnNext.setOnClickListener(view -> {
//            Toast.makeText(this, "Item Clicked", Toast.LENGTH_SHORT).show();
//            Intent intentItemClick = new Intent( MainActivity.this,ItemClickActivity.class);
//            startActivity(intentItemClick);
//        });

//        cvNewOrders.setOnClickListener(v -> {
        // Create an Intent to start the second activity
        // Replace "SecondActivity" with the name of your second activity class
        // You can pass data to the second activity using an Intent
        // For example:
        // Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        // intent.putExtra("key", "value");
        // Start the second activity
        //startActivity(intent);



    }
    public List<NewOrder> generateData(){
        List<NewOrder> newOrders = new ArrayList<>();
        newOrders.add(new NewOrder("Parachute bag best in rains and its quality is best it is ver easy to carry and its very comfortable","23 jun,10:34","TST11890","Pending",30090,135,R.drawable.tshirt));
        newOrders.add(new NewOrder("Parachute bag best in rains","23 jun,10:34","TST11890","Pending",30090,135,R.drawable.tshirt));
        newOrders.add(new NewOrder("Parachute bag best in rains","23 jun,10:34","TST11890","Pending",30090,135,R.drawable.tshirt));
        newOrders.add(new NewOrder("Parachute bag best in rains","23 jun,10:34","TST11890","Pending",30090,135,R.drawable.tshirt));
        newOrders.add(new NewOrder("Parachute bag best in rains","23 jun,10:34","TST11890","Pending",30090,135,R.drawable.tshirt));
        newOrders.add(new NewOrder("Parachute bag best in rains","23 jun,10:34","TST11890","Pending",30090,135,R.drawable.tshirt));
        newOrders.add(new NewOrder("Parachute bag best in rains","23 jun,10:34","TST11890","Pending",30090,135,R.drawable.tshirt));
        newOrders.add(new NewOrder("Parachute bag best in rains","23 jun,10:34","TST11890","Pending",30090,135,R.drawable.tshirt));
        newOrders.add(new NewOrder("Parachute bag best in rains","23 jun,10:34","TST11890","Pending",30090,135,R.drawable.tshirt));
        newOrders.add(new NewOrder("Parachute bag best in rains","23 jun,10:34","TST11890","Pending",30090,135,R.drawable.tshirt));
        return newOrders;
    }

}