package anotherExperiments.apachePOI.read;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellReference;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ReadExcel {
    public static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
    public static Calendar calendar = Calendar.getInstance();


    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("src/main/resources/excelBook.xls")) {
            Workbook workbook = new HSSFWorkbook(fileInputStream);
//            String result = workbook.getSheetAt(0).getRow(3).getCell(5).getStringCellValue();
//            System.out.println(result);
//            System.out.println(getCellText(workbook.getSheetAt(0).getRow(3).getCell(5)));
//            System.out.println(getCellText(workbook.getSheetAt(0).getRow(3).getCell(6)));
//            System.out.println(getCellText(workbook.getSheetAt(0).getRow(3).getCell(7)));
//            System.out.println(getCellText(workbook.getSheetAt(0).getRow(3).getCell(8)));
            for (Row row : workbook.getSheetAt(0)) {
                for (Cell cell : row) {
                    CellReference cellRef = new CellReference(row.getRowNum(), cell.getColumnIndex());
                    System.out.print(cellRef.formatAsString());
                    System.out.print(" - ");
                    System.out.println(getCellText(cell));
                }
            }
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
                    result = simpleDateFormat.format(calendar.getTime());
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
