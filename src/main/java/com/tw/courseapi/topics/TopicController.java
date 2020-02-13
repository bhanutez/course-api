package com.tw.courseapi.topics;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getTopics() {
        return Arrays.asList(
                new Topic("spring", "spring framework", "spring framework description"),
                new Topic("java", "core java", "core java description"),
                new Topic("javascript", "javascript", "javascript description")
        );
    }
}
