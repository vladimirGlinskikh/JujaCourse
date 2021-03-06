package anotherExperiments.apachePOI.write;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class JavaExcel {
    public static void main(String[] args) {
        Workbook workbook = new HSSFWorkbook();
        Sheet sheet = workbook.createSheet("book");
        Row row = sheet.createRow(3);
        Cell cell = row.createCell(5);
        cell.setCellValue(45.23);
        try (FileOutputStream fileOutputStream = new FileOutputStream("/home/vladimir/Documents/IdeaProjects/JujaCourse/src/main/resources/excelBook.xls")) {
            workbook.write(fileOutputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
