package weekone;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviderTest {
	//@DataProvider(name="abc")
	@Test
	public void excelDataprovider() throws InvalidFormatException, IOException{
		File wb = new File("./TestData/TestdataSheetnew.xlsx");
		//XSSFWorkbook vWB = new XSSFWorkbook("./TestData/TestdataSheetnew.xlsx");	
		
		XSSFWorkbook vWB = new XSSFWorkbook("./TestData/TestdataSheetnew.xlsx");
		XSSFSheet vSheet =vWB.getSheetAt(0);
		int rowCounts =vSheet.getLastRowNum();		
		int vColumnCount =vSheet.getRow(1).getLastCellNum();
		//Object iteration[][] =  new String[rowCounts-1][vColumnCount];
		Object iteration[][] =  new Object[rowCounts-1][vColumnCount];	
		ArrayList<Object> clm = new ArrayList<Object>();	
		for(int cl=0;cl<vColumnCount;cl++){
			String clmName =vSheet.getRow(1).getCell(cl).getStringCellValue();
			clm.add(clmName);
		}
		System.out.println("Column names in List: "+clm);
		
		TreeMap<Object,Object> data = new TreeMap<Object,Object>();
		
		for(int i=2;i<=rowCounts;i++){
			for(int j=0;j<vColumnCount;j++){				
				String cellValue =vSheet.getRow(i).getCell(j).getStringCellValue();
				data.put(clm.get(j), cellValue);				
				iteration[i-2][j]=data;								
			}	
			System.out.println("Map value: "+data);	
		}
			
		//return iteration;
		}

}
