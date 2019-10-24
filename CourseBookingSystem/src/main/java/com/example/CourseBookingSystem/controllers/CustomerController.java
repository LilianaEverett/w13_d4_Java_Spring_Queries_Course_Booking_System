package com.example.CourseBookingSystem.controllers;

import com.example.CourseBookingSystem.models.Customer;
import com.example.CourseBookingSystem.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/bookings/course/{courseId}")
    public List<Customer> findAllCustomersForAGivenCourse(@PathVariable Long courseId) {
        return customerRepository.findAllCustomersForAGivenCourse(courseId);
    };
}
