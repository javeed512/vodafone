package filereading;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {

		FileReader reader = null;
		
		FileWriter writer = null;
		
		try {
			reader = new FileReader("InputData.txt");

			writer = new FileWriter("Output.txt");
			int n = 0;

			while ((n = reader.read()) != -1) {

				System.out.print((char) n);
				writer.write(n);
				writer.flush();

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
