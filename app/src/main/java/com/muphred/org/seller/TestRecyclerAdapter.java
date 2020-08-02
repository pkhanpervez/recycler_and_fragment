package com.muphred.org.seller;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TestRecyclerAdapter extends RecyclerView.Adapter<TestRecyclerAdapter.ProgrammingViewHolder> {

    private String[] data;
    private ArrayList<DataModel> arrayList;
    Context context;
    final DataModel model=null;

    public TestRecyclerAdapter(Context context, ArrayList<DataModel> arrayList)
    {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ProgrammingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int position) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view = (View)inflater.inflate(R.layout.test_recycler_view,parent,false);


        return new ProgrammingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProgrammingViewHolder programmingViewHolder, int position) {
        //String title=data[i];
        final DataModel model=arrayList.get(position);

        //ProgrammingViewHolder holder=(ProgrammingViewHolder)programmingViewHolder;

        //programmingViewHolder.txtId.setText(model.getId());
        int myId=model.getId();
        String myTitle=model.getLanguage();

        String myIdString= String.valueOf(myId);
        programmingViewHolder.txtId.setText(myIdString);
        programmingViewHolder.txtTitle.setText(myTitle);
    }

    @Override
    public int getItemCount() {

        return (null != arrayList ? arrayList.size() : 0);
    }

    public class ProgrammingViewHolder extends RecyclerView.ViewHolder {
        TextView txtId;
        TextView txtTitle;
        public ProgrammingViewHolder(View itemView) {
            super(itemView);
            txtId = (TextView) itemView.findViewById(R.id.txtId);
            txtTitle=(TextView) itemView.findViewById(R.id.txtTitle);
        }
    }
}
