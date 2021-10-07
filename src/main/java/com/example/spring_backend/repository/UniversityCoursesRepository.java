package com.example.spring_backend.repository;

import com.example.spring_backend.model.UniversityCourses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversityCoursesRepository extends JpaRepository<UniversityCourses,Long> {
}
