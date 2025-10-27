package fileHandlingpkg;

import java.io.File;
import java.util.Arrays;

public class PrintFileNames {

	public static void main(String[] args) {

		String downloadsPath = System.getProperty("user.home") + File.separator + "Downloads";
//		System.out.println(downloadsPath);

		File file = new File(downloadsPath);

		File downloadDirFile[] = file.listFiles();

		Arrays.sort(downloadDirFile);
		for (File i : downloadDirFile) {
			if (i.isFile()) {
				System.out.println("File: " + i.getName());
			} else if (i.isDirectory()) {
				System.out.println("Directory: " + i.getName());
			} else {
				System.out.println("Not Known :" + i.getName());
			}
		}

	}

}
