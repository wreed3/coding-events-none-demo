//package org.launchcode.codingevents.controllers;
//
//import org.launchcode.codingevents.data.EventRepository;
//import org.launchcode.codingevents.models.EventType;
//import org.launchcode.codingevents.models.Event;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.Errors;
//import org.springframework.web.bind.annotation.*;
//
//import javax.validation.Valid;
//
//@Controller
//@RequestMapping(value = "events")
//public class EventsController {
//
//    @Autowired
//    private EventRepository eventsRepository;
//
//    @GetMapping
//    public String displayAllEvents(Model model){
//        model.addAttribute("events", eventRepository.findAll());
//        return "events/index";
//    }
//
//    @GetMapping(value = "create")
//    public String displayCreateEventForm(Model model){
//        model.addAttribute("title", "Create Event");
//        model.addAttribute(new Event());
//        model.addAttribute("types", EventType.values());
//        return "events/create";
//    }
//
//
//    @PostMapping(value ="create")
//    public String createEvent(@ModelAttribute @Valid Event newEvents, Errors errors, Model model){
//        if(errors.hasErrors()){
//            model.addAttribute("title", "Create Event");
//            return "events/create";
//
//        }
//        eventRepository.save(newEvents);
//        return "redirect:";
//
//    }
//
//    @GetMapping(value = "delete")
//    public String displayDeleteEventForm(Model model){
//        model.addAttribute("title", "Delete Events");
//        model.addAttribute("events", eventRepository.findAll());
//        return "events/delete";
//    }
//
//    @PostMapping(value = "delete")
//    public String deleteEvents(@RequestParam(required = false) int [] eventIds){
//        if(eventIds != null){
//            for(int id : eventIds){
//                eventsRepository.deleteById(id);
//            }
//        }
//
//        return "redirect:";
//    }
//
////    @GetMapping("edit/{eventId}")
////    public String displayEditForm(Model model, @PathVariable(required = false) int eventId, Events event){
////        model.addAttribute(eventsRepository.findById(eventId));
////        model.addAttribute("title","Edit Event " + event.getName() + " id- " + event.getId());
////        return "/events/edit";
////    }
////
////    @PostMapping("edit")
////    public String processEditForm(int eventId, String name, String description,String contactEmail, EventType type){
////        Events event = EventsData.getById();
////        event.getId();
////        event.setName(name);
////        event.setDescription(description);
////        event.setContactEmail((contactEmail));
////        event.setType(type);
////        EventsData.add(event);
////
////        return "redirect:";
////    }
//}
//
