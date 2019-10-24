package com.example.CourseBookingSystem.repositories.CustomerRepository;

import com.example.CourseBookingSystem.models.Booking;
import com.example.CourseBookingSystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {

    @Query(
            value = "SELECT * " +
                    "FROM customers " +
                    "INNER JOIN bookings ON customers.id = bookings.customer_id " +
                    "WHERE bookings.course_id = ?1",
            nativeQuery = true)
    List<Customer> findAllCustomersForAGivenCourse(Long courseId);

}
