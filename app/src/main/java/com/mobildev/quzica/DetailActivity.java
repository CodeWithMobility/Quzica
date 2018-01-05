package com.mobildev.quzica;

import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by manu on 1/4/2018.
 */

public class DetailActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private LinearLayout profileHeaderView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        if(Build.VERSION.SDK_INT>=21)
        {
            getWindow().setSharedElementEnterTransition(android.transition.TransitionInflater.from(this).inflateTransition(R.transition.change_view_transform));
        }
        String array= getIntent().getStringExtra("array");
        TextView titleView = findViewById(R.id.titleView);
        titleView.setText(getIntent().getStringExtra("TITLE"));
        TextView commentView = findViewById(R.id.commentsView);
        commentView.setText(getIntent().getStringExtra("COMMENT"));
        TextView viewView = findViewById(R.id.viewView);
        viewView.setText(getIntent().getStringExtra("VIEWERS" +
                ""));
        TextView favouriteView = findViewById(R.id.favouriteView);
        favouriteView.setText(getIntent().getStringExtra("FAVORITES"));

        LinearLayout rl= findViewById(R.id.detialHeaderView);
        rl.setBackgroundColor(Color.parseColor(array));
        profileHeaderView = findViewById(R.id.profileHeaderView);
        recyclerView = findViewById(R.id.commentsRecyclerView);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        CommentAdapter customAdapter = new CommentAdapter(this, getListOfData());
        recyclerView.setAdapter(customAdapter);

    }

    private ArrayList<CommentsModel> getListOfData(){
        ArrayList<CommentsModel> commentsModels = new ArrayList<>();
        commentsModels.add(new CommentsModel(getString(R.string.ans),"Manu Aravind","@live,com",12, 56));
        commentsModels.add(new CommentsModel(getString(R.string.ans),"Manu Aravind","@live,com",12, 56));
        commentsModels.add(new CommentsModel(getString(R.string.ans),"Manu Aravind","@live,com",12, 56));

        return commentsModels;
    }
    @Override
    public void onBackPressed() {
        ObjectAnimator anim = ObjectAnimator.ofFloat(profileHeaderView,"alpha",0.1f);
        anim.setDuration(200); // duration 3 seconds
        anim.start();
        ActivityCompat.finishAfterTransition(DetailActivity.this);

    }

}
