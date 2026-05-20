import java.util.Scanner;
public class Arrays {

    public static void enterValues(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] userArray = new int[size];

        System.out.println("Enter "+size+" integers:");
        for(int i = 0; i < size; i++){
            userArray[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.println("You entered:");
        for(int num : userArray){
            System.out.println(num);
        }
    }

    public static void main(String[] args){
        int[] numbers = {10, 20, 30, 40, 50};
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};
        double[] decimals = {1.5, 2.5, 3.5, 4.5, 5.5};

        // Accessing array elements using index
        System.out.println("First element of numbers array: "+ numbers[0]);
        System.out.println("Decimal array elements:"+ decimals[2]);

        // Accessing array elements using normal for loop
        System.out.println("Array elements:");
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        // Using enhanced for loop (for-each loop)
        System.out.println("\nUsing enhanced for loop:");
        for(String name : names){
            System.out.println(name);
        }

        enterValues();
    }
}