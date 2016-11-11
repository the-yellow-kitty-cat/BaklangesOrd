package itello;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String b = in.nextLine();
        if (b.equals("")) {
            System.out.println(b);
        } else {
            String encryptionToString = getSentenceEncryption(b);
            System.out.println(encryptionToString);
        }
    }

    static String getBackwardsEncryption(String b) {
        StringBuilder encryptedString = new StringBuilder();
        for (int currentLetter = b.length() - 1; currentLetter >= 0; currentLetter--) {
            char currentSymbol = b.charAt(currentLetter);
            encryptedString.append(currentSymbol);
        }
        return encryptedString.toString();
    }

    static String getSentenceEncryption(String originalSentence) {
        String[] stringList = originalSentence.split("\\s+");
        StringBuilder encryptedString = new StringBuilder();
        for (int i = 0; i < stringList.length; i++) {
            String currentWord = stringList[i];
            String backwardsEncryption = getBackwardsEncryption(currentWord);
            char firstSymbol = backwardsEncryption.charAt(0);
            boolean isFirstLetterSymbol = !Character.isLetterOrDigit(firstSymbol);
            if (isFirstLetterSymbol) {
                backwardsEncryption = fixLetterSize(backwardsEncryption.substring(1)) + firstSymbol;
            } else {
                backwardsEncryption = fixLetterSize(backwardsEncryption);
            }

            encryptedString.append(backwardsEncryption);
            boolean isItFinished = (i + 1 >= stringList.length);
            if (!isItFinished) {
                encryptedString.append(" ");
            }
        }
        return encryptedString.toString();
    }

    private static String fixLetterSize(String backwardsEncryption) {
        char lastLetter = backwardsEncryption.charAt(backwardsEncryption.length() - 1);
        char firstLetter = backwardsEncryption.charAt(0);
        boolean isLastLetterCapital = Character.isUpperCase(lastLetter);
        boolean isFirstLetterSmall = Character.isLowerCase(firstLetter);
        if (isLastLetterCapital && isFirstLetterSmall) {
            backwardsEncryption = backwardsEncryption.substring(0, 1).toUpperCase() + backwardsEncryption.substring(1).toLowerCase();
        }
        return backwardsEncryption;
    }
}
