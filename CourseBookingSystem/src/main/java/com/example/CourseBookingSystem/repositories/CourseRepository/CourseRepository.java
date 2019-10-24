package com.example.CourseBookingSystem.repositories.CourseRepository;

import com.example.CourseBookingSystem.models.Course;
import com.example.CourseBookingSystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findByRating(int rating);

    List<Course> findAllCoursesForAGivenCustomer(Long customerId);


//    @Query(
//            value = "SELECT *" +
//                    "FROM courses" +
//                    "INNER JOIN bookings ON courses.id = bookings.course_id" +
//                    "WHERE bookings.customer_id = customerId",
//            nativeQuery = true)
//            List< Customer > findAllCoursesForAGivenCustomer(Long customerId);
}
