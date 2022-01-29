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

public class Custom_Adapter_3 extends RecyclerView.Adapter<Custom_Adapter_3.ViewHolder> {
    private ArrayList<String> arrayList;
    private TextView textView;
    public Context context;
    public Button button2;
    public ImageButton button3, imageButton2;
    private Custom_Adapter2.onclickitem onclickitem;
    ImageView imageView;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView;
        private final ImageButton imageButton2;
        public ViewHolder(View view) {
            super(view);
            textView = (TextView) view.findViewById(R.id.textView);
            imageButton2=view.findViewById(R.id.imagebutton2);
        }

        public TextView getTextView() {
            return textView;
        }
        public ImageButton getImageButton2() {
            return imageButton2;
        }
    }

    public Custom_Adapter_3(ArrayList<String> dataSet, Custom_Adapter2.onclickitem onclickitem) {
        this.arrayList = dataSet;
        this.onclickitem = onclickitem;
    }


    @Override
    public Custom_Adapter_3.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.custom_layout3, viewGroup, false);
        textView = view.findViewById(R.id.textView);
        button3=view.findViewById(R.id.button3);
        imageButton2=view.findViewById(R.id.imagebutton2);
        return new Custom_Adapter_3.ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull Custom_Adapter_3.ViewHolder viewHolder, int position) {
        textView.setText(arrayList.get(position));
    }

    @Override
    public void onBindViewHolder(@NonNull Custom_Adapter_3.ViewHolder holder, int position, @NonNull List<Object> payloads) {
        holder.getTextView().setText(arrayList.get(position));
//        holder.getButton3().setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                onclickitem.onbutton3click(arrayList, holder.getAdapterPosition());
//            }
//        });
        holder.getImageButton2().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onclickitem.onbutton2click(arrayList, holder.getAdapterPosition());
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public interface onclickitem {
        void onitemclick(ArrayList<String> arrayList, int position);
        void onbutton2click(ArrayList<String> arrayList, int position);
    }
}
