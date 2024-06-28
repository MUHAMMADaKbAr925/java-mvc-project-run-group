package run.Group.web.services;


import java.util.List;

import run.Group.web.DTO.EventDto;


public interface EventService {
    void createEvent(Long clubId, EventDto eventDto);
    List<EventDto> findAllEvents();
    EventDto findByEventId(Long eventId);
    void updateEvent(EventDto eventDto);
    void deleteEvent(long eventId);
}