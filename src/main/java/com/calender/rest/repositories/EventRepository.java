package com.calender.rest.repositories;

import com.calender.rest.models.EventModel;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<EventModel, Long> {
}
