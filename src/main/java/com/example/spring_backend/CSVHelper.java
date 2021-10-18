package com.example.spring_backend;

import com.example.spring_backend.model.UniversityCourses;
import org.apache.commons.csv.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

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
                     CSVFormat.DEFAULT.withQuote(null).withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());) {

            List<UniversityCourses> universityCoursesList = new ArrayList<>();

            System.out.println(csvParser.getHeaderNames());


            for (CSVRecord csvRecord : csvParser) {
                System.out.println(csvRecord);

                UniversityCourses readCSVObject = new UniversityCourses();
                Map<String, String> map = csvRecord.toMap();
               /* for (Map.Entry<String, String> entry : map.entrySet()) {
                    //System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());

                    switch (entry.getKey()){
                        case "Id":readCSVObject.setId(Long.parseLong(entry.getValue()));
                        break;
                        case "title":readCSVObject.setTitle(entry.getValue());
                        break;
                        case "summary":readCSVObject.setSummary(entry.getValue());
                        break;
                        case "overview":readCSVObject.setOverview(entry.getValue());
                        break;
                        case "logo":readCSVObject.setLogo(entry.getValue());
                        break;
                        case "level":readCSVObject.setLevel(entry.getValue());
                        break;
                        case "category":readCSVObject.setCategory(entry.getValue());
                        break;
                        case "degree":readCSVObject.setDegree(entry.getValue());
                        break;
                        case "totalCredit":readCSVObject.setTotalCredit(entry.getValue());
                        break;
                        case "totalCreditUnit":readCSVObject.setTotalCreditUnit(entry.getValue());
                        break;
                        case "tuitionFee":readCSVObject.setTuitionFee(entry.getValue());
                        break;
                        case "tuitionFeeUnit":readCSVObject.setTuitionFeeUnit(entry.getValue());
                        break;
                        case "tuitionFeeCurrency":readCSVObject.setTuitionFreeCurrency(entry.getValue());
                        break;
                        case "outline":readCSVObject.setOnline(entry.getValue());
                        break;
                        case "languages":readCSVObject.setLanguages(entry.getValue());
                        break;
                        case "durationInMonth":readCSVObject.setDurationInMonth(entry.getValue());
                        break;
                        case "durationInSemester":readCSVObject.setDurationInSemester(entry.getValue());
                        break;
                        case "instituteId":readCSVObject.setInstituteId(entry.getValue());
                        break;
                        case "instituteName":readCSVObject.setInstituteName(entry.getValue());
                        break;
                        case "institutePriority":readCSVObject.setInstitutePriority(entry.getValue());
                        break;
                        case "livingCostMin":readCSVObject.setLivingCostMin(entry.getValue());
                        break;
                        case "livingCostMax":readCSVObject.setLivingCostMax(entry.getValue());
                        break;
                        case "livingCostCurrency":readCSVObject.setLivingCostCurrency(entry.getValue());
                        break;
                        case "livingCostDetails":readCSVObject.setLivingCostDetails(entry.getValue());
                        break;
                        case "locations__street":readCSVObject.setLocations__street(entry.getValue());
                        break;
                        case "locations__city":readCSVObject.setLocations__city(entry.getValue());
                        break;
                        case "locations__country":readCSVObject.setLocations__country(entry.getValue());
                        break;
                        case "locations__zip":readCSVObject.setLocations__zip(entry.getValue());
                        break;
                        case "locations__location":readCSVObject.setLocations__location(entry.getValue());
                        break;
                        case "deadlines__dayOfMonth":readCSVObject.setDeadlines__dayOfMonth(entry.getValue());
                        break;
                        case "deadlines__semester":readCSVObject.setDeadlines__semester(entry.getValue());
                        break;
                        case "deadlines__applicant":readCSVObject.setDeadlines__applicant(entry.getValue());
                        break;
                        case "requiredLanguageTests__testName":readCSVObject.setRequiredLanguageTests__testName(entry.getValue());
                        break;
                        case "requiredLanguageTests__minScore":readCSVObject.setRequiredLanguageTests__minScore(entry.getValue());
                        break;
                        case "requiredLanguageTests__minScoreLabel":readCSVObject.setRequiredLanguageTests__minScoreLabel(entry.getValue());
                        break;
                        case "admission_requirement_minimum_level":readCSVObject.setAdmission_requirement_minimum_level(entry.getValue());
                        break;
                        case "minimum_level_text":readCSVObject.setMinimum_level_text(entry.getValue());
                        break;
                        case "admission_exam":readCSVObject.setAdmission_exam(entry.getValue());
                        break;
                        case "sop":readCSVObject.setSop(entry.getValue());
                        break;
                        case "cv":readCSVObject.setCv(entry.getValue());
                        break;
                        case "other_requirements":readCSVObject.setOther_requirements(entry.getValue());
                        break;
                        case "fundingList__by":readCSVObject.setFundingList__by(entry.getValue());
                        break;
                        case "fundingList__requirement":readCSVObject.setFundingList__requirement(entry.getValue());
                        break;
                        case "fundingList__applicationProcess":readCSVObject.setFundingList__applicationProcess(entry.getValue());
                        break;
                        case "fundingList__amountMax":readCSVObject.setFundingList__amountMax(entry.getValue());
                        break;
                        case "fundingList__currency":readCSVObject.setFundingList__currency(entry.getValue());
                        break;
                        case "official":readCSVObject.setOfficial(entry.getValue());
                        break;
                        case "partTime":readCSVObject.setPartTime(entry.getValue());
                        break;
                        case "fullTime":readCSVObject.setFullTime(entry.getValue());
                        break;
                        case "faceToFace":readCSVObject.setFaceToFace(entry.getValue());
                        break;
                        case "online":readCSVObject.setOnline(entry.getValue());
                        break;
                        case "blended":readCSVObject.setBlended(entry.getValue());
                        break;
                        case "pictures":readCSVObject.setPictures(entry.getValue());
                        break;
                    }

                }*/
                universityCoursesList.add(readCSVObject);

            }

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
                        String.valueOf(universityCourse.getTitle()),
                        universityCourse.getTitle(),
                        universityCourse.getSummary(),
                        universityCourse.getOverview()
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
