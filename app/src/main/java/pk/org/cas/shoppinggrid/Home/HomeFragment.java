package pk.org.cas.shoppinggrid.Home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

import pk.org.cas.shoppinggrid.R;

public class HomeFragment extends Fragment {
    View view;
    RecyclerView rvMainFirst, rvMainSecond;
    ProductAdapter productAdapter;
    CategoryAdapter categoryAdapter;
    ImageSlider imageSlider;
    ImageView ivNotification;



    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_home, container, false);

        rvMainFirst = view.findViewById(R.id.rvMainFirst);
        rvMainSecond = view.findViewById(R.id.rvMainSecond);
        imageSlider = view.findViewById(R.id.ImageSlider);
        ivNotification = view.findViewById(R.id.ivNotification);

        List<SlideModel> imageSliderList = new ArrayList<>();
        imageSliderList.add(new SlideModel(R.drawable.watch_first, ScaleTypes.FIT));
        imageSliderList.add(new SlideModel(R.drawable.watch_second, ScaleTypes.FIT));
        imageSliderList.add(new SlideModel(R.drawable.watch_first, ScaleTypes.FIT));
        imageSliderList.add(new SlideModel(R.drawable.watch_second, ScaleTypes.FIT));
        imageSlider.setImageList(imageSliderList, ScaleTypes.FIT);



        categoryAdapter = new CategoryAdapter(getCategoryList());
        rvMainFirst.setLayoutManager(new LinearLayoutManager(this.getContext(), LinearLayoutManager.HORIZONTAL, false));
        rvMainFirst.setAdapter(categoryAdapter);
        rvMainFirst.setHasFixedSize(true);
        categoryAdapter.setOnItemClickListener(new CategoryAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(CategoryAdapter.CategoryViewHolder holder, int position) {
                Toast.makeText(getContext(), "Clicked on Category", Toast.LENGTH_SHORT).show();
            }
        });


        productAdapter = new ProductAdapter(getProductsList());
        rvMainSecond.setLayoutManager(new GridLayoutManager(this.getContext(), 2));
        rvMainSecond.setAdapter(productAdapter);
        rvMainFirst.setHasFixedSize(true);
        productAdapter.setOnItemClickListener(new ProductAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(ProductAdapter.ProductViewHolder holder, int position) {
                Toast.makeText(getContext(), "Clicked on Product", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getContext(), ProductOnclick.class);
                startActivity(intent);
            }
        });


        ivNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), NotificationActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }

    public List<Product> getProductsList(){
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Wrist Watch", 2000, 4.6, R.drawable.watch_first));
        productList.add(new Product("Wrist Watch", 2000, 4.6, R.drawable.watch_second));
        productList.add(new Product("Wrist Watch", 2000, 4.6, R.drawable.watch_first));
        productList.add(new Product("Wrist Watch", 2000, 4.6, R.drawable.watch_second));
        productList.add(new Product("Wrist Watch", 2000, 4.6, R.drawable.watch_first));
        productList.add(new Product("Wrist Watch", 2000, 4.6, R.drawable.watch_second));
        productList.add(new Product("Wrist Watch", 2000, 4.6, R.drawable.watch_first));
        productList.add(new Product("Wrist Watch", 2000, 4.6, R.drawable.watch_second));
        productList.add(new Product("Wrist Watch", 2000, 4.6, R.drawable.watch_first));
        productList.add(new Product("Wrist Watch", 2000, 4.6, R.drawable.watch_second));
        productList.add(new Product("Wrist Watch", 2000, 4.6, R.drawable.watch_first));
        productList.add(new Product("Wrist Watch", 2000, 4.6, R.drawable.watch_second));
        productList.add(new Product("Wrist Watch", 2000, 4.6, R.drawable.watch_first));
        productList.add(new Product("Wrist Watch", 2000, 4.6, R.drawable.watch_second));
        return productList;
    }

    public List<Category> getCategoryList(){
        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category("Shoes", R.drawable.shoes, R.color.lightBlue));
        categoryList.add(new Category("Shoes is the best one", R.drawable.shoes, R.color.lightBlue));
        categoryList.add(new Category("Shoes", R.drawable.shoes, R.color.lightBlue));
        categoryList.add(new Category("Shoes", R.drawable.shoes, R.color.lightBlue));
        categoryList.add(new Category("Shoes", R.drawable.shoes, R.color.lightBlue));
        categoryList.add(new Category("Shoes", R.drawable.shoes, R.color.lightBlue));
        categoryList.add(new Category("Shoes", R.drawable.shoes, R.color.lightBlue));
        return categoryList;
    }
}