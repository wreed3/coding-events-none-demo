package org.launchcode.codingevents.controllers;


//import org.launchcode.codingevents.data.EventData;

import org.launchcode.codingevents.data.EventRepository;
import org.launchcode.codingevents.models.Event;
import org.launchcode.codingevents.models.EventType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("events")
public class EventController {

    @Autowired
    private EventRepository eventRepository;


    @GetMapping
    public String displayAllEvents(Model model){
        model.addAttribute("events", eventRepository.findAll());
        return "events/index";
    }

    @GetMapping("create")
    public String displayCreateEventForm(Model model){
        model.addAttribute("title", "Create Event");
        model.addAttribute(new Event());
        model.addAttribute("types",EventType.values());
        return "events/create";
    }


    @PostMapping("create")
    public String createEvent(@ModelAttribute @Valid Event newEvent, Errors errors, Model model){
        if(errors.hasErrors()){
            model.addAttribute("title", "Create Event");
            return "events/create";

        }
        eventRepository.save(newEvent);
        return "redirect:";

    }

    @GetMapping("delete")
    public String displayDeleteEventForm(Model model){
        model.addAttribute("title", "Delete Events");
        model.addAttribute("events", eventRepository.findAll());
        return "events/delete";
    }
    @PostMapping("delete")
    public String deleteEvents(@RequestParam(required = false) int [] eventIds){
        if(eventIds != null){
            for(int id : eventIds){
                eventRepository.deleteById(id);
            }
        }

        return "redirect:";
    }

//    @GetMapping("edit/{eventId}")
//    public String displayEditForm(Model model, @PathVariable(required = false) int eventId){
//       Event event = EventData.getById(eventId);
//       model.addAttribute(event);
//        model.addAttribute("title","Edit Event " + event.getName() + " id- " +event.getId());
//        return "/events/edit";
//    }
//
//    @PostMapping("edit")
//    public String processEditForm(int eventId, String name, String description,String contactEmail, String location, boolean registration,int numOfAttendees, boolean covidPositive, EventType type){
//            Event event = EventData.getById(eventId);
//            event.getId();
//            event.setName(name);
//            event.setDescription(description);
//            event.setContactEmail((contactEmail));
//            event.setLocation(location);
//            event.setRegistration(registration);
//            event.setNumOfAttendees(numOfAttendees);
//            event.setCovidPositive(covidPositive);
//            event.setType(type);
//            EventData.add(event);
//
//            return "redirect:";
//        }
}



