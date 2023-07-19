package org.example.reminderlist;

import java.util.ArrayList;

public class Note {
    private String title;
    private String details;
    private long time;


    public Note(String title, String details, long time) {
        this.title = title;
        this.details = details;
        this.time = time;
    }

    public long getTime() {
        return time;
    }

    public String getDetails() {
        return details;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
