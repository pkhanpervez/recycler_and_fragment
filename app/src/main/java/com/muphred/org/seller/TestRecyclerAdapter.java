package com.muphred.org.seller;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class TestRecyclerAdapter extends RecyclerView.Adapter<TestRecyclerAdapter.ProgrammingViewHolder> {

    private String[] data;
    public TestRecyclerAdapter(String[] data)
    {
        this.data=data;
    }

    @NonNull
    @Override
    public ProgrammingViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater=LayoutInflater.from(viewGroup.getContext());
        View view=inflater.inflate(R.layout.test_recycler_view,viewGroup,false);




        return new ProgrammingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProgrammingViewHolder programmingViewHolder, int i) {
        String title=data[i];
        programmingViewHolder.txtTitle.setText(title);



    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ProgrammingViewHolder extends RecyclerView.ViewHolder {
        ImageView imgIcon;
        TextView txtTitle;
        public ProgrammingViewHolder(View itemView) {
            super(itemView);
            imgIcon = (ImageView) itemView.findViewById(R.id.imgIcon);
            txtTitle=(TextView) itemView.findViewById(R.id.txtTitle);
        }
    }
}
