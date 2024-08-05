package pk.org.cas.shoppinggrid.Profile;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import pk.org.cas.shoppinggrid.R;

public class Orders extends AppCompatActivity {
    Button btnBack;
    RecyclerView rvOrders;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders);

        btnBack = findViewById(R.id.btnBack);
        rvOrders = findViewById(R.id.rvOrder);

        btnBack.setOnClickListener(view -> {
            finish();
        });

        OrdersViewAdaptor ordersViewAdaptor = new OrdersViewAdaptor(generateOrdersList());

        rvOrders.setAdapter(ordersViewAdaptor);
        rvOrders.setLayoutManager(new LinearLayoutManager(this));
        rvOrders.setHasFixedSize(true);
        ordersViewAdaptor.setOnBtnClickListener((button, position) -> {
                Intent intent = new Intent(Orders.this,OrderDetails.class);
                startActivity(intent);
        });

    }
    public List<OrdersModel> generateOrdersList(){
        List<OrdersModel> list= new ArrayList<>();
        list.add(new OrdersModel(74743483,"djne345h453","3","655$",true,"01-08-2024","usa","cash","good","fast"));
        list.add(new OrdersModel(74743483,"djne345h453","3","655$",true,"01-08-2024","usa","cash","good","fast"));
        list.add(new OrdersModel(74743483,"djne345h453","3","655$",true,"01-08-2024","usa","cash","good","fast"));
        list.add(new OrdersModel(74743483,"djne345h453","3","655$",true,"01-08-2024","usa","cash","good","fast"));
        list.add(new OrdersModel(74743483,"djne345h453","3","655$",true,"01-08-2024","usa","cash","good","fast"));
        list.add(new OrdersModel(74743483,"djne345h453","3","655$",true,"01-08-2024","usa","cash","good","fast"));
        return list;
    }
}

