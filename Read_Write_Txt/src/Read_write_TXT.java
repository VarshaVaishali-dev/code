import java.io.PrintWriter;

public class Read_write_TXT {
	
	public static void main(String args []) {
		try {
			System.out.println("in main method");
			PrintWriter writer = new PrintWriter("C:\\Users\\HP\\Desktop\\the-file-name.txt", "UTF-8");
			System.out.println("After print writer");
			  writer.println("The first line");
			  writer.println("The second line");
			  writer.println("The third line");
			  writer.println("The fourth line");
			  writer.println("The fifth line");
			  writer.close();
			  System.out.println("After print writer closing *****");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
