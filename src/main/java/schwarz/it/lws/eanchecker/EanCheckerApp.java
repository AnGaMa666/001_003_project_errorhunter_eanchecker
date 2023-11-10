package schwarz.it.lws.eanchecker;

import java.util.Random;
import java.util.Scanner;

public class EanCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("EAN-13 Code Generator und Prüfer");

        System.out.println("Möchten Sie einen EAN-13 Code generieren (g) oder prüfen (p)?");
        String action = scanner.nextLine();

        if (action.equalsIgnoreCase("g")) {
            String eanCode = generateEANCode();
            System.out.println("Generierter EAN-13 Code: " + eanCode);
        } else if (action.equalsIgnoreCase("p")) {
            System.out.println("Bitte geben Sie den zu prüfenden EAN-13 Code ein:");
            String code = scanner.nextLine();
            boolean isValid = checkEANCode(code);
            if (isValid) {
                System.out.println("Der EAN-13 Code ist gültig.");
            } else {
                System.out.println("Der EAN-13 Code ist ungültig.");
            }
        } else {
            System.out.println("Ungültige Eingabe.");
        }

        scanner.close();
    }

    public static String generateEANCode() {
        Random random = new Random();
        StringBuilder ean = new StringBuilder();
        for (int i = 0; i < 12; i++) {
            ean.append(random.nextInt(10));
        }
        // Hinzufügen einer Prüfziffer
        ean.append(calculateChecksum(ean.toString()));
        return ean.toString();
    }

    public static boolean checkEANCode(String code) {
        if (code.length() != 13) return false;

        int checksum = Character.getNumericValue(code.charAt(12));
        String codeWithoutChecksum = code.substring(0, 12);
        return checksum == calculateChecksum(codeWithoutChecksum);
    }

    public static int calculateChecksum(String code) {
        int sum = 0;
        for (int i = 0; i < code.length(); i++) {
            int number = Character.getNumericValue(code.charAt(i));
            sum += (i % 2 == 0) ? number : number * 3;
        }
        int mod = sum % 10;
        return (mod == 0) ? 0 : 10 - mod;
    }
}
