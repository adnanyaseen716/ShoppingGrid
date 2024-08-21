package pk.org.cas.shoppinggrid.Home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.widget.SearchView;
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
    android.widget.SearchView searchView;
    public static List<Product> productsList;



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
        searchView = view.findViewById(R.id.searchViewHome);

        productsList = HomeFragment.getProductsList();

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
                Intent intent = new Intent(getContext(), ClickCategoryActivity.class);
                Toast.makeText(getContext(), ""+getCategoryList().get(position).getCategoryName(), Toast.LENGTH_SHORT).show();
                intent.putExtra("CategoryName", getCategoryList().get(position).getCategoryName());
                startActivity(intent);
            }
        });


        productAdapter = new ProductAdapter(HomeFragment.getProductsList());
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

        searchView.setOnQueryTextListener(new android.widget.SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                filter(newText);
                return true;
            }
        });

        return view;
    }

    // Method for SearchView.
    private void filter(String text){
        List<Product> filteredList = new ArrayList<>();
        for(Product item : productsList){
            if(item.getProductName().toLowerCase().contains(text.toLowerCase())){
                filteredList.add(item);
            }
            productAdapter.filterProducts(filteredList);
        }
    }


    public static List<Product> getProductsList(){
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Classical Wrist Watch", "It is very expensive classical wrist watch for mens.", 5900, R.drawable.watchfirst, "Watches", 4.7, 100));
        productList.add(new Product(2, "HDD_1TB HardDrive", "A computer hard drive for computers. It has the capacity of 1TB. Electronic accessories.", 25000, R.drawable.ssd, "Computer Accessories", 4.3, 100));
        productList.add(new Product(3, "Men's Shoes", "A pair of men's shoes. They are very flexible. Easy to wear.", 1999, R.drawable.shoe, "Shoes", 4.7, 100));
        productList.add(new Product(4, "Summer T-shirt", "A new collection of men's and boys tshirt. It is very good quality summer t-shirt.", 1000, R.drawable.tshirt, "Clothes", 4.2, 100));
        productList.add(new Product(5, "Racket", "A new collection of sports racket. Good quality squash racket. Badminton", 1570, R.drawable.racketfirst, "Sports Accessories", 4.3, 100));
        productList.add(new Product(6, "iPhone-14 Mobile", "A new iphone-14 mobile. very fine and good quality. Electronic accessories.", 57450, R.drawable.iphone, "Mobile Phones", 4.8, 100));
        productList.add(new Product(7, "Men's Shoes", "A pair of men's shoes. They are very flexible. Easy to wear.", 1500, R.drawable.shoe, "Shoes", 4.3, 100));
        productList.add(new Product(8, "Dell Laptop", "A dell laptop with 14 inch screen and 256GB SSd and 16GB RAM, battery time 3000hrs.Electronic accessories.", 131500, R.drawable.laptop, "Laptops", 4.8, 100));
        productList.add(new Product(9, "Summer T-shirt", "A new collection of men's and boys tshirt. It is very good quality summer t-shirt.", 1000, R.drawable.tshirt, "Clothes", 4.2, 100));
        productList.add(new Product(10, "Apple Laptop, Tablet", "A new Apple laptop with 14 inch screen and 256GB SSd and 16GB RAM, battery time 3000hrs. Along with Tablet and iPhone-15.Electronic accessories.", 995500, R.drawable.lapandmob, "Laptops", 4.9, 100));
        productList.add(new Product(11, "Dumbbells", "A pair dumbbells for men. Jim exercise from different sizes of dumbbells. Sports accessories", 2999, R.drawable.dumbelll, "Sports Accessories", 4.3, 100));
        productList.add(new Product(12, "Squash Racket", "A new collection of sports racket. Good quality squash and badminton racket.", 1570, R.drawable.racketssecond, "Sports Accessories", 4.3, 100));
        productList.add(new Product(13, "iPhone Mobile", "A new iphone-14 mobile. very fine and good quality. Electronic accessories.", 65000, R.drawable.iphonefirst, "Mobile Phones", 4.8, 100));
        productList.add(new Product(14, "HP Laptop", "A new HP laptop with 14 inch screen and 256GB SSd and 16GB RAM, battery time 3000hrs.Electronic accessories.", 131500, R.drawable.laptopfirst, "Laptops", 4.1, 100));
        productList.add(new Product(15, "Steal Dumbbells", "A pair dumbbells for men. Jim exercise from different sizes of dumbbells. Sports accessories", 2999, R.drawable.dumbellfirst, "Sports Accessories", 4.4, 100));


        return productList;
    }

    public List<Category> getCategoryList(){
        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category(1, "Cloths", R.drawable.cloth_category));
        categoryList.add(new Category(2,"Watches", R.drawable.watch_category));
        categoryList.add(new Category(3,"Shoes", R.drawable.shoe));
        categoryList.add(new Category(4, "Sports", R.drawable.sport_category));
        categoryList.add(new Category(5,"Mobiles", R.drawable.mobiles_category));
        categoryList.add(new Category(6,"Laptops", R.drawable.laptop_category));
        categoryList.add(new Category(7,"Electronic Accessories", R.drawable.electronics_category));
        return categoryList;
    }
}