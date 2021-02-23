package src.com.example.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {

	public static void main(String[] args) {
		String sourceFile = "files/loremipsum.txt";
		String destinationFile = "files/destination.txt";
		try (FileReader fileReader = new FileReader(sourceFile);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				FileWriter fileWriter = new FileWriter(destinationFile)) {
			while (true) {
				String line = bufferedReader.readLine();
				if (line == null)
					break;
				else {
					fileWriter.write(line + "\n");
				}
			}
			System.out.println("######### file cp=opied #########x1");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
