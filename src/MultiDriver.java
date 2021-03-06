import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MultiDriver {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nameLine = scan.nextLine();
		String[] names = nameLine.split(" ");
		int minLevel = scan.nextInt();
		int maxLevel = scan.nextInt();
		for(String name : names) {
			System.out.println(name);
			Generator g = new Generator(name, minLevel, maxLevel, false);
			String json = g.toJSON();
			String path = System.getProperty("user.dir");
			path = path + System.getProperty("file.separator") + "JSON" + System.getProperty("file.separator") + "temp";
			File folder = new File(path);
			File[] listOfFiles = folder.listFiles();
			path = path + System.getProperty("file.separator") + name + "_" + listOfFiles.length + ".pokemon";
			File file = new File(path);
			try {
	            PrintWriter printer = new PrintWriter(file);
	            printer.print(json);
	            printer.close();
	        }
	        catch (FileNotFoundException e) {
	            System.out.println("couldn't create file");
	        }
		}
		scan.close();
	}
}
