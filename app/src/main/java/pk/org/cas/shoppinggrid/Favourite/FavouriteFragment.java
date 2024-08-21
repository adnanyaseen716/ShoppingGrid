package pk.org.cas.shoppinggrid.Favourite;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


import pk.org.cas.shoppinggrid.Home.Product;
import pk.org.cas.shoppinggrid.Home.ProductAdapter;
import pk.org.cas.shoppinggrid.R;


public class FavouriteFragment extends Fragment {
    View view;
    RecyclerView rvFavourite;
    ImageView ivBackFavourite;
    ProductAdapter productAdapter;


    public FavouriteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_favourite, container, false);
        rvFavourite = view.findViewById(R.id.rvFavourite);
        ivBackFavourite = view.findViewById(R.id.ivBackFavourite);

        productAdapter = new ProductAdapter(getFavouriteData());
        rvFavourite.setLayoutManager(new GridLayoutManager(this.getContext(), 2));
        rvFavourite.setAdapter(productAdapter);
        rvFavourite.setHasFixedSize(true);
        productAdapter.setOnItemClickListener(new ProductAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(ProductAdapter.ProductViewHolder holder, int position) {
                Toast.makeText(getContext(), "Click on Favourite Product.", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

    public List<Product> getFavouriteData(){
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Classical Wrist Watch", "It is very expensive classical wrist watch for mens.", 5900, R.drawable.watch_first, "Watches", 4.7, 100));
        productList.add(new Product(2, "HDD_1TB HardDrive", "A computer hard drive for computers. It has the capacity of 1TB. Electronic accessories.", 25000, R.drawable.ssd, "Computer Accessories", 4.3, 100));
        productList.add(new Product(3, "Men's Shoes", "A pair of men's shoes. They are very flexible. Easy to wear.", 1999, R.drawable.shoes, "Shoes", 4.7, 100));
        productList.add(new Product(4, "Summer T-shirt", "A new collection of men's and boys tshirt. It is very good quality summer t-shirt.", 1000, R.drawable.tshirt, "Clothes", 4.2, 100));
        productList.add(new Product(5, "Racket", "A new collection of sports racket. Good quality squash racket. Badminton", 1570, R.drawable.racketfirst, "Sports Accessories", 4.3, 100));
        productList.add(new Product(6, "iPhone-14 Mobile", "A new iphone-14 mobile. very fine and good quality. Electronic accessories.", 57450, R.drawable.iphone, "Mobile Phones", 4.8, 100));
        productList.add(new Product(7, "Men's Shoes", "A pair of men's shoes. They are very flexible. Easy to wear.", 1500, R.drawable.shoes, "Shoes", 4.3, 100));
        return productList;
    }
}