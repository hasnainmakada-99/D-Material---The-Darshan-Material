package com.example.d_material;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Custom_Adapter3 extends RecyclerView.Adapter<Custom_Adapter3.ViewHolder>{
    private ArrayList<String> arrayList;
    private TextView textView;
    public Context context;
    public Button button2;
    public ImageButton ImageButton3, imageButton2;
    public onItemClick onItemClick;
    ImageView imageView;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView;
        private final ImageButton Imagebutton3;
        private final ImageButton imageButton2;
        public ViewHolder(View view) {
            super(view);
            textView = (TextView) view.findViewById(R.id.textView);
            Imagebutton3 =view.findViewById(R.id.button3);
            imageButton2=view.findViewById(R.id.imagebutton2);
        }

        public TextView getTextView() {
            return textView;
        }

        public ImageButton getImagebutton3(){
            return Imagebutton3;
        }

        public ImageButton getImageButton2() {
            return imageButton2;
        }
    }

    public Custom_Adapter3(ArrayList<String> dataSet, onItemClick onItemClick) {
        this.arrayList = dataSet;
        this.onItemClick=onItemClick;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_layout3, parent, false);
        textView=view.findViewById(R.id.textView);
        imageButton2=view.findViewById(R.id.imagebutton2);
        ImageButton3=view.findViewById(R.id.button3);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        textView.setText(arrayList.get(position));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position, @NonNull List<Object> payloads) {
        holder.getTextView().setText(arrayList.get(position));
        holder.getImageButton2().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClick.onBtn1click(arrayList, holder.getAdapterPosition());
            }
        });

        holder.getImagebutton3().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClick.onBtn2click(arrayList, holder.getAdapterPosition());
            }
        });

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public interface onItemClick{
        void onBtn1click(ArrayList<String> arrayList, int position);
        void onBtn2click(ArrayList<String> arrayList, int position);
    }
}
