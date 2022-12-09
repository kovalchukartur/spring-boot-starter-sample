package ua.kovalchuk.poi.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Iterator;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

@Slf4j
public class FileReader {

    public void printToLog(File file) {
        try {
            printToLog(new FileInputStream(file));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void printToLog(InputStream inputStream) {
        try {
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            XSSFSheet sheet = workbook.getSheetAt(0);

            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                Iterator<Cell> cellIterator = row.cellIterator();
                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    switch (cell.getCellType()) {
                        case NUMERIC -> getPrintln(cell.getNumericCellValue());
                        case STRING -> getPrintln(cell.getStringCellValue());
                    }
                }
            }

            inputStream.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void getPrintln(Object value) {
        System.err.println(value + "t");
    }
}
