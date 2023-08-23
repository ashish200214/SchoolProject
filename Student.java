import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.System.out;

public class Student{

	//static field
	private static String schoolName;
	private static String schoolAddress;

	//non static field
	private  String studentName;
	private int studentRoll;





	static{ //for initialize the static field from file
		BufferedReader read = null;

		try{
			read = new BufferedReader(new FileReader("schooldetails.txt"));
			schoolName= read.readLine();
			schoolAddress = read.readLine();
		}catch(FileNotFoundException e){out.println("File Not Found ");}
		catch(IOException i){}
		finally{
			if(read!=null){
				try{
					read.close();
				}catch(FileNotFoundException e){}
				catch(IOException i){}

			}//if closed
		}//finally closed

	}//static block closed

	//constructor param 

	Student(String studentName, int studentRoll){
		this.studentName = studentName;
		this.studentRoll = studentRoll;

	}


	//setter and getter method

	//setter and getter for static field

	public String getSchoolName(){
		return schoolName;
	}

	public String getSchoolAddress(){
		return schoolAddress;
	}

	//setter and getter for non static field

	public void setStudentName(String studentName){
		this.studentName = studentName;
	}

	public void setStudentRoll(int studentRoll){
		this.studentRoll = studentRoll;
	}


	public String getStudentName(){
		return studentName;
	}

	public int getStudentRoll(){
		return studentRoll;
	}





}//class closed