package com.example.wineyzzap.Domain.Comment.domain.model;

import com.example.wineyzzap.Global.model.BaseTimeLog;
import com.example.wineyzzap.Domain.Feed.domain.model.Feed;
import com.example.wineyzzap.Domain.User.domain.model.User;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Comment extends BaseTimeLog {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Long id;

    private String content;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User commentUser;

    @ManyToOne
    @JoinColumn(name = "feed_id")
    private Feed commentFeed;

}
