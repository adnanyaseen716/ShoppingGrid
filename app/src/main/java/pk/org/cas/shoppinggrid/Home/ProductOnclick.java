package pk.org.cas.shoppinggrid.Home;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import pk.org.cas.shoppinggrid.R;

public class ProductOnclick extends AppCompatActivity {

    //      When clicked on product this activity will be shown

TextView tvBackProduct , tvHeart;
Button btnWriteReview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_onclick);
        tvBackProduct =  findViewById(R.id.tvBackProduct);
        btnWriteReview =  findViewById(R.id.btnWriteReview);
        tvHeart = findViewById(R.id.tvHeart);

        tvBackProduct.setOnClickListener(view -> {
            finish();
        });


        tvHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                tvHeart.setdrawab
//                tvHeart.setCompoundDrawablesWithIntrinsicBounds(R.drawable.profile_icon, 0, 0, 0);
                final boolean[] isToggled = {false};
                tvHeart.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (!isToggled[0]){
                            tvHeart.setCompoundDrawablesWithIntrinsicBounds(R.drawable.heart_filled, 0, 0, 0);
                            isToggled[0] = true;
                            Toast.makeText(ProductOnclick.this, "Added to favourites!", Toast.LENGTH_SHORT).show();
                        }else {
                            tvHeart.setCompoundDrawablesWithIntrinsicBounds(R.drawable.heart_outline, 0, 0, 0);
                            isToggled[0] = false;
                            Toast.makeText(ProductOnclick.this, "Removed from favourites!", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });


        btnWriteReview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final Dialog dialog = new Dialog(ProductOnclick.this);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.write_review_dlg);


                Button btnSendReviewDlg = dialog.findViewById(R.id.btnSendReviewDlg);
                btnSendReviewDlg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                        Toast.makeText(ProductOnclick.this, "Review sent successfully!", Toast.LENGTH_SHORT).show();
                    }
                });

                TextView tvCrossDlg = dialog.findViewById(R.id.tvCrossDlg);
                tvCrossDlg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });


                dialog.show();
                dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT , ViewGroup.LayoutParams.WRAP_CONTENT);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
                dialog.getWindow().setGravity(Gravity.BOTTOM);
            }
        });


    }
}