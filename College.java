
import java.util.Scanner;

import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.System.out;

class College{

	Student[] students;
	int size;
	Scanner scanner;

	{
		students = new Student[10];
		size = 0;
		scanner = new Scanner(System.in);

	}

	//admission process method
	public void getAdmission(){
		out.println("Enter Student Name :- ");
		String studentName = scanner.nextLine();

		out.println("Enter your Roll Number :- ");
		int roll = scanner.nextInt();

		Student s1 = new Student(studentName,roll);

		students[size++] = s1;

		// write in the file student information

		FileWriter fw = null;

		try{
			fw = new FileWriter("studentinfo.txt");
			fw.write("Information of "+(size+1));
			fw.write("\n============================");
			fw.write("\nStudent Name :- "+s1.getStudentName());
			fw.write("\nStudent roll :- "+s1.getStudentRoll());
		}catch(FileNotFoundException e){

		}
		catch(IOException i){}
		finally{
			if(fw!=null){
				try{
					fw.close();
				}
				catch(FileNotFoundException w){}
				catch(IOException o){}
			} //if
		}//finally

	}//function closed


}//class college