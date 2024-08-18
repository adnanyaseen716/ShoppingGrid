package pk.org.cas.shoppinggrid.Splash;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import pk.org.cas.shoppinggrid.R;

public class ForgetPasswordForUserActivity extends AppCompatActivity {
    EditText etEmailAddressForgotPwd;
    Button btnSendEmailFgtPwd;
    ImageButton btnBack_forgotPwd;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password_for_user);

        // Initialize views
        etEmailAddressForgotPwd = findViewById(R.id.etEmailAddressForgotPwd);
        btnSendEmailFgtPwd = findViewById(R.id.btnSendEmailFgtPwd);
        btnBack_forgotPwd = findViewById(R.id.btnBack_forgotPwd);


        // Set click listener for the button
        btnSendEmailFgtPwd.setOnClickListener(view -> {
            String email = etEmailAddressForgotPwd.getText().toString();
            // Send email with reset password link
            Toast.makeText(this, "Password link sent to " + email + " successfully", Toast.LENGTH_SHORT).show();
            finish();
        });

        btnBack_forgotPwd.setOnClickListener(view -> {
            finish();
        });

    }
}