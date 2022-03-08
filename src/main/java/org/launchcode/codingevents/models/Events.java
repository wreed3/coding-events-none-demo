//package org.launchcode.codingevents.models;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.validation.constraints.Email;
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.Size;
//
//@Entity
//public class Events {
//
//    @Id
//    @GeneratedValue
//    private int id;
//
//
//    @NotBlank(message = "Name is required")
//    @Size(min = 3, max = 50, message = "Name must be between 3 and  50 characters")
//    private String name;
//
//    @Size(max = 500, message = "Description too long!")
//    private String description;
//
//    @NotBlank(message = "Email is required")
//    @Email(message = "Invalid email. Try again.")
//    private String contactEmail;
//
//    private EventType type;
//
//    public Events() {
//    }
//
//    public Events(String name, String description, String contactEmail, EventType type) {
//        this.name = name;
//        this.description = description;
//        this.contactEmail = contactEmail;
//        this.type = type;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public String getContactEmail() {
//        return contactEmail;
//    }
//
//    public void setContactEmail(String contactEmail) {
//        this.contactEmail = contactEmail;
//    }
//
//    public EventType getType() {
//        return type;
//    }
//
//    public void setType(EventType type) {
//        this.type = type;
//    }
//
//
//}