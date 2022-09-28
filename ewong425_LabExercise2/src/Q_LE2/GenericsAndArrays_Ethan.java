package Q_LE2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GenericsAndArrays_Ethan {
    public static void main(String[] args) {
        int input=0; String cont = "y";
    header(2);
    ArrayList<Integer> yearOfStudies = new ArrayList<>(Arrays.asList(2,3,4,3,2,2));
    ArrayList<String> nameOfStudents = new ArrayList<>(Arrays.asList("Harry", "Lavender", "Ron", "Hermione", "Luna", "Vincent"));
    ArrayList<Pair> pair = new ArrayList<>(yearOfStudies.size());
    for(int i=0; i<pair.size(); i++) {
        pair.add(new Pair(yearOfStudies.get(i), nameOfStudents.get(i)));
    }
    Scanner sc = new Scanner(System.in);
        System.out.println("This program prints the names of the students leaders from year 2,3 and 4. \n" +
                            "To see the list of students from a specific year enter an integer between 2 and 4 when prompted.");
        while(cont.equals("y")) {
            while (true) {
                System.out.println("Enter Academic Year (2,3 or 4):");
                input = sc.nextInt();
                try {
                    if (input <= 4 && input >= 2) {
                        break;
                    }
                } catch (Exception e) {
                    System.out.print("Incorrect Input! ");
                }
            }
            ArrayList<Object> returnArray = new ArrayList<>();
            for (int i = 0; i < pair.size(); i++) {
                if (pair.get(i).getKey().equals(input)) {
                    returnArray.add(pair.get(i).getValue());
                }
            }
            System.out.println("Do you wish to continue? (Press y to continue or any other key to terminate.");
            cont = sc.nextLine();
        }
        footer(2);
    }
    public static void header(int n) {
        System.out.println("Lab Exercise: " + n + "-Q1");
        System.out.println("Prepared by: Ethan Wong");
        System.out.println("Student Number: 251205049");
        System.out.println("Goal: Checking execution time");
        System.out.println("=============================================\n");
    }
    public static void footer(int n) {
        int lab = n;
        System.out.println("=============================================");
        System.out.println("Completion of Lab Exercise " + n + " is successful!");
        System.out.println("Signing off -Ethan ");
    }
}
