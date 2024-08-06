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

import pk.org.cas.shoppinggrid.R;

public class CartFragment extends Fragment {
    View view;
    ImageButton imageButton3 ;
    TextView tv_checkout_now;
    ConstraintLayout clCheckout;

    public CartFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_cart, container, false);

        imageButton3 = view.findViewById(R.id.imageButton3);
        tv_checkout_now = view.findViewById(R.id.tv_checkout_now);
        clCheckout = view.findViewById(R.id.clCheckout);



        clCheckout.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), ActivityAddress.class);
            startActivity(intent);
        });



//        imageButton3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), ActivityAddress.class);
//                startActivity(intent);
//            }
//        });


        return view;
    }
}