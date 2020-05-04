package com.calender.rest.services;

import com.calender.rest.models.EventModel;
import com.calender.rest.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {

    @Autowired
    EventRepository eventRepository;

    public List<EventModel> getEvents() {
        List<EventModel> eventList = new ArrayList<EventModel>();

        eventRepository.findAll().forEach(eventList::add);

        return eventList;
    }
}
