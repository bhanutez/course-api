package com.tw.courseapi.topics;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics = Arrays.asList(
            new Topic("spring", "spring framework", "spring framework description"),
            new Topic("java", "core java", "core java description"),
            new Topic("javascript", "javascript", "javascript description")
            );

    public List<Topic> getTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        return topics.stream().filter(element -> element.getId().equals(id)).findFirst().get();
    }
}
