package Poi.poi;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.stream.Stream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ReadExcel {

  public static void main( String [] args ) {
	  Writer writer = null;
	  ArrayList al=new ArrayList();
	  try
	  {
		  Workbook wb=WorkbookFactory.create(new File("C:\\Users\\HP\\Desktop\\test.xls")); 
		
		  Sheet sheet=wb.getSheetAt(0);
		  int rowstart=sheet.getFirstRowNum();
		  int lastrow=sheet.getLastRowNum();
		
		  for(int i=rowstart;i<=lastrow;i++) {
			  Row row=sheet.getRow(i);
			  for(int j=row.getFirstCellNum();j<row.getLastCellNum();j++) {
				  Cell cell=row.getCell(j);
				  String content=cell.getRichStringCellValue().toString();
				  
				  System.out.println(cell.getRichStringCellValue());
				  
				  al.add(content);
				  
				 
			  }
			  try (FileWriter writer1 = new FileWriter("E:\\TestSample1.txt");
			             BufferedWriter bw = new BufferedWriter(writer1)) {
				  		for(int k=0; k<al.size(); k++) {
			            bw.write(al.get(k).toString());
			            bw.newLine();
				  		}

			        } catch (IOException e) {
			            System.err.format("IOException: %s%n", e);
			        }
			  System.out.println("-------------------------");
			 
			  
		  }
				  
	  }
	  catch(Exception e){
		  e.printStackTrace();
	  }
	   
	}

	 
   
}