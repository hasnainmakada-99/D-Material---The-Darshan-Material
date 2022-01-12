package com.example.d_material;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Custom_Adapter extends RecyclerView.Adapter<Custom_Adapter.ViewHolder> {
//    private Contact[] localDataSet;
    private ArrayList<String> arrayList;
    private TextView textView;
//    private TextView textView2;

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView;

        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View
            textView = (TextView) view.findViewById(R.id.textView);
        }

        public TextView getTextView() {
            return textView;
        }
    }

    // Step 1: Initialize the dataset of the Adapter.
    public Custom_Adapter(ArrayList<String> dataSet) {
        arrayList=new ArrayList<String>();
        arrayList = dataSet;

    }

    // Step 2: Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.cutom_layout, viewGroup, false);
        textView = view.findViewById(R.id.textView);
//        textView2 = view.findViewById(R.id.textView);
        return new ViewHolder(view);
    }
    // Step 3: Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        textView.setText(arrayList.get(position));
//        textView2.setText(arrayList.get(position));
    }
    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
