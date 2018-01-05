package com.mobildev.quzica;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by manu on 1/4/2018.
 */

public class CustomViewHolder extends RecyclerView.ViewHolder {

    public final CardView cardView;
    public final TextView titleView;
    public final TextView commentView;
    public final TextView viewView;
    public final TextView favourteView;
    public final ImageView commentIMGView;
    public final ImageView viewIMGView;
    public final ImageView favourteIMGView;
    public CustomViewHolder(View itemView) {
        super(itemView);
        cardView = itemView.findViewById(R.id.cardView);
        titleView = itemView.findViewById(R.id.titleView);
        commentView = itemView.findViewById(R.id.commentsView);
        viewView = itemView.findViewById(R.id.viewView);
        favourteView = itemView.findViewById(R.id.favouriteView);

        commentIMGView = itemView.findViewById(R.id.commentImg);
        viewIMGView = itemView.findViewById(R.id.viewIMG);
        favourteIMGView = itemView.findViewById(R.id.favoriteImg);
    }
}
