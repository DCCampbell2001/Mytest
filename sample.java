//Code reviewed by Dylan Campbell for Eclipse + GitHub assignment
// Code reviewed by @professorgordon
//Dylan Campbell
import java.util.Scanner;
public class ContactCard
{
	public static void main(String[] args) 
	{
     String firstName;
     String lastName;
     String firstAddress;
     String secondAddress;
     String city;
     String state;
     int zipCode;
     long phoneNumber;
     String email;
     byte age;
     String height;
     int weight;
     String jobTitle;
     int annualIncome;
     Scanner input = new Scanner(System.in);
     System.out.println("---------------------------------------");
     System.out.println("Please enter the following information: ");
     System.out.println("---------------------------------------");
     System.out.print("First Name: ");
     firstName = input.nextLine();
     System.out.print("Last Name: ");
     lastName = input.nextLine();
     System.out.print("Address Line 1: ");
     firstAddress = input.nextLine();
     System.out.print("Address Line 2: ");
     secondAddress = input.nextLine();
     System.out.print("City: ");
     city = input.nextLine();
     System.out.print("State: ");
     state = input.nextLine();
     System.out.print("Zip Code: ");
     zipCode = input.nextInt();
     System.out.print("Phone Number: ");
     phoneNumber = input.nextLong();
     System.out.print("Email Address: ");
     email = input.nextLine();
     System.out.print("\nAge: ");
     age = input.nextByte();
     System.out.print("Height: ");
     height = input.nextLine();
     System.out.print("\nWeight: ");
     weight = input.nextInt();
     System.out.print("Job Title: ");
     jobTitle = input.nextLine();
     System.out.print("\nAnnual Income: ");
     annualIncome = input.nextInt();
     System.out.println("---------------------------------------");
     System.out.println("Thank you! ");
     System.out.println("---------------------------------------");
     System.out.println("---------------------------------------");
     System.out.println("Contact Card: ");
     System.out.println("---------------------------------------");
     System.out.println("Name: " + firstName + " " + lastName);
     System.out.println("Address Line 1: " + firstAddress);
     System.out.println("Address Line 2: " + secondAddress);
     System.out.println("City, ST Zip: " + city + ", " + state + " " + zipCode);
     System.out.println("---------------------------------------");
     System.out.println("Phone Number: " + phoneNumber);
     System.out.println("Email Address: " + email);
     System.out.println("---------------------------------------");
     System.out.println("Age: " + age + "\tHeight: " + height + "\tWeight: " + weight);
     System.out.println("---------------------------------------");
     System.out.println("Job Title: " + jobTitle);
     System.out.printf("Annual Income: $%,.2f%n%n",(double) annualIncome);
     System.out.printf("Monthly Income: $%,.2f%n%n",(double) annualIncome/12);
     System.out.printf("Weekly Income: $%,.2f%n%n",(double) annualIncome/48);
     System.out.println("---------------------------------------");
     input.close();
   }
}
     
     
     
