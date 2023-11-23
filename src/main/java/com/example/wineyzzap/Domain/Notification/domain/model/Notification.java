package com.example.wineyzzap.Domain.Notification.domain.model;

import com.example.wineyzzap.Domain.User.domain.model.User;
import com.example.wineyzzap.Global.model.BaseTimeLog;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Notification extends BaseTimeLog {

    // 기본키 + 키값 자동생성
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    private Boolean isChecked;
    private Long linkId;
    private String notiMessage;
    private String notiType;
    private Long requestUserId;
    private Long responseId;

    @ManyToOne
    @JoinColumn(name = "receive_user")
    private User notificationOwner;

    public void setUser(User user) {
        this.notificationOwner = user;
    }
}

