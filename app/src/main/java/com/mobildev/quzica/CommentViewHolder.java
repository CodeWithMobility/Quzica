package com.mobildev.quzica;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Manu on 1/5/2018.
 */

public class CommentViewHolder extends RecyclerView.ViewHolder{
    public final TextView alphaTV;
    public final TextView nameTV;
    public final TextView emailTV;
    public final TextView commentTV;

    public CommentViewHolder(View itemView) {
        super(itemView);

        alphaTV = itemView.findViewById(R.id.alphaTv);
        nameTV = itemView.findViewById(R.id.nameTV);
        emailTV = itemView.findViewById(R.id.emailTV);
        commentTV = itemView.findViewById(R.id.commentTV);
    }
}
