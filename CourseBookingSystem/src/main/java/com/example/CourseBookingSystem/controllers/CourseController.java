package com.example.CourseBookingSystem.controllers;

import com.example.CourseBookingSystem.models.Customer;
import com.example.CourseBookingSystem.repositories.CourseRepository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/bookings/customer/{customerId}")
    public List<Customer> findAllCoursesForAGivenCustomer(@PathVariable Long customerId) {
        return courseRepository.findAllCoursesForAGivenCustomer(customerId);
    }

}
