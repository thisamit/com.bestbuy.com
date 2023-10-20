package excelutility;
import java.io.FileInputStream;
import java.io.InputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class getreaddata {
	public static String getExcedata(String path,int rowno,int colno)
	
	{
			   String value="";
		        
		        try{
		            InputStream xlsxDoc = new FileInputStream(path);
		            XSSFWorkbook wb = new XSSFWorkbook(xlsxDoc);
		            XSSFSheet sheet = wb.getSheetAt(0);  
		           value= sheet.getRow(rowno).getCell(colno).getStringCellValue();
		        }
		        catch(Exception e){  
		            e.printStackTrace();
		        }
				return value;
		     }
}
