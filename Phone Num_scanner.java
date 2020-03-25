import java.util.Scanner;

public class Main {
 
 public static void main(String[] args) {
 
 
  Scanner scanner = new Scanner(System.in);
  //System.out.println("Enter areaCode:");
  int areaCode = scanner.nextInt();
  //System.out.println("Enter localNumber:");
  int localNumber = scanner.nextInt();
  
  String phoneNumber = "Calling number "+"("+ areaCode +")"+"-"+localNumber;
  
  System.out.println(phoneNumber);
  
  
 }
}
