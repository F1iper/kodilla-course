package com.kodilla.testing.forum;

import java.util.ArrayList;
import java.util.LinkedList;

public class ForumUser {
    private String name;
    private String realName;
    private ArrayList<ForumPost> posts = new ArrayList<>();
    private LinkedList<ForumComment> comments = new LinkedList<>();

    public ForumUser(String name, String realName) {
        this.name = name;
        this.realName = realName;
    }

    public void addPost(String author, String postBody){

    }
    public void addComment(ForumPost thePost, String author, String commentBody){

    }
    public int getPostsQuantity(){
        return 1;
    }
    public int getCommentQuantity(){
        return 1;
    }
    public ForumPost getPost(int postNumber){
        ForumPost forumPost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");

        return forumPost;
    }
    public ForumComment getComment(int commentNumber){
        return null;
    }
    public boolean removePost(ForumPost thePost){
        return true;
    }
    public boolean removeComment(ForumComment theComment){
        return true;
    }
    public String getName(){
        return name;
    }
    public String getRealName(){
        return realName;
    }
}
