package com.calender.rest.controllers;

import com.calender.rest.models.EventModel;
import com.calender.rest.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EventController {

    @Autowired
    EventService eventService;

    @GetMapping("/events")
    public List<EventModel> getEvents() {
        return eventService.getEvents();
    }
}
