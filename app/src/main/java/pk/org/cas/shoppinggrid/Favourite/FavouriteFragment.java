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
        productList.add(new Product("Silver Wrist Watch", 2560, 4.9, R.drawable.watch_second));
        productList.add(new Product("Silver Wrist Watch", 2560, 4.9, R.drawable.watch_second));
        productList.add(new Product("Silver Wrist Watch", 2560, 4.9, R.drawable.watch_second));
        productList.add(new Product("Silver Wrist Watch", 2560, 4.9, R.drawable.watch_second));
        productList.add(new Product("Silver Wrist Watch", 2560, 4.9, R.drawable.watch_second));
        return productList;
    }
}