package com.example.spring_backend.services;

import com.example.spring_backend.CSVHelper;
import com.example.spring_backend.model.UniversityCourses;
import com.example.spring_backend.repository.UniversityCoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

@Service
public class CSVService {

    @Autowired
    UniversityCoursesRepository universityCoursesRepository;

    public void save(MultipartFile file){
        try {
            List<UniversityCourses> tutorials = CSVHelper.csvToTutorials(file.getInputStream());

            //System.out.print(tutorials.size());
            universityCoursesRepository.saveAll(tutorials);
        } catch (IOException e) {
            System.out.print(e.getMessage().toString());
            throw new RuntimeException("fail to store csv data: " + e.getMessage());
        }
    }

    public ByteArrayInputStream load() {
        List<UniversityCourses> unicourseList = universityCoursesRepository.findAll();

        ByteArrayInputStream in = CSVHelper.tutorialToCSV(unicourseList);
        return in;
    }

    public List<UniversityCourses> getAllCourses() {
        return universityCoursesRepository.findAll();
    }

}