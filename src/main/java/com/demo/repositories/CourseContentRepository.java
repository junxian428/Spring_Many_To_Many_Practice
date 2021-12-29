package com.demo.repositories;

import com.demo.entity.CourseContent;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseContentRepository extends JpaRepository<CourseContent, Integer> {

    public CourseContent findById(int id);
}
    

