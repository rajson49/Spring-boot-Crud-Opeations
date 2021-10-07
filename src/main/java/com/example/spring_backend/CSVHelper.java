package com.example.spring_backend;

import com.example.spring_backend.model.UniversityCourses;
import org.apache.commons.csv.*;
import org.springframework.web.multipart.MultipartFile;

import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVHelper {

    public static String TYPE="text/csv";

    static String[] Headers={
      "id","first_name","last_name","email"
    };


    public static boolean hasCSVFormat(MultipartFile file){

        if(TYPE.equals(file.getContentType()) ||
                file.getContentType().equals("application/vnd.ms-excel"))
        {
            return true;
        }
        return false;
    }

    public static List<UniversityCourses> csvToTutorials(InputStream is) {
        try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
             CSVParser csvParser = new CSVParser(fileReader,
                     CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());) {

            List<UniversityCourses> universityCoursesList = new ArrayList<>();

            //System.out.println(csvParser.getHeaderNames());
            //System.out.println(csvParser.getRecords());

            List<CSVRecord> csvRecords = csvParser.getRecords();
            System.out.println("List Size="+csvRecords.size());

            System.out.println("Simple="+(csvRecords.get(0)).getClass().getSimpleName());


            System.out.print("List Size="+universityCoursesList.size());
            return universityCoursesList;
        } catch (IOException e) {
            throw new RuntimeException("fail to parse CSV file: " + e.getMessage());
        }
    }

    public static ByteArrayInputStream tutorialToCSV(List<UniversityCourses> universityCoursesList){

        final CSVFormat format=
                CSVFormat.DEFAULT.withQuoteMode(QuoteMode.MINIMAL);

        try (ByteArrayOutputStream out = new ByteArrayOutputStream();
             CSVPrinter csvPrinter = new CSVPrinter(new PrintWriter(out), format);) {
            for (UniversityCourses universityCourse : universityCoursesList) {
                List<String> data = Arrays.asList(
                        String.valueOf(universityCourse.getFirst_name()),
                        universityCourse.getFirst_name(),
                        universityCourse.getLast_name(),
                        universityCourse.getEmail_id()
                );

                csvPrinter.printRecord(data);
            }

            csvPrinter.flush();
            return new ByteArrayInputStream(out.toByteArray());
        } catch (IOException e) {
            throw new RuntimeException("fail to import data to CSV file: " + e.getMessage());
        }
    }





}
