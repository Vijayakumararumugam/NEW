package week1;

import java.util.Scanner;

public class PrintAllStudentsData {

	public static void main(String[] args) {

		String[] name = { "vijay","kumar","jay"};
		int[] age = {28,32,45};
		char[][] grade = { {'A','B','C','D','E'},
				           {'A','A','A','A','A'},
				           {'B','B','B','B','B'}};

		//System.out.println("Enter the Student no");
		//Scanner sc = new Scanner(System.in);
		//int index =sc.nextInt();
	//	index = index - 1;
		
	//vijay whose is 23 years having graduate
		
/*      //System.out.println(name[index] +  "whose is" +age[index]+  "having"+ grade[index][0] 
				+grade[index][1] +grade[index][2]);
		*/
		
           for(String name1: name)
           {
        	   System.out.println(name1);
        	   
           }

           for(int age1: age)
           {
        	   System.out.println(age1);
        	  
           }
          /* for(char grad:grade)
           {
        	   System.out.println(grade);
           }*/
           }
	}
	
	
	


