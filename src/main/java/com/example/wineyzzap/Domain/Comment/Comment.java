package com.example.wineyzzap.Domain.Comment;

import com.example.wineyzzap.Domain.Base.BaseTimeLog;
import com.example.wineyzzap.Domain.Feed.Feed;
import com.example.wineyzzap.Domain.User.User;
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
