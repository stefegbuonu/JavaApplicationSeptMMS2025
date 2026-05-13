import java.util.Scanner;

public class UserInput{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		
		System.out.print("Enter your gender: ");
		String gender = input.next();
		
		System.out.print("Enter your age: ");
		byte age = input.nextByte();
		
		System.out.print("Enter the number of students in your class: ");
		short numberOfStudents = input.nextShort();
		
		System.out.print("Enter the number of students in your school: ");
		int totalNumberOfStudents = input.nextInt();
		
		System.out.print("Enter your grade: ");
		char grade = input.next().charAt(0);
		
		System.out.print("Doo you love learning Java?(True/False): ");
		boolean loveJava = input.nextBoolean();
		
		System.out.println("");
		System.out.printf("Information About %s%n",name);
		System.out.println("===========================================================================");
		
		System.out.printf("Hello %s, you are welcome to NIIT%n",name);
		System.out.printf("You are a %s and you are %d years old%n",gender,age);
		System.out.printf("You are in grade %c%n",grade);
		System.out.printf("There are %d studets in your class%n",numberOfStudents);
		System.out.printf("There is a total of %,d studets in your school%n",totalNumberOfStudents);
		System.out.printf("You love Java? %b%n",loveJava);
	}
}