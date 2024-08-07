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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

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
        RecyclerView rv = findViewById(R.id.rv);

        tvBackProduct.setOnClickListener(view -> {
            finish();
        });

        ReviewAdapter reviewAdapter = new ReviewAdapter(getReviews());
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(reviewAdapter);
        rv.setHasFixedSize(true);


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


    private List<Review> getReviews(){
        List<Review> reviews = new ArrayList<>();
        reviews.add(new Review("User Name","12/12/1212","Content",R.drawable.review_test_image,4 ));
        reviews.add(new Review("User Name","12/12/1212","Content  j jf j jf j kf k f ",R.drawable.review_test_image ,3));
        reviews.add(new Review("User Name","12/12/1212","Content  j jf j jf j kf k f ",R.drawable.review_test_image ,3));
        reviews.add(new Review("User Name","12/12/1212","Content  j jf j jf j kf k f ",R.drawable.review_test_image ,3));
        reviews.add(new Review("User Name","12/12/1212","Content  j jf j jf j kf k f ",R.drawable.review_test_image ,3));
        reviews.add(new Review("User Name","12/12/1212","Content  j jf j jf j kf k f ",R.drawable.review_test_image ,3));
        reviews.add(new Review("User Name","12/12/1212","Content  j jf j jf j kf k f ",R.drawable.review_test_image ,3));
        reviews.add(new Review("User Name","12/12/1212","Content  j jf j jf j kf k f ",R.drawable.review_test_image ,3));
        reviews.add(new Review("User Name","12/12/1212","Content  j jf j jf j kf k f ",R.drawable.review_test_image ,3));
        reviews.add(new Review("User Name","12/12/1212","Content  j jf j jf j kf k f ",R.drawable.review_test_image ,3));
        reviews.add(new Review("User Name","12/12/1212","Content  j jf j jf j kf k f ",R.drawable.review_test_image ,3));
        reviews.add(new Review("User Name","12/12/1212","Content  j jf j jf j kf k f ",R.drawable.review_test_image ,3));
        reviews.add(new Review("User Name","12/12/1212","Content  j jf j jf j kf k f ",R.drawable.review_test_image ,3));
        reviews.add(new Review("User Name","12/12/1212","Content  j jf j jf j kf k f ",R.drawable.review_test_image ,3));
        reviews.add(new Review("User Name","12/12/1212","Content  j jf j jf j kf k f ",R.drawable.review_test_image ,3));
        reviews.add(new Review("User Name","12/12/1212","Content jbj fj fj fj fj djfjfjfjej fje fj fje fje fje j fje fj ejvj vjvjvjvjvjvjv j vj vj vrj vrjv rj vrj vjr vrj vrjvrj verjv ejv jv",R.drawable.review_test_image , 5));
        reviews.add(new Review("User Name","12/12/1212","Content jxbcjj j cj j cj cjxj jc jxcj xjc jc jc jc j cj cj jc jcjcjcdj dj djf jfjfj fjd f",R.drawable.review_test_image  , 1));

        return  reviews;
    }
}