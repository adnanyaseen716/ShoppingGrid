package pk.org.cas.shoppinggrid.Splash;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import pk.org.cas.shoppinggrid.R;

public class NextToSignupActivity extends AppCompatActivity {
    Button btnNextActivity;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_to_signup);
        btnNextActivity = findViewById(R.id.btnNextActivity);
        btnNextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signUpIntent = new Intent(NextToSignupActivity.this,SignupForUserActivity.class);
                startActivity(signUpIntent);
            }
        });
    }
}