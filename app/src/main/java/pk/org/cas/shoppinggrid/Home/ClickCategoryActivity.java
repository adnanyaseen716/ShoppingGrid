package pk.org.cas.shoppinggrid.Home;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import pk.org.cas.shoppinggrid.R;

public class ClickCategoryActivity extends AppCompatActivity {
    Toolbar topAppBar;
    ImageView ivBackCategory;
    ProductAdapter productAdapter;
    RecyclerView rvCategory;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_category);
        topAppBar = findViewById(R.id.topAppBar);
        rvCategory = findViewById(R.id.rvCategory);
        ivBackCategory = findViewById(R.id.ivBackCategory);

        Intent intent = getIntent();
        String categoryName = intent.getStringExtra("CategoryName");
        setSupportActionBar(topAppBar);
        getSupportActionBar().setTitle(categoryName);


        ivBackCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        productAdapter = new ProductAdapter(HomeFragment.getProductsList());
        rvCategory.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
        rvCategory.setAdapter(productAdapter);
        rvCategory.setHasFixedSize(true);
    }
}