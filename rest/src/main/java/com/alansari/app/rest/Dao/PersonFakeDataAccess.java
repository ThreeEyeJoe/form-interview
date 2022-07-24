package com.alansari.app.rest.Dao;

import com.alansari.app.rest.Model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeDao")
public class PersonFakeDataAccess implements PersonDao{

    private static List<Person> db = new ArrayList<>();     //array list to add person data to.

    @Override
    public int insertPerson(UUID id, Person person) {
        db.add(new Person(id,person.getName(),person.getCivilId(),person.getEmail()));
        return 1; //add always works if return is 1, so adding a if statement that would check if the id is 12 digits would be the next step!!!
    }


    @Override
    public List<Person> selectAllPeople() {
        return db;
    }
}
