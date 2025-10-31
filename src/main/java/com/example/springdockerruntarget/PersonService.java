package com.example.springdockerruntarget;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepository personRepository;
    private final GreetingService greetingService;

    PersonService(PersonRepository personRepository, GreetingService greetingService) {
        this.personRepository = personRepository;
        this.greetingService = greetingService;
    }

    public List<Person> getAllPerson() {
        System.out.println(greetingService.greet());
        Iterable<Person> all = personRepository.findAll();
        return (List<Person>) all;
    }
}
@Service  @Profile("day")
class DayGreeting implements GreetingService {
    @Value("${greeting:good morning!}")
    String greeting;
    @Override
    public String greet() {
        return greeting;
    }
}
@Service @Profile("night")
class NightGreeting implements GreetingService {

    @Value("${greeting:good evening!}")
    String greeting;
    @Override
    public String greet() {
        return greeting;
    }
}

