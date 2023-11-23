package com.example.wineyzzap.Domain.Feed.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@RequiredArgsConstructor
@Builder
@Data
public class FeedResponseDTO {
    private final String profileImage;
    private final String nickName;
    private final String feedImage;
    private final Long saveMoney;
    private final String feedContent;
    private final Long commentNum;
    private final Long likeNum;
    private final String timeAgo;
    private final Date createdAt;
}

