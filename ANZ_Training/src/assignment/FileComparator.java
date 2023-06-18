package assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import java.lang.System.Logger;
import java.util.List;
import java.util.ArrayList;

public class FileComparator {
	//private static final Logger LOGGER = Logger.getLogger(FileComparator.class.getName());


	public static void main(String[] args) {
		String inputFile1 = "C:\\Input data\\input1.txt";
		String inputFile2="C:\\Input data\\input2.txt";
		String commonFile ="C:\\Input data\\common.txt";
		String differenceFile="C:\\Input data\\difference.txt";
		try {
			List<String> set1=new ArrayList<>();
			BufferedReader reader1=new BufferedReader(new FileReader(inputFile1));
			String line1 = reader1.readLine();
			while (line1 !=null) {
				set1.add(line1);
				line1=reader1.readLine();
			}
			reader1.close();
			List<String> set2=new ArrayList<>();
			BufferedReader reader2= new BufferedReader(new FileReader(inputFile2));
			String line2 = reader2.readLine();
			while(line2 != null) {
				set2.add(line2);
				line2 = reader2.readLine();
			}
			reader2.close();
			BufferedWriter writerCommon = new BufferedWriter(new FileWriter(commonFile));
			for (String item :set2) {
				for(String item2:set1) {
					if(item.equalsIgnoreCase(item2)) {
						writerCommon.write(item);
						writerCommon.newLine();
					}
				}
			
			}
			writerCommon.close();
			BufferedWriter writerDifference = new BufferedWriter(new FileWriter(differenceFile));
			for (String item : set1) {
				int c=0;
				for(String item2:set2) {
					if(item.equalsIgnoreCase(item2)) {
						c++;
					}
					
				}
				if(c==0) {
					writerDifference.write(item);
					writerDifference.newLine();
				}
				
			}
			for (String item : set2) {
				int c=0;
				for(String item2:set1) {
					if(item.equalsIgnoreCase(item2)) {
						c++;
					}
					
				}
				if(c==0) {
					writerDifference.write(item);
					writerDifference.newLine();
				}
				
			}

			
			writerDifference.close();
			System.out.println("Comparison completed successfully");
			//((Object) LOGGER).info("Comparison completed successfully!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
