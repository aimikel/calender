package com.calender.rest.controllers;

import com.calender.rest.models.EventModel;
import com.calender.rest.services.EventService;
import com.calender.rest.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EventController {

    @Autowired
    EventService eventService;

    private final EventRepository repository;

    EventController(EventRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/events")
    public Iterable<EventModel> getEvents() {
        return repository.findAll();
    }
}
