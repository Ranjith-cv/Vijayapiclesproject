package utilityvj;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Vputilityclass {
	public static String getCellValue(String xl, String Sheet1, int r, int c)

    {
        try

              {

        	// File f=new File(xl);
           	FileInputStream fi=new FileInputStream(xl);
           		XSSFWorkbook wb=new XSSFWorkbook(fi); 

                           XSSFCell cell =wb.getSheet(Sheet1).getRow(r).getCell(c);
                 if(cell.getCellType()==CellType.STRING)
                 {
                            return cell.getStringCellValue();

                              
                 }
                 else
                 {
                	// double v= cell.getNumericCellValue();
                	//return String.valueOf(v);
                	 return cell.getRawValue();
                	// cell.get
                 }
              }
                              catch (Exception e)

                              {

                                              return "";

                              }

              }

              public static int getRowCount (String xl, String Sheet1)

              {

                  try

                       {

                	//  File f=new File(xl);
              	FileInputStream fi=new FileInputStream(xl);
              		XSSFWorkbook wb=new XSSFWorkbook(fi); 

                           return wb.getSheet(Sheet1).getLastRowNum();

                              }

                              catch (Exception e)

                              {

                                return 0;

                              }
              }


}
