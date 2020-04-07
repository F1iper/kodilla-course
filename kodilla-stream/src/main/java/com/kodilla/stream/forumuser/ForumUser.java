package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final String idNumber;
    private final String username;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int postsCount;

    public ForumUser(final String idNumber, final String username, final int postsCount, final int year, final int month, final int day, final char sex) {
        this.idNumber = idNumber;
        this.username = username;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(year, month, day);
        this.postsCount = postsCount;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostsCount() {
        return postsCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", postsCount=" + postsCount +
                '}';
    }
}
