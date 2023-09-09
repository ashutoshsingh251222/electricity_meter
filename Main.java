 import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      System.out.println("Enter the Current electric meter here :-");
      Scanner CM = new Scanner(System.in);
      float electric_meter = CM.nextFloat();
      System.out.println("Enter the previous electric meter here :-");
      Scanner PM = new Scanner(System.in);
      float previous_meter = PM.nextFloat();
      float unit_charge = 10;
      System.out.println("Total bill amount paid is :-");
      System.out.println((electric_meter-previous_meter)*10);

    }
}