package assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaAssignment {

    public static void main(String args[]) {
        //addArrayList();
        //printHashMap();
        additionAndSubtraction();
        
    }

    // Question 1:
    private static void addArrayList() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :: ");
        int size = sc.nextInt();
        String myArray[] = new String[size];
        System.out.println("Enter elements of the array (Strings) :: ");
        for (int i = 0; i < size; i++) {
            myArray[i] = sc.next();
        }
        System.out.println(Arrays.toString(myArray));
        ArrayList<String> myList = new ArrayList<String>(Arrays.asList(myArray));
        System.out.println("Enter the element that is to be deleted:");
        String element = sc.next();
        myList.remove(element);
        myArray = myList.toArray(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    // Question 2;
    private static void printHashMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "Gautham");
        map.put("2", "Raju");
        map.put("3", "Nandigama");

        // using for-each loop for iteration over Map.entrySet()
        for (Map.Entry<String, String> entry : map.entrySet())
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

    }

    // Question 3:
    private static void additionAndSubtraction() {
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter First Number > ");
        int inputString1 = input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter First Number > ");
        int inputString2 = input1.nextInt();
        int add = inputString1 + inputString2;
        System.out.println("Addition : " + add);
        int sub = inputString1 - inputString2;
        System.out.println("Subratction : " + sub);
        System.out.println("Multification : " + inputString1 * inputString2);

    }

}
