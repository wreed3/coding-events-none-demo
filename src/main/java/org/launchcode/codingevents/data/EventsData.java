//package org.launchcode.codingevents.data;
//
//import org.launchcode.codingevents.models.Events;
//
//import java.util.Collection;
//import java.util.HashMap;
//import java.util.Map;
//
//public class EventsData {
//
//    // need a place to put events
//    private static final Map<Integer, Events> event = new HashMap<>();
//
//    // get all events
//    public static Collection<Events> getAll(){
//        return event.values();
//    }
//
//    // get a single event
//    public static Events getById(int id){
//        return event.get(id);
//    }
//
//    // add an event
//    public static void add(Events event){
//        event.put(event.getId(),event);
//    }
//
//    // remove an event
//    public static void remove(int id){
//        event.remove(id);
//    }
//
//}
