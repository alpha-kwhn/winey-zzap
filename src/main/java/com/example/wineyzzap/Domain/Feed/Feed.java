package com.example.wineyzzap.Domain.Feed;

import com.example.wineyzzap.Domain.Base.BaseTimeLog;
import com.example.wineyzzap.Domain.FeedLike.FeedLike;
import com.example.wineyzzap.Domain.Goal.Goal;
import com.example.wineyzzap.Domain.User.User;
import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Feed extends BaseTimeLog {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "feed_id")
    private Long id;

    private String feedImage;
    private Long feedMoney;
    private String feedTitle;

    @ManyToOne
    @JoinColumn(name = "goal_id")
    private Goal feedGoal;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User feedUser;

    @OneToMany(mappedBy = "likeFeed")
    private List<FeedLike> likes = new ArrayList<FeedLike>();

    public void setGoal(Goal goal) { this.feedGoal = goal; }

    public void setUser(User user) { this.feedUser = user; }

}
