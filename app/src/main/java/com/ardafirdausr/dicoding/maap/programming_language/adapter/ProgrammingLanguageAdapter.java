package com.ardafirdausr.dicoding.maap.programming_language.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ardafirdausr.dicoding.maap.programming_language.R;
import com.ardafirdausr.dicoding.maap.programming_language.model.ProgrammingLanguage;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ProgrammingLanguageAdapter extends RecyclerView.Adapter<ProgrammingLanguageAdapter.ProgrammingLanguageViewHolder>{

    private ArrayList<ProgrammingLanguage> programmingLanguages;
    private OnItemClickCallback onItemClickCallback;

    public ProgrammingLanguageAdapter(ArrayList<ProgrammingLanguage> programmingLanguages){
        this.programmingLanguages = programmingLanguages;
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ProgrammingLanguageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        Context context = parent.getContext();
        int resourceId = R.layout.item_row_programming_language;
        View view = LayoutInflater
                        .from(context)
                        .inflate(resourceId, parent, false);
        return new ProgrammingLanguageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ProgrammingLanguageViewHolder viewHolder, int position) {
        ProgrammingLanguage programmingLanguage = programmingLanguages.get(position);
        Context context = viewHolder.itemView.getContext();
        Glide.with(context)
                .load(programmingLanguage.getImage())
                .apply(new RequestOptions().override(55, 55))
                .into(viewHolder.image);
        viewHolder.vgItemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ProgrammingLanguage programmingLanguage = programmingLanguages.get(viewHolder.getAdapterPosition());
                onItemClickCallback.onItemClicked(programmingLanguage);
            }
        });
        viewHolder.txtName.setText(programmingLanguage.getName());
        viewHolder.txtShareRate.setText(context.getResources().getString(R.string.share_rate ) + " : " + Float.toString(programmingLanguage.getShareRate()) + " %");
    }

    @Override
    public int getItemCount() {
        return programmingLanguages.size();
    }

    public interface OnItemClickCallback {
        void onItemClicked(ProgrammingLanguage programmingLanguage);
    }

    public class ProgrammingLanguageViewHolder extends RecyclerView.ViewHolder{
        ViewGroup vgItemView;
        TextView txtName, txtShareRate;
        ImageView image;

        public ProgrammingLanguageViewHolder(@NonNull View itemView) {
            super(itemView);
            vgItemView = itemView.findViewById(R.id.item_view);
            txtName = itemView.findViewById(R.id.tv_item_name);
            txtShareRate = itemView.findViewById(R.id.tv_item_share_rate);
            image = itemView.findViewById(R.id.img_item_image);
        }
    }
}
