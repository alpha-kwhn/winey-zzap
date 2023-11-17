package com.example.wineyzzap.Domain.Recommend;

import com.example.wineyzzap.Domain.Base.BaseTimeLog;
import com.example.wineyzzap.Domain.User.User;
import lombok.Getter;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Getter
public class Recommend extends BaseTimeLog {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recommend_id")
    private Long id;

    private String recommendImage;
    private String recommendLink;
    private Long recommendPercent;
    private String recommendSubTitle;
    private String recommendTitle;
    private Long recommendWon;
}

