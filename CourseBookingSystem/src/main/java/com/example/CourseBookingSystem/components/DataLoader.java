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

        Customer customer2 = new Customer("Ian", "Sittingbourne", 25);
        customerRepository.save(customer2);

        Customer customer3 = new Customer("Ross", "Edinburgh", 65);
        customerRepository.save(customer3);

        Course course1 = new Course("Intro to Java", "Edinburgh", 5);
        Course course2 = new Course("Intro to Javascript", "Edinburgh", 4);
        Course course3 = new Course("Intro to Ruby", "Edinburgh", 5);
        courseRepository.save(course1);
        courseRepository.save(course2);
        courseRepository.save(course3);

        Booking booking1 = new Booking("11-11-19", customer1, course1);
        Booking booking2 = new Booking("11-12-19", customer1, course2);
        Booking booking3 = new Booking("11-11-19", customer2, course1);
        bookingRepository.save(booking1);
        bookingRepository.save(booking2);
        bookingRepository.save(booking3);






    }
}
