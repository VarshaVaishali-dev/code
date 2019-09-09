import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_TXT_file {

	

	public static void main(String[] args)throws Exception 
	  { 
	  
	  File file = new File("E:\\TestSample1.txt"); 
	  
	  BufferedReader br = new BufferedReader(new FileReader(file)); 
	  
	  String st; 
	  ArrayList al=new ArrayList();
	  while ((st = br.readLine()) != null) {
	    System.out.println(st); 
	  al.add(st)  ;
	  }
	  //Workbook wb=WorkbookFactory.create(new File("C:\\Users\\HP\\Desktop\\test.xls"));
	  System.out.println(al.size()); 
	  try(Workbook wb=WorkbookFactory.create(new File("C:\\Users\\HP\\Desktop\\test2.xls"))){
		  Sheet sh=(Sheet) wb.createSheet("sheet1");
		  Row row;
		  Cell cell = null;
		  FileOutputStream fos;
		  for(int i=0;i<=al.size();i++) {
			  row=((org.apache.poi.ss.usermodel.Sheet) sh).createRow(i);
			  cell.setCellValue("test");
			  fos=new FileOutputStream("C:\\Users\\HP\\Desktop\\test2.xls");
			  wb.write(fos);
		  }
		  
	  }
	  } 
	
	  
	}


