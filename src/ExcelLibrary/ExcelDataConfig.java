package ExcelLibrary;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ExcelDataConfig {
    XSSFWorkbook wb;
    XSSFSheet Sheet1;

    public ExcelDataConfig (String ExcelPath){
        try{
        File Src = new File(ExcelPath);
        FileInputStream fis = new FileInputStream(Src);
        wb=new XSSFWorkbook(fis);

    }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public String getdata (int sheetno,int row, int column){
        Sheet1=wb.getSheetAt(sheetno);
            String data = Sheet1.getRow(row).getCell(column).getStringCellValue();
        return data;
    }
    public int getRowCount (int Sheetindex){
        int row1= wb.getSheetAt(Sheetindex).getLastRowNum();

        return row1;
    }
}
