package kg.food;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import kg.food.MainActivity;

public class LargeMenuAdapter extends RecyclerView.Adapter<LargeMenuAdapter.ViewHolder> {

    private List<MenuItem> items;
    private MainActivity activity;

    public LargeMenuAdapter(MainActivity activity, List<MenuItem> items) {
        this.activity = activity;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.large_menu_item, parent, false);
        return new ViewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MenuItem menuItem = items.get(position);
        holder.imageMenuItem.setImageResource(menuItem.getImageRes());
        holder.textMenuItemName.setText(menuItem.getName());
        holder.textMenuItemPrice.setText(menuItem.getPrice());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.onLargeMenuItemClicked(menuItem);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageMenuItem;
        TextView textMenuItemName, textMenuItemPrice;

        public ViewHolder(View itemView) {
            super(itemView);
            imageMenuItem = itemView.findViewById(R.id.imageMenuItem);
            textMenuItemName = itemView.findViewById(R.id.textMenuItemName);
            textMenuItemPrice = itemView.findViewById(R.id.textMenuItemPrice);
        }
    }
}
