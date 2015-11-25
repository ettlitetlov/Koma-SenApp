package com.example.josfl888.senapp;

/**
 * Created by Rebecca on 2015-11-25.
 */
public class Meeting {

    private long id;
    private String groupName;
    private String time;
    private String place;
    private String description;

    public Meeting(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getTime() {
        return time;
    }

    public String getPlace() {
        return place;
    }

    public String getDescription() {
        return description;
    }

    public void setMeeting(String group, String time, String place, String description) {
        this.groupName = groupName;
        this.time = time;
        this.place = place;
        this.description = description;
    }

    // Will be used by the ArrayAdapter in the ListView
    @Override
    public String toString() {
        return String.format("%s%s", groupName, time);
    }
}
