package org.homework.module2.three.ex1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        LocalDateTime sameLocalDateTime = LocalDateTime.of(2024, 1, 25, 13, 37);
        LocalDateTime localDateTime = LocalDateTime.of(2024, 1, 25, 16, 37);
        Feedback feedback1 = new Feedback(1, "отличный товар", 200, sameLocalDateTime);
        Feedback feedback2 = new Feedback(2, "так себе товар", 100, localDateTime);
        Feedback feedback3 = new Feedback(3, "плохой товар", 100, sameLocalDateTime);
        Feedback feedback4 = new Feedback(4, "плохой товар", 50, LocalDateTime.now());
        Feedback feedback5 = new Feedback(5, "отличный товар", 6600, LocalDateTime.now());
        Feedback feedback6 = new Feedback(6, "так себе товар", 200, LocalDateTime.now());

        List<Feedback> feedbackList = new ArrayList<>();
        feedbackList.add(feedback4);
        feedbackList.add(feedback5);
        feedbackList.add(feedback2);
        feedbackList.add(feedback6);
        feedbackList.add(feedback3);
        feedbackList.add(feedback1);
        feedbackList.forEach(System.out::println);
        System.out.println();

        Comparator<Feedback> feedbackComparator = (f0, f1) -> {
            if (f0.getLikeCount() == f1.getLikeCount()) {
                return f0.getLocalDateTime().compareTo(f1.getLocalDateTime());
            }
            return f0.getLikeCount() - f1.getLikeCount();
        };
        feedbackList.sort(feedbackComparator.reversed());
        feedbackList.forEach(System.out::println);
    }
}
