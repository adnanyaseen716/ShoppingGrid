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


import pk.org.cas.shoppinggrid.MainActivity;
import pk.org.cas.shoppinggrid.R;

public class LoginForUserActivity extends AppCompatActivity {
    EditText etEmailAddressLogin,etPasswordLogin;
    Button btn_login;
    TextView tv_forgotPassword , tvRegister;
    ImageView ivGoogleLogin;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_for_user);
//        find view by id
        etEmailAddressLogin = findViewById(R.id.etEmailAddressLogin);
        etPasswordLogin = findViewById(R.id.etPasswordLogin);
        btn_login = findViewById(R.id.btn_login);
        tv_forgotPassword = findViewById(R.id.tv_forgotPassword);
        ivGoogleLogin = findViewById(R.id.ivGoogleLogin);
        tvRegister = findViewById(R.id.tvRegister);

//        btn clickListener
        btn_login.setOnClickListener(view -> {
            String email = etEmailAddressLogin.getText().toString();
            String password = etPasswordLogin.getText().toString();
            Intent logIntent = new Intent(LoginForUserActivity.this, MainActivity.class);
            logIntent.putExtra("email", email);
            logIntent.putExtra("password", password);
            startActivity(logIntent);
        });

        tv_forgotPassword.setOnClickListener(view -> {
            Intent forgotIntent = new Intent(LoginForUserActivity.this, ForgetPasswordForUserActivity.class);
            startActivity(forgotIntent);
        });

        tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forgotIntent = new Intent(LoginForUserActivity.this, SignupForUserActivity.class);
                startActivity(forgotIntent);
            }
        });
    }
}