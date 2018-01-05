package com.mobildev.quzica;

/**
 * Created by Manu on 1/5/2018.
 */

public class QuestionModel {
    private String question;

    public String getQuestion() {
        return question;
    }

    public int getComment() {
        return comment;
    }

    public int getViewers() {
        return viewers;
    }

    public int getFavouretes() {
        return favouretes;
    }

    private int comment;
    private int viewers;
    private int favouretes;

    public QuestionModel(String question, int comment, int viewers, int favouretes) {
        this.question = question;
        this.comment = comment;
        this.viewers = viewers;
        this.favouretes = favouretes;
    }


}
