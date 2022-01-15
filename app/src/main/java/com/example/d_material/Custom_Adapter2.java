package com.example.d_material;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Custom_Adapter2 extends RecyclerView.Adapter<Custom_Adapter2.ViewHolder> {
    private ArrayList<String> arrayList;
    private TextView textView;
    public Context context;
    public Button button2;
    public ImageButton button3, imageButton2;
    private onclickitem onclickitem;
    ImageView imageView;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView;
//        private final Button button2;
        private final ImageButton button3;
        private final ImageButton imageButton2;
        public ViewHolder(View view) {
            super(view);
            textView = (TextView) view.findViewById(R.id.textView);
//            button2=view.findViewById(R.id.button2);
            button3=view.findViewById(R.id.button3);
            imageButton2=view.findViewById(R.id.imagebutton2);
        }

        public TextView getTextView() {
            return textView;
        }
//        public Button getButton2(){
//            return  button2;
//        }
        public ImageButton getButton3(){
            return button3;
        }

        public ImageButton getImageButton2() {
            return imageButton2;
        }
    }

    public Custom_Adapter2(ArrayList<String> dataSet, onclickitem onclickitem) {
        this.arrayList = dataSet;
        this.onclickitem = onclickitem;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.customlayout2, viewGroup, false);
        textView = view.findViewById(R.id.textView);
//        button2=view.findViewById(R.id.button2);
        button3=view.findViewById(R.id.button3);
        imageButton2=view.findViewById(R.id.imagebutton2);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        textView.setText(arrayList.get(position));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position, @NonNull List<Object> payloads) {
        holder.getTextView().setText(arrayList.get(position));
         holder.getButton3().setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 onclickitem.onbutton3click(arrayList, holder.getAdapterPosition());
             }
         });
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
        void onbutton3click(ArrayList<String> arrayList, int position);
    }

}