package com.example.wineyzzap.Domain.Recommend.domain.model;

import com.example.wineyzzap.Global.model.BaseTimeLog;
import lombok.Getter;

import javax.persistence.*;

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

