package framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.runtime.SwitchBootstraps;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.collections4.functors.SwitchClosure;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class callexcel {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\91807\\eclipse-workspace\\framework\\Excel\\framework.xlsx");
		
		FileInputStream stream = new FileInputStream(file);
		
		Workbook workbook = new XSSFWorkbook(stream);
		
		Sheet sheet = workbook.getSheet("Datas");
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			
			Row row = sheet.getRow(i);
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				
				Cell cell = row.getCell(j);
				
				CellType type = cell.getCellType();
				
				switch (type) {
				case STRING:
					String s = cell.getStringCellValue();
					System.out.println(s);
					break;
					
				case NUMERIC:
					
					double n = cell.getNumericCellValue();
					
					BigDecimal b = BigDecimal.valueOf(n);
					
					String s1 = b.toString();
					
					System.out.println(s1);
					
						
			       default:
					break;
				}
				
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
