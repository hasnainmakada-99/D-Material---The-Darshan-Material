package com.example.d_material;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Custom_Adapter extends RecyclerView.Adapter<Custom_Adapter.ViewHolder> {
    private ArrayList<String> arrayList;
    private TextView textView;
    public Context context;
    private onclickitem onclickitem;
    ImageView imageView;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView;
//        private final ImageView imageView;
        public ViewHolder(View view) {
            super(view);
            textView = (TextView) view.findViewById(R.id.textView);
//            imageView=view.findViewById(R.id.imageView2);
        }
        public TextView getTextView() {
            return textView;
        }
    }

    public Custom_Adapter(ArrayList<String> dataSet, onclickitem onclickitem)
    {
        this.arrayList=dataSet;
        this.onclickitem=onclickitem;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cutom_layout, viewGroup, false);
        textView = view.findViewById(R.id.textView);
//        imageView=view.findViewById(R.id.imageView2);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        textView.setText(arrayList.get(position));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position, @NonNull List<Object> payloads) {
        holder.getTextView().setText(arrayList.get(position));
        holder.itemView.setOnClickListener(view -> {
            onclickitem.onitemclick(arrayList, position, imageView);
        });

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public interface onclickitem{
        void onitemclick(ArrayList<String> arrayList, int position, ImageView imageView);
    }
}
