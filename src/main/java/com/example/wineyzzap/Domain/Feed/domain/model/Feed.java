package com.example.wineyzzap.Domain.Feed.domain.model;

import com.example.wineyzzap.Domain.Goal.domain.model.Goal;
import com.example.wineyzzap.Domain.User.domain.model.User;
import com.example.wineyzzap.Global.model.BaseTimeLog;
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
    private List<FeedLike> likes = new ArrayList<>();

    public void setGoal(Goal goal) { this.feedGoal = goal; }

    public void setUser(User user) { this.feedUser = user; }

}
