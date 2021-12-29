package com.demo.services;

import java.util.stream.Collectors;

import com.demo.PosJos.CouseRequest;
import com.demo.entity.Course;
import com.demo.entity.CourseContent;
import com.demo.repositories.CourseContentRepository;
import com.demo.repositories.CourseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    
    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CourseContentRepository courseContentRepository;

    public CourseService() {
    }


    public Course addCourseWithContents(CouseRequest courseRequest) {
        Course course = new Course();
        course.setId(courseRequest.id);
        course.setCoursename(courseRequest.coursename);
        course.setCourseContent(courseRequest.courseContent
        .stream()
        .map(courseContent -> {
            CourseContent ccontents = courseContent;
            if(ccontents.getId() > 0) {
                ccontents = courseContentRepository.findById(ccontents.getId());
            }
            ccontents.addCourse(course);
            return ccontents;
        })
        .collect(Collectors.toSet()));
        
        return courseRepository.save(course);
    }
}
