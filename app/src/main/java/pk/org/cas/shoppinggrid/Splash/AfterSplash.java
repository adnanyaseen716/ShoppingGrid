package pk.org.cas.shoppinggrid.Splash;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import pk.org.cas.shoppinggrid.R;

public class AfterSplash extends AppCompatActivity {
    Button btnSeller, btnCustomer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_splash);
        btnSeller = findViewById(R.id.btnSeller);
        btnCustomer = findViewById(R.id.btnCustomer);


        btnSeller.setOnClickListener(v -> {
            Intent intentSeller = new Intent(AfterSplash.this, SellerNewOrderActivity.class);
            startActivity(intentSeller);
        });

        btnCustomer.setOnClickListener(v -> {
            Intent intentCustomer = new Intent(AfterSplash.this, LoginForUserActivity.class);
            startActivity(intentCustomer);
        });
    }

}
