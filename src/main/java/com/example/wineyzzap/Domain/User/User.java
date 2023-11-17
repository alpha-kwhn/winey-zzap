package com.example.wineyzzap.Domain.User;

import com.example.wineyzzap.Domain.Base.BaseTimeLog;
import com.example.wineyzzap.Domain.Comment.Comment;
import com.example.wineyzzap.Domain.Feed.Feed;
import com.example.wineyzzap.Domain.FeedLike.FeedLike;
import com.example.wineyzzap.Domain.Goal.Goal;
import com.example.wineyzzap.Domain.Noti.Notification;
import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class User extends BaseTimeLog {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    private String refreshToken;

    private String nickName;

    private String socialId;

    @Enumerated(EnumType.STRING)
    private Social socialType;

    @Enumerated(EnumType.STRING)
    private Level userLevel;

    @OneToMany(mappedBy = "notificationOwner")
    private List<Notification> notifications = new ArrayList<>();

    @OneToOne(mappedBy = "goalOwner")
    private Goal goal;

    @OneToMany(mappedBy = "feedUser")
    private List<Feed> userFeeds = new ArrayList<>();

    @OneToMany(mappedBy = "likeUser")
    private List<FeedLike> likeList = new ArrayList<>();

    @OneToMany(mappedBy = "commentUser")
    private List<Comment> commentList = new ArrayList<>();

}

