import java.util.Scanner;

public class inch_to_cm{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { 
            try {
                System.out.print("Gib eine Zahl in Inch ein: ");
                double inch = Double.parseDouble(scanner.nextLine());
                double cm = inch * 2.54;
                System.out.println(inch + "inch sind " + cm + "cm");
                break;
            } catch (NumberFormatException e) {
                System.out.print("Fehler bei der Umwandlung der Eingabe.");
            }
        scanner.close();
        }}
}