package anotherExperiments.apachePOI.read;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcel {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("src/main/resources/excelBook.xls")) {
            Workbook workbook = new HSSFWorkbook(fileInputStream);
            String result = workbook.getSheetAt(0).getRow(3).getCell(5).getStringCellValue();
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
