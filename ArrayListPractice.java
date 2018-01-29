/**
 * AP Computer Science									Name ___________________________
 * ArrayList Review/Self-Quiz
 * 
 * Read this code and predict the output. Then run the program to check your predictions.
 */
 
import java.util.ArrayList;

public class ArrayListPractice
{
	public static void main(String[] pirateSayings)
	{
		ArrayList<String> letters = new ArrayList<String>();
		
		// #0
		System.out.println(letters.size() + " " + letters.isEmpty());//0 true
								
		// #1
		letters.add("a");
		letters.add("b");
		letters.add("c");
		letters.add("d");

		System.out.println(letters.size() + " " + letters.isEmpty());// 4 false

		// #2 
		System.out.println(letters);//abcd
		System.out.println(letters.get(3));//d

		// #3
		letters.add("e");
		letters.add(2,"x");
		System.out.println(letters);//zbxe
				
		// #4
		letters.set(0,"z");
		letters.remove("c");	
		letters.remove(3);
		System.out.println(letters);//zabde
		
		// #5
		for (int i=letters.size()-1; i>=0; i--)
			System.out.print(letters.get(i));
		System.out.println();//zbxe	
		
		// #6
		for (String let: letters)
			System.out.print(let);
		System.out.println();//exbz
			
		// #7
		ArrayList<String> more = new ArrayList<String>();
		more.add("q");
		more.add("r");
		more.add("s");
		
		for (String let : more)
			letters.add(0, let);
			
		System.out.println(letters);//srqzbxe
	}
}
