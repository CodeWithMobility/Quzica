package com.mobildev.quzica;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by manu on 1/4/2018.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomViewHolder> {
    ArrayList<QuestionModel> stringArrayList;
    Context context;

    public CustomAdapter(Context context, ArrayList<QuestionModel> stringArrayList){
        this.stringArrayList = stringArrayList;
        this.context = context;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
         View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_row,parent,false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final CustomViewHolder holder, final int position) {
       String colorStr =  "#e4429d";
        if(position%2 == 0){
            colorStr = "#e4429d";
            holder.cardView.setCardBackgroundColor(Color.parseColor("#e4429d"));
        }else{
            holder.cardView.setCardBackgroundColor(Color.parseColor("#595FFF"));
            colorStr = "#595FFF";
        }
        final String finalColorStr = colorStr;
        holder.titleView.setText(stringArrayList.get(position).getQuestion());
        holder.commentView.setText(stringArrayList.get(position).getComment()+"");
        holder.favourteView.setText(stringArrayList.get(position).getFavouretes()+"K");
        holder.viewView.setText(stringArrayList.get(position).getViewers()+"K");
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("array", finalColorStr);
                intent.putExtra("TITLE",stringArrayList.get(position).getQuestion());
                intent.putExtra("COMMENT",stringArrayList.get(position).getComment()+"");
                intent.putExtra("FAVORITES",stringArrayList.get(position).getFavouretes()+"K");
                intent.putExtra("VIEWERS",stringArrayList.get(position).getViewers()+"K");

                final Pair<View,String> pair1 = Pair.create((View)holder.cardView,context.getString(R.string.transition));
                final Pair<View,String> pair2 = Pair.create((View)holder.titleView,context.getString(R.string.titletransition));
                final Pair<View,String> pair3 = Pair.create((View)holder.commentView,context.getString(R.string.commentstransition));
                final Pair<View,String> pair4 = Pair.create((View)holder.viewView,context.getString(R.string.viewtransition));
                final Pair<View,String> pair5 = Pair.create((View)holder.favourteView,context.getString(R.string.favoritetransition));
                final Pair<View,String> pair6 = Pair.create((View)holder.commentIMGView,context.getString(R.string.commentsIMGtransition));
                final Pair<View,String> pair7 = Pair.create((View)holder.viewIMGView,context.getString(R.string.viewIMGtransition));
                final Pair<View,String> pair8 = Pair.create((View)holder.favourteIMGView,context.getString(R.string.favoriteIMGtransition));

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation((Activity) context,pair1,pair2,pair3,pair4, pair5,pair6,pair7, pair8);
                ActivityCompat.startActivity(context, intent, options.toBundle());
            }
        });
    }

    @Override
    public int getItemCount() {
        return stringArrayList.size();
    }
}
