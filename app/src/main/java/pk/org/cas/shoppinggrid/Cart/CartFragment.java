package pk.org.cas.shoppinggrid.Cart;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import pk.org.cas.shoppinggrid.R;

public class CartFragment extends Fragment {
    View view;
    RecyclerView rvItemList;
    TextView tv_price, tv_delivery_fee, tv_total_amount, tv_CheckOut;;


    public CartFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_cart, container, false);

        rvItemList = view.findViewById(R.id.rvItemList);
        tv_price = view.findViewById(R.id.tv_price);
        tv_delivery_fee = view.findViewById(R.id.tv_delivery_fee);
        tv_total_amount = view.findViewById(R.id.tv_total_amount);
        tv_CheckOut = view.findViewById(R.id.tv_CheckOut);

        tv_CheckOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ActivityAddress.class);
                startActivity(intent);
            }
        });

        return view;
    }
}