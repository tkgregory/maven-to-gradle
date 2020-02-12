package com.tomgregory.maventogradle.controller;

import com.tomgregory.maventogradle.entity.Vegetable;
import com.tomgregory.maventogradle.repository.VegetableRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
public class VegetableController {

    private final VegetableRepository vegetableRepository;

    public VegetableController(VegetableRepository vegetableRepository) {
        this.vegetableRepository = vegetableRepository;
    }

    @GetMapping(value = "/vegetables")
    public String sayHello() {
        String vegetables = StreamSupport.stream(vegetableRepository.findAll().spliterator(), false)
                .map(Vegetable::toString)
                .collect(Collectors.joining("<br/>"));

        return String.format("Hello awesome people! <br/><br/>%s", vegetables);
    }
}
