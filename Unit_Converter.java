import java.util.Scanner;

public class Unit_Converter {
    public static void main(String[] args) {


                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the unit you want to convert in - ");
                System.out.println("1. Celsius to Fahrenheit");
                System.out.println("2. Fahrenheit to Celsius");
                System.out.println("3. Kilometer to Meter");
                System.out.println("4. Meter to Kilometer");
                System.out.println("5. Liter to Milliliter");
                System.out.println("6. Exit");
                System.out.print("Choose an option: ");
                int choice = sc.nextInt();

                float value;
                switch (choice){
                    case 1:
                        System.out.print("Enter the Celsius value - ");
                        value = sc.nextFloat();
                        System.out.println((value * 1.8)+32);
                        break;
                    case 2:
                        System.out.print("Enter the Fahrenheit value - ");
                        value = sc.nextFloat();
                        System.out.println((value - 32)* 5/9);
                        break;
                    case 3:
                        System.out.print("Enter the KM value - ");
                        value = sc.nextFloat();
                        System.out.println(value*1000);
                        break;
                    case 4:
                        System.out.println("Enter the Meter value - ");
                        value = sc.nextFloat();
                        System.out.println(value/1000);
                        break;
                    case 5:
                        System.out.println("Enter the Litre value - ");
                        value = sc.nextFloat();
                        System.out.println(value*1000);
                        break;
                    default:
                        System.out.println("Thanks for using the Program!");
                }
            }
        }
