package com.example.spring_backend;

import com.example.spring_backend.model.UniversityCourses;
import org.apache.commons.csv.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.io.*;
import java.util.*;

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
            for (CSVRecord csvRecord : csvParser) {
                //System.out.println(csvRecord);
                UniversityCourses readCSVObject = new UniversityCourses();
                Map<String, String> map = csvRecord.toMap();

                for (Map.Entry<String, String> entry : map.entrySet()) {

                    //System.out.println(entry.getKey());

                    switch (entry.getKey()){

                        case "degree":
                            readCSVObject.setDegree(entry.getValue());
                            break;
                        case "durationInSemester":
                            readCSVObject.setDurationInSemester(entry.getValue());
                            break;
                        case "title":
                            readCSVObject.setTitle(entry.getValue());
                            break;
                        case "summary":
                            readCSVObject.setSummary(entry.getValue());
                            break;
                        case "overview":
                            readCSVObject.setOverview(entry.getValue());
                            break;
                        case "logo":
                            readCSVObject.setLogo(entry.getValue());
                            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
                            break;
                        case "level":
                            readCSVObject.setLevel(entry.getValue());
                            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
                            break;
                        case "category":
                            readCSVObject.setCategory(entry.getValue());
                            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
                            break;
                        case "totalCredit":
                            readCSVObject.setTotalCredit(entry.getValue());
                            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
                            break;
                        case "totalCreditUnit":
                            readCSVObject.setTotalCreditUnit(entry.getValue());
                            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
                            break;
                        case "tuitionFee":
                            readCSVObject.setTuitionFee(entry.getValue());
                            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
                            break;
                        case "tuitionFeeCurrency":
                            readCSVObject.setTuitionFreeCurrency(entry.getValue());
                            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
                            break;
                        case "outline":
                            readCSVObject.setOutline(entry.getValue());
                            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
                            break;
                        case "languages":
                            readCSVObject.setLanguages(entry.getValue());
                            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
                            break;
                        case "durationInMonth":
                            readCSVObject.setDurationInMonth(entry.getValue());
                            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
                            break;
                        case "instituteId":
                            readCSVObject.setInstituteId(entry.getValue());
                            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
                            break;
                        case "instituteName":
                            readCSVObject.setInstituteName(entry.getValue());
                            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
                            break;
                        case "institutePriority":
                            readCSVObject.setInstitutePriority(entry.getValue());
                            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
                            break;
                        case "livingCostMin":
                            readCSVObject.setLivingCostMin(entry.getValue());
                            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
                            break;
                        case "livingCostMax":
                            readCSVObject.setLivingCostMax(entry.getValue());
                            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
                            break;
                        case "livingCostCurrency":
                            readCSVObject.setLivingCostCurrency(entry.getValue());
                            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
                            break;
                        case "livingCostDetails":
                            readCSVObject.setLivingCostDetails(entry.getValue());
                            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
                            break;
                        case "locations__street":
                            readCSVObject.setLocations__street(entry.getValue());
                            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
                            break;
                        case "locations__city":
                            readCSVObject.setLocations__city(entry.getValue());
                            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
                            break;
                        case "locations__country":
                            readCSVObject.setLocations__country(entry.getValue());
                            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
                            break;
                        case "locations__zip":
                            readCSVObject.setLocations__zip(entry.getValue());
                            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
                            break;
                        case "locations__location":
                            readCSVObject.setLocations__location(entry.getValue());
                            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
                            break;
                        case "deadlines__dayOfMonth":
                            readCSVObject.setDeadlines__dayOfMonth(entry.getValue());
                            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
                            break;
                        case "deadlines__semester":
                            readCSVObject.setDeadlines__semester(entry.getValue());
                            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
                            break;
                        case "deadlines__applicant":
                            readCSVObject.setDeadlines__applicant(entry.getValue());
                            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
                            break;
                        case "requiredLanguageTests__testName":
                            readCSVObject.setRequiredLanguageTests__testName(entry.getValue());
                            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
                            break;
                        case "requiredLanguageTests__minScore":
                            readCSVObject.setRequiredLanguageTests__minScore(entry.getValue());
                            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
                            break;
                        case "requiredLanguageTests__minScoreLabel":
                            readCSVObject.setRequiredLanguageTests__minScoreLabel(entry.getValue());
                            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
                            break;
                        case "admission_requirement_minimum_level":
                            readCSVObject.setAdmission_requirement_minimum_level(entry.getValue());
                            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
                            break;
                        case "minimum_level_text":
                            readCSVObject.setMinimum_level_text(entry.getValue());
                            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
                            break;
                        case "admission_exam":
                            readCSVObject.setAdmission_exam(entry.getValue());
                            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
                            break;
                        case "sop":
                            readCSVObject.setSop(entry.getValue());
                            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
                            break;
                        case "cv":
                            readCSVObject.setCv(entry.getValue());
                            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
                            break;
                        case "other_requirements":
                            readCSVObject.setOther_requirements(entry.getValue());
                            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
                            break;
                        case "fundingList__by":
                            readCSVObject.setFundingList__by(entry.getValue());
                            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
                            break;
                        case "fundingList__requirement":
                            readCSVObject.setFundingList__requirement(entry.getValue());
                            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
                            break;
                        case "fundingList__applicationProcess":
                            readCSVObject.setFundingList__applicationProcess(entry.getValue());
                            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
                            break;
                        case "fundingList__amountMax":
                            readCSVObject.setFundingList__amountMax(entry.getValue());
                            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
                            break;
                        case "fundingList__currency":
                            readCSVObject.setFundingList__currency(entry.getValue());
                            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
                            break;
                        case "official":
                            readCSVObject.setOfficial(entry.getValue());
                            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
                            break;
                        case "partTime":
                            readCSVObject.setPartTime(entry.getValue());
                            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
                            break;
                        case "fullTime":
                            readCSVObject.setFullTime(entry.getValue());
                            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
                            break;
                        case "faceToFace":
                            readCSVObject.setFaceToFace(entry.getValue());
                            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
                            break;
                        case "online":
                            readCSVObject.setOnline(entry.getValue());
                            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
                            break;
                        case "blended":
                            readCSVObject.setBlended(entry.getValue());
                            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
                            break;
                        case "pictures":
                            readCSVObject.setPictures(entry.getValue());
                            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
                            break;

                    }
                   // System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
                }
                universityCoursesList.add(readCSVObject);
            }

            System.out.print("List Size="+universityCoursesList.size());
            return universityCoursesList;
        } catch (IOException e) {
            throw new RuntimeException("fail to parse CSV file: " + e.getMessage());
        }
    }


    public static List<UniversityCourses> xlxsToMySql(MultipartFile file)  {

        List<UniversityCourses> universityCoursesList = new ArrayList<>();
        XSSFWorkbook wb = null;
        try {
            wb = new XSSFWorkbook(file.getInputStream());
            System.out.println("called");
            XSSFSheet sheet = wb.getSheetAt(0);     //creating a Sheet object to retrieve object
            Iterator<Row> itr = sheet.iterator();    //iterating over excel file

            while (itr.hasNext())
            {
                Row row = itr.next();
                Iterator<Cell> cellIterator = row.cellIterator();   //iterating over each column
                //System.out.println(row.getRowNum());
                if(row.getRowNum()!=0) {

                    try{

                        UniversityCourses universityCourses = new UniversityCourses();

                        universityCourses.setTitle(row.getCell(0).getStringCellValue());
                        universityCourses.setSummary(row.getCell(1).getStringCellValue());
                        universityCourses.setOverview(row.getCell(2).getStringCellValue());
                        System.out.print(row.getCell(3).getStringCellValue());
                        universityCourses.setLogo(row.getCell(3).getStringCellValue());
                        universityCourses.setLevel(row.getCell(4).getStringCellValue());
                        universityCourses.setCategory(row.getCell(5).getStringCellValue());
                        universityCourses.setDegree(row.getCell(6).getStringCellValue());
                        universityCourses.setTotalCredit(row.getCell(7).getStringCellValue());
                        universityCourses.setTotalCreditUnit(row.getCell(8).getStringCellValue());
                        universityCourses.setTuitionFee(row.getCell(9).getStringCellValue());
                        universityCourses.setTuitionFeeUnit(row.getCell(10).getStringCellValue());
                        universityCourses.setTuitionFreeCurrency(row.getCell(11).getStringCellValue());
                        universityCourses.setOutline(row.getCell(12).getStringCellValue());
                        universityCourses.setLanguages(row.getCell(13).getStringCellValue());
                        universityCourses.setDurationInMonth(row.getCell(14).getStringCellValue());
                        universityCourses.setDurationInSemester(row.getCell(15).getStringCellValue());
                        universityCourses.setInstituteId(row.getCell(16).getStringCellValue());
                        universityCourses.setInstituteName(row.getCell(17).getStringCellValue());
                        universityCourses.setInstitutePriority(row.getCell(18).getStringCellValue());
                        universityCourses.setLivingCostMin(row.getCell(19).getStringCellValue());
                        universityCourses.setLivingCostMax(row.getCell(20).getStringCellValue());
                        universityCourses.setLivingCostCurrency(row.getCell(21).getStringCellValue());
                        universityCourses.setLivingCostDetails(row.getCell(22).getStringCellValue());
                        universityCourses.setLocations__street(row.getCell(23).getStringCellValue());
                        universityCourses.setLocations__city(row.getCell(24).getStringCellValue());
                        universityCourses.setLocations__country(row.getCell(25).getStringCellValue());
                        universityCourses.setLocations__zip(row.getCell(26).getStringCellValue());
                        universityCourses.setLocations__location(row.getCell(27).getStringCellValue());
                        universityCourses.setDeadlines__dayOfMonth(row.getCell(28).getStringCellValue());
                        universityCourses.setDeadlines__semester(row.getCell(29).getStringCellValue());
                        universityCourses.setDeadlines__applicant(row.getCell(30).getStringCellValue());
                        universityCourses.setRequiredLanguageTests__testName(row.getCell(31).getStringCellValue());
                        universityCourses.setRequiredLanguageTests__minScore(row.getCell(32).getStringCellValue());
                        universityCourses.setRequiredLanguageTests__minScoreLabel(row.getCell(33).getStringCellValue());
                        universityCourses.setAdmission_requirement_minimum_level(row.getCell(34).getStringCellValue());
                        universityCourses.setMinimum_level_text(row.getCell(35).getStringCellValue());


                        universityCoursesList.add(universityCourses);

                    }catch (Exception e){
                        continue;
                    }

                }
            }
        } catch (IOException e) {
            e.printStackTrace();

        }

        System.out.println("Length="+universityCoursesList.size());

        return universityCoursesList;
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


    public static boolean hasXlsxFormat(MultipartFile file) {

        if(TYPE.equals(file.getContentType()) ||
                file.getContentType().equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"))
        {
            return true;
        }
        return false;
    }
}
