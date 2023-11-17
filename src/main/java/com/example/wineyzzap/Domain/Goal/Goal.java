package com.example.wineyzzap.Domain.Goal;

import com.example.wineyzzap.Domain.Base.BaseTimeLog;
import com.example.wineyzzap.Domain.Feed.Feed;
import com.example.wineyzzap.Domain.User.User;
import lombok.Getter;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
public class Goal extends BaseTimeLog {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "goal_id")
    private Long id;

    private Long duringGoalAmount;
    private Long duringGoalCount;
    private Boolean isAttained;
    private Date targetDate;
    private Long targetMoney;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User goalOwner;

    @OneToMany(mappedBy = "feedGoal")
    private List<Feed> goalFeeds = new ArrayList<Feed>();

    public void setUser(User user) {
        this.goalOwner = user;
    }
}
