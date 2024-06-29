package kg.food;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuAdapter;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerViewSmallMenu, recyclerViewLargeMenu;
    private SmallMenuAdapter smallMenuAdapter;
    private LargeMenuAdapter largeMenuAdapter;


    protected void  onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewSmallMenu = findViewById(R.id.recyclerViewSmallMenu);
        recyclerViewSmallMenu.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        List<String> smallMenuItems = Arrays.asList("Category 1", "Category 2", "Category 3");
        smallMenuItems = new SmallMenuAdapter(smallMenuItems);
        recyclerViewSmallMenu.setAdapter(smallMenuAdapter);

        recyclerViewLargeMenu = findViewById(R.id.recyclerViewLargeMenu);
        recyclerViewLargeMenu.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        List<MenuItem> largeMenuItems = prepareLargeMenuItems();
        recyclerViewLargeMenu.setAdapter(largeMenuAdapter);
    }


    private List<MenuItem> prepareLargeMenuItems() {
        List<MenuItem> items = new ArrayList<>();
//        items.add(new MenuItem(R.drawable.hamburger_image, "Hamburger, $5.99"));
//        items.add(new MenuItem(R.drawable.hamburger_image, "Cheeseburger, $6.49"));
//        items.add(new MenuItem(R.drawable.hamburger_image, "Veggie burger, $4.49"));
        return items;
    }


    public void onLargeMenuItemClicked(kg.food.MenuItem menuItem) {
    }

    public void onSmallMenuItemClicked(String category) {
    }
}
