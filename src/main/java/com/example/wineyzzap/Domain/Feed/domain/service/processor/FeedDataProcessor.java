package com.example.wineyzzap.Domain.Feed.domain.service.processor;

import com.example.wineyzzap.Domain.Feed.domain.model.Feed;
import com.example.wineyzzap.Domain.Feed.domain.repository.FeedRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Component
@RequiredArgsConstructor
public class FeedDataProcessor {

    private final FeedRepository feedRepository;

    @Async
    public CompletableFuture<List<Feed>> asyncFindAllFeeds() {
        List<Feed> feedList = feedRepository.findAllFeeds();
        return CompletableFuture.completedFuture(feedList);
    }
}
