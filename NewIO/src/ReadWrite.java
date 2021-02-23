import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class ReadWrite {
	public static void main(String[] args) {
		Path sFile = Paths.get("files", "loremipsum.txt");
		Path dFile = Paths.get("files", "target.txt");
		try {
			Files.copy(sFile, dFile, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("File Copied !!!");
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
