package com.foodtrackerbe.foodtrackerbe.websocket;

import java.time.LocalDate;

public class ChatMessage {
    private String from;
    private String content;
    private LocalDate date; // TODO: update to datetime obj

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
