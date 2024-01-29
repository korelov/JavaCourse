package org.homework.module2.three.ex1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Feedback {
    private final int id;
    private final String text;
    private final int likeCount;
    private final LocalDateTime localDateTime;

    public Feedback(int id, String text, int likeCount, LocalDateTime localDateTime) {
        this.id = id;
        this.text = text;
        this.likeCount = likeCount;
        this.localDateTime = localDateTime;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Feedback feedback = (Feedback) o;
        return id == feedback.id
                && likeCount == feedback.likeCount
                && Objects.equals(text, feedback.text)
                && Objects.equals(localDateTime, feedback.localDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, text, likeCount, localDateTime);
    }

    @Override
    public String toString() {
        return String.format("Id отзыва %d, Отзыв - %s, Кол. лайков %d, Дата отзыва %s ",
                id, text, likeCount,
                localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
}
