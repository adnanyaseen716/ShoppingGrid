package pk.org.cas.shoppinggrid.Splash;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import pk.org.cas.shoppinggrid.R;

public class SignupForUserActivity extends AppCompatActivity {
    EditText etFullName,etEmailAddressSignup,etPhoneNumber,etAddress,etPasswordSignup;
    Button btn_signup;
    TextView tvAlreadyAccount;
    ImageView ivGoogleSign;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_for_user);
//        find view by id
        etFullName = findViewById(R.id.etFullName);
        etEmailAddressSignup = findViewById(R.id.etEmailAddressSignup);
        etPhoneNumber = findViewById(R.id.etPhoneNumber);
        etAddress = findViewById(R.id.etAddress);
        etPasswordSignup = findViewById(R.id.etPasswordSignup);
        btn_signup = findViewById(R.id.btn_signup);
        tvAlreadyAccount = findViewById(R.id.tvAlreadyAccount);
        ivGoogleSign = findViewById(R.id.ivGoogleSign);
//clickListener for buttons
        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fullName = etFullName.getText().toString();
                String email = etEmailAddressSignup.getText().toString();
                String phoneNumber = etPhoneNumber.getText().toString();
                String address = etAddress.getText().toString();
                String password = etPasswordSignup.getText().toString();
                Intent LoginIntent = new Intent(SignupForUserActivity.this,LoginForUserActivity.class);
                startActivity(LoginIntent);
                Toast.makeText(SignupForUserActivity.this, "Sign up successful", Toast.LENGTH_SHORT).show();
            }
        });


        tvAlreadyAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent LoginIntent = new Intent(SignupForUserActivity.this,LoginForUserActivity.class);
                startActivity(LoginIntent);
            }
        });
    }
}