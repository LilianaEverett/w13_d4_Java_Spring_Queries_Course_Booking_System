package com.example.CourseBookingSystem.repositories.CourseRepository;

import com.example.CourseBookingSystem.models.Course;
import com.example.CourseBookingSystem.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CourseRepositoryImpl implements CourseRepositoryCustomer {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Course> findAllCoursesForAGivenCustomer(Long customerId) {
        List<Course> result = null;
        Session session = entityManager.unwrap(Session.class);
        try{
            Criteria cr = session.createCriteria(Course.class);
            cr.createAlias("bookings", "bookingAlias");
            cr.createAlias("bookingAlias.customer", "customerAlias");
            cr.add(Restrictions.eq("customerAlias.id", customerId));
            result = cr.list();

        }
        catch (HibernateException ex){
            ex.printStackTrace();
        }
        return result;
    }

}
