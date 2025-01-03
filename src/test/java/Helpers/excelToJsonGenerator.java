package Helpers;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelToJsonGenerator {
	
	
	public static String[][] jsonGenerator() {
		
		String[][] data = null;
		try {
			XSSFWorkbook wbook = new XSSFWorkbook("src/test/resources/Data/ExcelData.xlsx");
			XSSFSheet sheet = wbook.getSheet("sheetNumber1");
			int rowCount = sheet.getLastRowNum();
			rowCount = rowCount+1;
			int columnCount = sheet.getRow(0).getLastCellNum();
			data = new String[rowCount][columnCount];
			for(int i=0; i<rowCount; i++) {
				XSSFRow row = sheet.getRow(i);
				if (row != null) {
					for(int j=0; j<columnCount; j++) {
						data[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
						System.out.println(data[i][j]);
					}
				}
			wbook.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}
	
	public static void arrayToListMap() {
		String[][] data = jsonGenerator();
		List<HashMap<String, String>> eData = new LinkedList<HashMap<String,String>>();
		HashMap<String, String> value = new HashMap<String, String>();
		System.out.println(data.length);
		System.out.println(data[0].length);
		for(int i=0; i<data.length;) {
			for(int j=0; j<data[0].length; j++) {
				value.put(data[i][j], data[i+1][j]);
			}
			eData.add(value);
			i+=2;
		}
		System.out.println(value);
		for(int i=0; i<value.size(); i++) {
			System.out.println(value + "Suganth");
		}
	}
	
	public static void main(String[] args) {
		arrayToListMap();
	}
}
