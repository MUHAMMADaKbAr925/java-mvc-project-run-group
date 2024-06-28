package run.Group.web.services.impl;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import run.Group.web.models.Event;
import run.Group.web.DTO.EventDto;
import run.Group.web.models.Club;
import run.Group.web.repositories.ClubRepository;
import run.Group.web.repositories.EventRepositary;
import run.Group.web.services.EventService;
import run.Group.web.mappers.EventMapper;

@Service
public class EventServiceImpl implements EventService {
    private EventRepositary eventRepository;
    private ClubRepository clubRepository;

    @Autowired
    public EventServiceImpl(EventRepositary eventRepository, ClubRepository clubRepository) {
        this.eventRepository = eventRepository;
        this.clubRepository = clubRepository;
    }

    @Override
    public void createEvent(Long clubId, EventDto eventDto) {
        Club club = clubRepository.findById(clubId).get();
        Event event =EventMapper. mapToEvent(eventDto);
        event.setClub(club);
        eventRepository.save(event);
    }

    @Override
    public List<EventDto> findAllEvents() {
        List<Event> events = eventRepository.findAll();
        return events.stream().map(event ->EventMapper. mapToEventDto(event)).collect(Collectors.toList());
    }

    @Override
    public EventDto findByEventId(Long eventId) {
        Event event = eventRepository.findById(eventId).get();
        return EventMapper.mapToEventDto(event);
    }

    @Override
    public void updateEvent(EventDto eventDto) {
        Event event =EventMapper. mapToEvent(eventDto);
        eventRepository.save(event);
    }

    @Override
    public void deleteEvent(long eventId) {
        eventRepository.deleteById(eventId);
    }
}