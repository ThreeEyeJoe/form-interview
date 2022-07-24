package com.alansari.app.rest.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;
import java.util.UUID;

public class Person {
    private final UUID id;
    private final String name; //add first name and last name
    //@Digits(message = "civil id must be 12 digits long.", fraction=0, integer = 12) this method did not work so i opted for an if else statement instead.
    @Size(min=12, max=12)
    private final String civilId;
    private final String email;

    //private String pass;


    public Person(@JsonProperty("id") UUID id,@JsonProperty("name") String name,@JsonProperty("civilId") String civilId,@JsonProperty("email") String email){
        this.id = id;
        this.name = name;
        this.civilId = civilId;
        this.email = email;
    }



    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCivilId() {
        if (civilId.length() == 12) {
            return civilId;
        } else {
            return "civil id must be 12 digits";
        }
    }

    public String getEmail() {
        return email;
    }
}
