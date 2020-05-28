package com.kodilla.patterns.strategy.social.users;

import com.kodilla.patterns.strategy.social.publishers.SocialPublisher;

public class User {
    private final String name;
    protected SocialPublisher socialPublisher;

    public User(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String sharePost() {
        return socialPublisher.share();
    }

    public void setPlatform(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}