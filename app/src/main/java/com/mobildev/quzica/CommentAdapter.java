package com.mobildev.quzica;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Manu on 1/5/2018.
 */

public class CommentAdapter extends RecyclerView.Adapter<CommentViewHolder> {
    Context context;
    ArrayList<CommentsModel> commentsList;
    public CommentAdapter(Context context, ArrayList<CommentsModel> commentsList){
        this.commentsList = commentsList;
        this.context = context;
    }

    @Override
    public CommentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.commet_row,parent,false);
        return new CommentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CommentViewHolder holder, int position) {
        holder.nameTV.setText(commentsList.get(position).getName());
        holder.emailTV.setText(commentsList.get(position).getEmail());
        holder.commentTV.setText(commentsList.get(position).getComments());
        holder.alphaTV.setText(commentsList.get(position).getName().substring(0, 1));
      //  AnimUtils.alphaAnimation(holder.alphaTV);
      //  AnimUtils.alphaAnimation(holder.nameTV);
     //   AnimUtils.alphaAnimation(holder.emailTV);
     //   AnimUtils.alphaAnimation(holder.commentTV);
    }

    @Override
    public int getItemCount() {
        return commentsList.size();
    }
}
