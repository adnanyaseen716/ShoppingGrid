package pk.org.cas.shoppinggrid.Profile;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import pk.org.cas.shoppinggrid.R;

public class ShippingAddress extends AppCompatActivity {
    Button btnBack, btnEditAddress;
    TextView tvUser, tvAddress;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shipping_address);

        btnBack = findViewById(R.id.btnBack);
        tvUser = findViewById(R.id.tvUser);
        tvAddress = findViewById(R.id.tvAddress);
        btnEditAddress = findViewById(R.id.btnEditAddress);

        btnBack.setOnClickListener(v -> {
            finish();
        });
        btnEditAddress.setOnClickListener(view -> {
            TextView tvCurrentAddress;
            EditText etNewAddress;
            Button btnSavePassword;
            BottomSheetDialog dialog = new BottomSheetDialog(this);
            dialog.setContentView(R.layout.dialog_view_for_change_address);

            tvCurrentAddress = dialog.findViewById(R.id.tvCurrentAddress);
            etNewAddress = dialog.findViewById(R.id.etNewAddress);
            btnSavePassword = dialog.findViewById(R.id.btnSavePassword);

            dialog.show();

            btnSavePassword.setOnClickListener(v -> {
                Toast.makeText(this, "Address Saved", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            });
        });
    }
}