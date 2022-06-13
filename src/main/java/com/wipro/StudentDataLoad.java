package com.wipro;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentDataLoad {
	
public List<Student> studentList = new ArrayList<Student>();
	
    public void loadStudentData() throws IOException {
    	String line;
    	File file;
    	FileReader fileReader = null;
    	BufferedReader bReader = null;
    	try {
    		 file = new File("C:\\Users\\hp\\eclipse-workspace\\ArthaWebApp\\src\\main\\java\\com\\wipro\\data\\data.txt");
    	     fileReader = new FileReader(file);
    	     bReader = new BufferedReader(fileReader);
    	     line = bReader.readLine();
    	     while( line != null)
    	     {
    	    	 String[] lineArray = line.trim().split(",");
    	    	 studentList.add(new Student(lineArray[1],lineArray[2],lineArray[3],Integer.parseInt(lineArray[5])));
    	    	 line = bReader.readLine();
    	     }
    	}catch(Exception e) {
    		System.out.println(e.getMessage());
    	}
    	finally {
    		bReader.close();
    		fileReader.close();
  
    	}
    }
    
    public void displayData() {
    	for(Student s : studentList) {
    		System.out.println(s);
    	}
    }

}
