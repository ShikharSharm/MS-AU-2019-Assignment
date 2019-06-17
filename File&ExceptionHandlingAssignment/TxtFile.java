package au2019.assignments;

import java.io.File;
import java.io.FilenameFilter;


public class TxtFile {

	static void printTxtFileName(File[] fileList) {
		
		for(File f: fileList) {
	
			try {
				if(f.isFile()) {
					System.out.println(f.getName()); 
					System.out.println("Deleting " + f.getName() + " Text file....");
					if(f.delete()) {
						System.out.println("!! File deleted successfully !!");
					}
					else {
						System.out.println("$$ Failed to delete the file $$");
					}
				}
			}
			catch(Exception e) { 
				System.out.println(e.getMessage());
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\check";
		File parentDir = new File(path);
		
		File fileNames[] = parentDir.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".txt");
			}
		});
				
	    System.out.println("Text Files in parent directory : " + parentDir); 
	    System.out.println("-----------------------------------------");
	            
	    printTxtFileName(fileNames);
	
	}

}

