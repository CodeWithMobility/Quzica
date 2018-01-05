package com.mobildev.quzica;

/**
 * Created by Manu on 1/5/2018.
 */

public class CommentsModel {
    private String comments;
    private String name;

    public String getComments() {
        return comments;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getCommentcount() {
        return commentcount;
    }

    public int getFavouriteCount() {
        return favouriteCount;
    }

    private String email;
    private int commentcount;
    private int favouriteCount;
    public CommentsModel(String comments, String name, String email, int commentcount, int favouriteCount) {
        this.comments = comments;
        this.name = name;
        this.email = email;
        this.commentcount = commentcount;
        this.favouriteCount = favouriteCount;
    }




}
