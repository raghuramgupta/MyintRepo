import java.io.*;
public class Test {

	public static void main(String[] args) throws IOException
	{
		File f = new File("C:\\HDD\\Tools","Hello.txt");
	      
			FileWriter wr = new FileWriter(f,true);
			wr.write(100);
			wr.close();
			System.out.println(f.length());
			FileReader fr = new FileReader(f);
			char[] a = new char[50];
			fr.read();
			String[] b = new String[1000];
			int i=0;
			for (char c:a)
				{
				System.out.println("Tesing the  "+c);
				}
			fr.close();
		
	}
}
