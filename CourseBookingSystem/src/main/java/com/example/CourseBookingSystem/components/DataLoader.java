package com.example.CourseBookingSystem.components;

import com.example.CourseBookingSystem.models.Booking;
import com.example.CourseBookingSystem.models.Course;
import com.example.CourseBookingSystem.models.Customer;
import com.example.CourseBookingSystem.repositories.BookingRepository;
import com.example.CourseBookingSystem.repositories.CourseRepository;
import com.example.CourseBookingSystem.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

    public DataLoader() {}

    public void run(ApplicationArguments args) {

        Customer customer1 = new Customer("Liliana", "Alverca", 40);
        customerRepository.save(customer1);

        Course course1 = new Course("Intro to Java", "Edunburgh", 5);
        courseRepository.save(course1);

        Booking booking1 = new Booking("11-11-19", customer1, course1);
        bookingRepository.save(booking1);






    }
}
