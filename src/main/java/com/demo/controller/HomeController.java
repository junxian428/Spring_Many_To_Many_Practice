package com.demo.controller;

import java.util.List;

import com.demo.PosJos.CouseRequest;
import com.demo.entity.Course;
import com.demo.services.CourseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

    @Autowired 
    CourseService courseService;
    
    @PostMapping("addCourse")
    public Course addCourse(@RequestBody CouseRequest courseRequest) {
       return courseService.addCourseWithContents(courseRequest);
    }

}
