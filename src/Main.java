import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        MegaBytesConverter myObject = new MegaBytesConverter();

        System.out.println("Enter the kilobytes to convert");
        int kiloBytes = scanner.nextInt();

        myObject.printMegaBytesAndKiloBytes(kiloBytes);
    }
}