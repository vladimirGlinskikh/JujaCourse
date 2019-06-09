package anotherExperiments.apachePOI.style;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.FileOutputStream;
import java.io.IOException;

public class StyleExcel {
    public static void main(String[] args) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/excelBook.xls")) {
            Workbook workbook = new HSSFWorkbook();
            Sheet sheet = workbook.createSheet("style");
            Row row = sheet.createRow(0);
            Cell cell = row.createCell(0);
            cell.setCellValue("Hello Juja");

            CellStyle style = workbook.createCellStyle();
            style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            style.setFillForegroundColor(IndexedColors.YELLOW.getIndex());

            Font font = workbook.createFont();
            font.setFontName("Courier New");
            font.setFontHeightInPoints((short) 15);
            font.setBold(true);

            style.setFont(font);

            cell.setCellStyle(style);

            workbook.write(fileOutputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
