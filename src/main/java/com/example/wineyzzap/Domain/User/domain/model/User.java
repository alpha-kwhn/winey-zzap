package com.example.wineyzzap.Domain.User.domain.model;

import com.example.wineyzzap.Domain.Comment.domain.model.Comment;
import com.example.wineyzzap.Domain.Feed.domain.model.FeedLike;
import com.example.wineyzzap.Domain.User.enums.Level;
import com.example.wineyzzap.Domain.User.enums.Social;
import com.example.wineyzzap.Global.model.BaseTimeLog;
import com.example.wineyzzap.Domain.Feed.domain.model.Feed;
import com.example.wineyzzap.Domain.Goal.domain.model.Goal;
import com.example.wineyzzap.Domain.Notification.domain.model.Notification;
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

