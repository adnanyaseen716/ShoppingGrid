package pk.org.cas.shoppinggrid.Splash;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import pk.org.cas.shoppinggrid.R;

public class MyItemSellerActivity extends AppCompatActivity {
    RecyclerView rvMyItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_item_seller);

        rvMyItems = findViewById(R.id.rvMyItems);
        ItemAdapter itemAdapter = new ItemAdapter(generateItemData());
        rvMyItems.setAdapter(itemAdapter);
        rvMyItems.setHasFixedSize(true);
        rvMyItems.setLayoutManager( new GridLayoutManager(this,2));


        itemAdapter.setOnItemClickListener((itemViewHolder, cardView, position) -> {
            Toast.makeText(MyItemSellerActivity.this, "Item Clicked", Toast.LENGTH_SHORT).show();

        });


    }
    public List<MyItem> generateItemData(){
        List<MyItem> myItems = new ArrayList<>();
        myItems.add(new MyItem("Parachute bag best in rains and its quality is best it is very easy to carry and",30090,4.5,R.color.red));
        myItems.add(new MyItem("Parachute bag best in rains and its quality is best it is very easy to carry and",30090,4.5,R.color.red));
        myItems.add(new MyItem("Parachute bag best in rains and its quality is best it is very easy to carry and",30090,4.5,R.color.red));
        myItems.add(new MyItem("Parachute bag best in rains and its quality is best it is very easy to carry and",30090,4.5,R.color.red));
        myItems.add(new MyItem("Parachute bag best in rains and its quality is best it is very easy to carry and",30090,4.5,R.color.red));
        myItems.add(new MyItem("Parachute bag best in rains and its quality is best it is very easy to carry and",30090,4.5,R.color.red));
        myItems.add(new MyItem("Parachute bag best in rains and its quality is best it is very easy to carry and",30090,4.5,R.color.red));
        myItems.add(new MyItem("Parachute bag best in rains and its quality is best it is very easy to carry and",30090,4.5,R.color.red));
        myItems.add(new MyItem("Parachute bag best in rains and its quality is best it is very easy to carry and",30090,4.5,R.color.red));
        myItems.add(new MyItem("Parachute bag best in rains and its quality is best it is very easy to carry and",30090,4.5,R.color.red));
        myItems.add(new MyItem("Parachute bag best in rains and its quality is best it is very easy to carry and",30090,4.5,R.color.red));
        myItems.add(new MyItem("Parachute bag best in rains and its quality is best it is very easy to carry and",30090,4.5,R.color.red));
        myItems.add(new MyItem("Parachute bag best in rains and its quality is best it is very easy to carry and",30090,4.5,R.color.red));
        myItems.add(new MyItem("Parachute bag best in rains and its quality is best it is very easy to carry and",30090,4.5,R.color.red));
        myItems.add(new MyItem("Parachute bag best in rains and its quality is best it is very easy to carry and",30090,4.5,R.color.red));
        myItems.add(new MyItem("Parachute bag best in rains and its quality is best it is very easy to carry and",30090,4.5,R.color.red));
        myItems.add(new MyItem("Parachute bag best in rains and its quality is best it is very easy to carry and",30090,4.5,R.color.red));
        myItems.add(new MyItem("Parachute bag best in rains and its quality is best it is very easy to carry and",30090,4.5,R.color.red));
        myItems.add(new MyItem("Parachute bag best in rains and its quality is best it is very easy to carry and",30090,4.5,R.color.red));

        return myItems;
    }
}
