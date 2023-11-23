package com.example.wineyzzap.Domain.Feed.domain.repository;

import com.example.wineyzzap.Domain.Feed.domain.model.Feed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FeedRepository extends JpaRepository<Feed, Long> {
    @Query("select fd from Feed fd")
    List<Feed> findAllFeeds();
}
