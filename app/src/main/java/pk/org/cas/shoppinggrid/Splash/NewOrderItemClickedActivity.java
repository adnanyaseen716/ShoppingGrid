package pk.org.cas.shoppinggrid.Splash;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import pk.org.cas.shoppinggrid.R;

public class NewOrderItemClickedActivity extends AppCompatActivity {
    Button btnReadyToDispatch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_order_item_clicked);

//        bntClickEvent
        btnReadyToDispatch = findViewById(R.id.btnReadyToDispatch);
        btnReadyToDispatch.setOnClickListener(v -> {
            // Create an Intent to start the MyItemsActivity
            Toast.makeText(this, "My Items Activity", Toast.LENGTH_SHORT).show();
            Intent myItemsIntent = new Intent(NewOrderItemClickedActivity.this, MyItemSellerActivity.class);
            startActivity(myItemsIntent);
        });
    }
}