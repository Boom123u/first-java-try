package PN;
import java.util.Scanner;

class primeno{
  int value = 2;
  int number;
  
  primeno(int number){
    this.number = number;
  }
  void find(){
    while (value<number) {
      value+=1;
      if(number==2){
        System.out.println("The number is prime");
        break;
      }
      else if (value==number){
        break;
      }
      else if (number%value==0) {
        System.out.println("The numer is not prime");
        break;
      
      }
      else{
        System.out.println("The number is prime");
        break;
      }
      

    }
    
    }
  }

public class problem{
  public static void main(String[] args) {
    System.out.println("Hi how are you?");
    System.out.println("Enter a number: ");
    try(Scanner object = new Scanner(System.in)){
      int number = object.nextInt();
      primeno object2 = new primeno(number);
      object2.find();
    }
    

  }
}
