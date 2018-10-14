package GradeApp;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * This class is supposed to be run on exit of the program so that it saves your files
 * and these files are to be read on start up. The format of these files is .gca and is as follows
 * Name - of class
 * Name, Weight - of Grade category
 * Score, Total - score and total on an assignment
 * Score, Total
 *                     <- Space to know when new grade category starts
 * Name, Weight - of Grade category
 * Score, total
 * 
 * @author Matthew Phipps
 *
 */
public class PostOperation {
	public static void saveInfo(Class ke) {
		if (ke == null)
			return;
		String output;
		if (!folderCheck())
			new File("/path/classes").mkdirs();
		output = ke.getName() + "\n";
		ArrayList<GradeCategory> gCats = ke.getGradeCategories();
		for (int n = 0; n < gCats.size(); n++) {
			output += gCats.get(n).getName() +", "+gCats.get(n).getWeight()+ "\n";
			ArrayList<Assignment> assignments = gCats.get(n).getAssignments();
			for (int i = 0; i < assignments.size(); i++) {
				output += assignments.get(i).getScore() + ", " + assignments.get(i).getTotal() + "\n";
			}
			output += "\n";
		}
		File file = new File(ke.getName()+".gca");
		FileWriter writer =  null;
		try {
			file.createNewFile();
			writer = new FileWriter(file, false);
			writer.write(output);
			writer.flush();
			writer.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	private static boolean folderCheck() {
		return false;
	}
}
