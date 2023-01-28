package ShowHiddenFiles;

import java.io.File;
import java.io.FileFilter;

public class ShowHiddenFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FileFilter filter;
		File[] hiddenFile=new File("C://Users//Mohan//Documents//Git//Practices//.git")
		.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File file) {
				// TODO Auto-generated method stub
				return file.isHidden();
			}
		});
		for (File file : hiddenFile) {
			System.out.println(file.getName());
		}
	}

}
