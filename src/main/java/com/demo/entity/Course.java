package com.demo.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="courses")
public class Course {
    
    @Id
    @Column(name="course_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String coursename;

    @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinTable(name="course_coursecontents_mapping" ,
    joinColumns = @JoinColumn(name="course_id"),
    inverseJoinColumns = @JoinColumn(name="content_id"))
    @JsonIgnore
    private Set<CourseContent> courseContent = new HashSet<>();
    
    
    public void setId(int id) {
        this.id = id;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public int getId() {
        return id;
    }

    public String getCoursename() {
        return coursename;
    }

    public Set<CourseContent> getCourseContent() {
        return courseContent;
    }

    public void setCourseContent(Set<CourseContent> courseContent) {
        this.courseContent = courseContent;
    }
}
