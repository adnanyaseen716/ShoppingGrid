package pk.org.cas.shoppinggrid.Profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import pk.org.cas.shoppinggrid.Cart.ActivityPayment;
import pk.org.cas.shoppinggrid.R;


public class ProfileFragment extends Fragment {
    ImageView ivProfileImage;
    TextView tvUserName, tvUserEmail, tvOrdersCount, tvAddressCount, tvPaymentMethod,tvReviews;
    CardView cvMyOrder;
    CardView cvShippingAddress;
    CardView cvPaymentMethods;
    CardView cvReviews;
    CardView cvSettings;
    View view;

    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_profile, container, false);

        ivProfileImage = view.findViewById(R.id.ivProfileImage);

        tvUserName = view.findViewById(R.id.tvUserName);
        tvUserEmail = view.findViewById(R.id.tvUserEmail);
        tvOrdersCount = view.findViewById(R.id.tvOrdersCount);
        tvAddressCount = view.findViewById(R.id.tvAddressCount);
        tvPaymentMethod = view.findViewById(R.id.tvPaymentMethod);
        tvReviews = view.findViewById(R.id.tvReviews);

        cvMyOrder = view.findViewById(R.id.cvMyOrder);
        cvShippingAddress = view.findViewById(R.id.cvShippingAddress);
        cvPaymentMethods = view.findViewById(R.id.cvPaymentMethods);
        cvReviews = view.findViewById(R.id.cvReviews);
        cvSettings = view.findViewById(R.id.cvSettings);


        cvMyOrder.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), Orders.class);
            startActivity(intent);
        });

        cvShippingAddress.setOnClickListener(view -> {
            Intent intent = new Intent(getContext(), ShippingAddress.class);
            startActivity(intent);
        });
        cvReviews.setOnClickListener(view -> {
            Intent intent = new Intent(getContext(), MyReviews.class);
            startActivity(intent);
        });
        cvSettings.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), Settings.class);
            startActivity(intent);
        });
        cvPaymentMethods.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), ActivityPayment.class);
            startActivity(intent);
        });

        return view;
    }
}