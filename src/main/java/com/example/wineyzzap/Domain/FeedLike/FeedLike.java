package com.example.wineyzzap.Domain.FeedLike;

import com.example.wineyzzap.Domain.Base.BaseTimeLog;
import com.example.wineyzzap.Domain.Feed.Feed;
import com.example.wineyzzap.Domain.User.User;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class FeedLike extends BaseTimeLog {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "feed_like_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "feed_id")
    private Feed likeFeed;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User likeUser;

    public void setFeed(Feed feed) {
        this.likeFeed = feed;
    }

    public void setUser(User user) {
        this.likeUser = user;
    }
}
