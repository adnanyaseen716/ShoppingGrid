package pk.org.cas.shoppinggrid.Profile;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import pk.org.cas.shoppinggrid.R;

public class MyReviews extends AppCompatActivity {

    RecyclerView rvProductsReviewView;

    Button btnBack;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_reviews);

        rvProductsReviewView = findViewById(R.id.rvProductsReviewView);
        btnBack = findViewById(R.id.btnBack);

        rvProductsReviewView.setAdapter(new ProductReviewAdaptor(getList()));
        rvProductsReviewView.setLayoutManager(new LinearLayoutManager(MyReviews.this));
        rvProductsReviewView.setHasFixedSize(true);


        btnBack.setOnClickListener(view -> {
            finish();
        });

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