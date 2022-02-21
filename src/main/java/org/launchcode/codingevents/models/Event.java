package org.launchcode.codingevents.models;

import javax.validation.constraints.*;
import java.util.Objects;

public class Event {
    private int id;
    private static int nextId = 1;

    @NotBlank(message="Name is required")
    @Size(min=3, max=50, message = "Name must be between 3 and  50 characters")
    private String name;

    @Size(max=500, message = "Description too long!")
    private String description;

    @NotBlank(message="Email is required")
    @Email(message = "Invalid email. Try again.")
    private String contactEmail;

    @NotNull(message="Please provide a location")
    @NotBlank(message="Location is required")
    private String location;

    @AssertTrue(message="Please register")
    boolean registration;

    @Min(value = 1, message="The number of attendees has to be greater than 0")
    @NotNull(message="The number of attendees can not be empty")
    private int numOfAttendees;

    @AssertFalse(message="You can not be COVID positive and attend this event")
    boolean covidPositive;

    public Event(){
        this.id = nextId;
        nextId++;
    }

    public Event(String name, String description, String contactEmail, String location, boolean registration, int numOfAttendees, boolean covidPositive) {
        this();
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.location = location;
        this.registration = registration;
        this.numOfAttendees = numOfAttendees;
        this.covidPositive = covidPositive;
//        this.id = nextId;
//        nextId++;
    }





    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isRegistration() {
        return registration;
    }

    public void setRegistration(boolean registration) {
        this.registration = registration;
    }

    public int getNumOfAttendees() {
        return numOfAttendees;
    }

    public void setNumOfAttendees(int numOfAttendees) {
        this.numOfAttendees = numOfAttendees;
    }

    public boolean isCovidPositive() {
        return covidPositive;
    }

    public void setCovidPositive(boolean covidPositive) {
        this.covidPositive = covidPositive;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }


    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
