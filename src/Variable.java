import java.util.Scanner;

public class Variable {
    public static void main(String[] args) {
        int roomN = 113;
        double e = 2.71828;
        String compSci = "Computer Science";
        System.out.println(roomN);
        System.out.println(e);
        System.out.println(compSci);

        String p1 = "20th Century World History 12";
        String t1 = "Mr. Alves";
        String p2 = "Chemistry 12";
        String t2 = "Mr. Slapsys";
        String p3 = "Entrepreneurship 12";
        String t3 = "Ms. Sodhi";
        String p4 = "Computer Information Systems 12";
        String t4 = "Mr. Zaremba";

        System.out.print("+");
        for (int i = 0; i < 51; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        System.out.println("| 1 |   " + p1 + " |   " + t1 + " |");
        System.out.print("| 2 | ");
        for (int i = 0; i < 31 - p2.length(); i++) {
            System.out.print(" ");
        }
        System.out.println(p2 + " | " + t2 + " |");
        System.out.print("| 3 | ");
        for (int i = 0; i < 31 - p3.length(); i++) {
            System.out.print(" ");
        }
        System.out.println(p3 + " |   " + t3 + " |");
        System.out.println("| 4 | " + p4 + " | " + t4 + " |");
        System.out.print("+");
        for (int i = 0; i < 51; i++) {
            System.out.print("-");
        }
        System.out.println("+");

        Scanner scanner = new Scanner(System.in);
        double dogPrice = 5.5;
        double drinkPrice = 2;
        System.out.println("How many hot dogs do you want to purchase?");
        int dogN = scanner.nextInt();
        System.out.println("How many drinks do you want to purchase?");
        int drinkN = scanner.nextInt();
        System.out.println("Your total is $" + Math.round((dogN * dogPrice + drinkN * drinkPrice) * 1.12 * 100) / 100.0);
    }
}
