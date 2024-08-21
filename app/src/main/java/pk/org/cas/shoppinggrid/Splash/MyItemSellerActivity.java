package pk.org.cas.shoppinggrid.Splash;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;

import java.util.ArrayList;
import java.util.List;

import pk.org.cas.shoppinggrid.Home.HomeFragment;
import pk.org.cas.shoppinggrid.Home.Product;
import pk.org.cas.shoppinggrid.Home.ProductAdapter;
import pk.org.cas.shoppinggrid.R;

public class MyItemSellerActivity extends AppCompatActivity {
    RecyclerView rvMyItems;
    ProductAdapter productAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_item_seller);

        rvMyItems = findViewById(R.id.rvMyItems);
        productAdapter = new ProductAdapter(HomeFragment.getProductsList());
        rvMyItems.setAdapter(productAdapter);
        rvMyItems.setHasFixedSize(true);
        rvMyItems.setLayoutManager( new GridLayoutManager(this,2));


        productAdapter.setOnItemClickListener((itemViewHolder, position) -> {
            Toast.makeText(MyItemSellerActivity.this, "Item Clicked", Toast.LENGTH_SHORT).show();
        });


    }
}
