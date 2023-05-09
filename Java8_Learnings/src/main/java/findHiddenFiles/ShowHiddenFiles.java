package findHiddenFiles;

import java.io.File;
import java.io.FileFilter;

public class ShowHiddenFiles {
	
	//Here we are using filefilter as example for interface as method argument

	public static void main(String[] args) {

		File[] hiddenFiles = new File("src\\main\\resources\\").listFiles(new FileFilter() {
			public boolean accept(File file) {
				return file.isHidden();
			}
		});

		for (File file : hiddenFiles) {
			System.out.println(file.getName());
		}

	}

}
