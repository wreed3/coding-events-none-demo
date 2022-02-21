package org.launchcode.codingevents.controllers;


import org.launchcode.codingevents.data.EventData;
import org.launchcode.codingevents.models.Event;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("events")
public class EventController {


    @GetMapping
    public String displayAllEvents(Model model){
        model.addAttribute("events", EventData.getAll());
        return "events/index";
    }

    @GetMapping("create")
    public String renderCreateEventForm(Model model){
        model.addAttribute("title", "Create Event");
        model.addAttribute(new Event());
        return "events/create";
    }


    @PostMapping("create")
    public String createEvent(@ModelAttribute @Valid Event newEvent, Errors errors, Model model){
        if(errors.hasErrors()){
            model.addAttribute("title", "Create Event");
            return "events/create";

        }
        EventData.add(newEvent);
        return "redirect:";

    }

    @GetMapping("delete")
    public String displayDeleteEventForm(Model model){
        model.addAttribute("title", "Delete Events");
        model.addAttribute("events", EventData.getAll());
        return "events/delete";
    }
    @PostMapping("delete")
    public String deleteEvents(@RequestParam(required = false) int [] eventIds){
        if(eventIds != null){
            for(int id : eventIds){
                EventData.remove(id);
            }
        }

        return "redirect:";
    }

    @GetMapping("edit/{eventId}")
    public String displayEditForm(Model model, @PathVariable(required = false) int eventId){
       Event event = EventData.getById(eventId);
       model.addAttribute(event);
        model.addAttribute("title","Edit Event " + event.getName() + " id- " +event.getId());
        return "/events/edit";
    }

    @PostMapping("edit")
    public String processEditForm(int eventId, String name, String description){
            Event event = EventData.getById(eventId);
            event.getId();
            event.setName(name);
            event.setDescription(description);
            EventData.add(event);

            return "redirect:";
        }
}



