package com.example.wineyzzap.Domain.Noti;

import com.example.wineyzzap.Domain.Base.BaseTimeLog;
import com.example.wineyzzap.Domain.User.User;
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

