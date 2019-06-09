package anotherExperiments.apachePOI.read;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcel {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("src/main/resources/excelBook.xls")) {
            Workbook workbook = new HSSFWorkbook(fileInputStream);
//            String result = workbook.getSheetAt(0).getRow(3).getCell(5).getStringCellValue();
//            System.out.println(result);
            System.out.println(getCellText(workbook.getSheetAt(0).getRow(3).getCell(5)));
            System.out.println(getCellText(workbook.getSheetAt(0).getRow(3).getCell(6)));
            System.out.println(getCellText(workbook.getSheetAt(0).getRow(3).getCell(7)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getCellText(Cell cell) {

        String result = "";

        switch (cell.getCellType()) {
            case STRING:
                result = cell.getRichStringCellValue().getString();
                break;
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    result = cell.getDateCellValue().toString();
                } else {
                    result = Double.toString(cell.getNumericCellValue());
                }
                break;
            case BOOLEAN:
                result = Boolean.toString(cell.getBooleanCellValue());
                break;
            case FORMULA:
                result = cell.getCellFormula().toString();
                break;
            default:
                break;
        }
        return result;
    }
}
