package pk.org.cas.shoppinggrid.Profile;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import pk.org.cas.shoppinggrid.R;

public class Settings extends AppCompatActivity {
    EditText etFullname, etDateOfBirth, etPassword;
    SwitchCompat swSales, swNewArrivals, swDeliveryChanges;
    Button btnChange, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        etFullname = findViewById(R.id.etFullname);
        etDateOfBirth = findViewById(R.id.etDateOfBirth);
        etPassword = findViewById(R.id.etPassword);

        swSales = findViewById(R.id.swSales);
        swNewArrivals = findViewById(R.id.swNewArrivals);
        swDeliveryChanges = findViewById(R.id.swDeliveryChanges);

        btnChange = findViewById(R.id.btnChange);
        btnBack = findViewById(R.id.btnBack);


        btnBack.setOnClickListener(view -> {
            finish();
        });
        btnChange.setOnClickListener(view -> {
            EditText etOldPassword, etNewPassword, etRepeatNewPassword;
            Button btnSavePassword, btnForgetPassword;

            BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
            bottomSheetDialog.setContentView(R.layout.dialog_view_for_password_change);
            etOldPassword = bottomSheetDialog.findViewById(R.id.etNewAddress);
            etNewPassword = bottomSheetDialog.findViewById(R.id.etNewPassword);
            etRepeatNewPassword = bottomSheetDialog.findViewById(R.id.etRepeatNewPassword);

            btnSavePassword = bottomSheetDialog.findViewById(R.id.btnSavePassword);
            btnForgetPassword = bottomSheetDialog.findViewById(R.id.btnForgetPassword);
            bottomSheetDialog.show();

            btnSavePassword.setOnClickListener(view1 -> {
                if (etNewPassword.getText().toString().equals(etRepeatNewPassword.getText().toString())){

                    if ( etNewPassword.getText().toString().length() < 8 ){
                        Toast.makeText(this, "Password can't less than 8 characters", Toast.LENGTH_SHORT).show();
                    }else {
                        Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show();
                        bottomSheetDialog.dismiss();
                    }
                }else {
                    Toast.makeText(this, "Password doesn't matched", Toast.LENGTH_SHORT).show();
                }
            });
        });
    }
}