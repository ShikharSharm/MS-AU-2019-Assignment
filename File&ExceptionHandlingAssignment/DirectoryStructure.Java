package au2019.assignments;
import java.io.File;
	

public class DirectoryStructure {

	static void printFileName(File[] fileList, int branches) {
		
		//For displaying in branching manner
		for(File f: fileList) {
			
			//Tree manner
			for(int i=0;i<branches; i++)
				System.out.print("\t");
			
			try {
				if(f.isFile()) {
					System.out.println(f.getName());
				}
				else if(f.isDirectory()){
					//Is a directory
					System.out.println("[" + f.getName() + "]");
					// Sub-directories present in the parent directory
					printFileName(f.listFiles(), branches+1);
				}
			}
			catch(Exception e) { 
				System.out.println(e.getMessage());
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\Intel";
		File parentDir = new File(path);
		
		try {
			if(parentDir.isDirectory()) {
				File fileNames[] = parentDir.listFiles();
	            System.out.println("Files in parent directory : " + parentDir); 
	            System.out.println("-----------------------------------------");
	            printFileName(fileNames, 0);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
