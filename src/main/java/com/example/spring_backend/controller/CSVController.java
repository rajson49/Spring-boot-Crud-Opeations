package com.example.spring_backend.controller;


import com.example.spring_backend.CSVHelper;
import com.example.spring_backend.ResponseMessage;
import com.example.spring_backend.model.UniversityCourses;
import com.example.spring_backend.services.CSVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;


//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
@RestController
public class CSVController {

    @Autowired
    CSVService csvService;

    //uploadFile(): Used to upload the File.
    //@CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/upload")
    public ResponseEntity<ResponseMessage> uploadFile
            (@RequestParam("file")MultipartFile file){
        String message="";
        //System.out.print("it's called ");
        if(CSVHelper.hasCSVFormat(file)){

            try{

                csvService.save(file);

                message="Uploaded the file successfully:"+file.getOriginalFilename();

                String fileDownloadUri=
                        ServletUriComponentsBuilder.fromCurrentContextPath()
                                .path("/api/v1/download/")
                                .path(file.getOriginalFilename())
                                .toUriString();

                return ResponseEntity.status(HttpStatus.OK)
                        .body(new ResponseMessage(message,fileDownloadUri));

            }catch (Exception e){
                message = "Could not upload the file: " + file.getOriginalFilename() + "!" + e.getMessage();
                return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED)
                        .body(new ResponseMessage(message,""));

            }

        }

        message = "Please upload a csv file!";
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).
                body(new ResponseMessage(message,""));
    }

    //getAllTutorials(): To get all the list of developer tutorials from the database.
    @GetMapping("/tutorials")
    public ResponseEntity<List<UniversityCourses>> getAllCourses() {
        try {
            List<UniversityCourses> tutorials = csvService.getAllCourses();

            if (tutorials.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(tutorials, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //downloadFile(): In order to download the CSV file.
    @GetMapping("/download/{fileName:.+}")
    public ResponseEntity<Resource> downloadFile(@PathVariable String fileName) {
        InputStreamResource file = new InputStreamResource(csvService.load());

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + fileName)
                .contentType(MediaType.parseMediaType("application/csv"))
                .body(file);
    }
}


