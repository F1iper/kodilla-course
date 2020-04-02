package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {
    private int userCount;
    private int postCount;
    private int commentCount;
    private double postsPerUser;
    private double commentsPerUser;
    private double commentsPerPost;

    public CalculateStatistics() {
    }

    public void calculateAdvStatistics (Statistics statistics){
        userCount = statistics.usersNames().size();
        postCount = getPostCount();
        commentCount = getCommentCount();
        if(userCount != 0) {
            postsPerUser = (double) postCount / (double) userCount;
            commentsPerUser = (double) commentCount / (double) userCount;
        } else {
            postsPerUser = 0;
            commentsPerUser = 0;
        }
        if(postCount != 0 && commentCount != 0) {
            commentsPerPost = (double) commentCount / (double) postCount;
        }
    }

    public int getUserCount() {
        return userCount;
    }

    public void setUserCount(int userCount) {
        this.userCount = userCount;
    }

    public int getPostCount() {
        return postCount;
    }

    public void setPostCount(int postCount) {
        this.postCount = postCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public double getPostsPerUser() {
        return postsPerUser;
    }

    public void setPostsPerUser(double postsPerUser) {
        this.postsPerUser = postsPerUser;
    }

    public double getCommentsPerUser() {
        return commentsPerUser;
    }

    public void setCommentsPerUser(double commentsPerUser) {
        this.commentsPerUser = commentsPerUser;
    }

    public double getCommentePerPost() {
        return commentsPerPost;
    }

    public void setCommentePerPost(double commentePerPost) {
        this.commentsPerPost = commentePerPost;
    }

}
