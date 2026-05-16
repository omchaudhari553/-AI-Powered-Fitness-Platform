package com.vaibhav.microservices.aiservice.service;

import com.vaibhav.microservices.aiservice.model.Activity;


import com.vaibhav.microservices.aiservice.model.Recommendation;
import com.vaibhav.microservices.aiservice.repository.RecommendationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class ActivityMessageListener {



  private final ActivityAIService activityAIService;
  private final RecommendationRepository recommendationRepository;
    @KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "activity-processor-group")
    public void processActivity(Activity activity) {
        log.info("Received activity for processing: {}", activity.getUserId());
//        log.info("Generated Recommendation: {}", aiService.generateRecommendation(activity));
        Recommendation recommendation= activityAIService.generateRecommendation(activity);
        recommendationRepository.save(recommendation);

    }
}