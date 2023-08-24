package com.example.endavamobile;

public class EventsData {
    private String eventName;
    private String eventDescription;
    private Integer eventImage;

    public EventsData(String eventName, String eventDescription, Integer eventImage) {
        this.eventName = eventName;
        this.eventDescription = eventDescription;
        this.eventImage = eventImage;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public Integer getEventImage() {
        return eventImage;
    }

    public void setEventImage(Integer eventImage) {
        this.eventImage = eventImage;
    }
}
