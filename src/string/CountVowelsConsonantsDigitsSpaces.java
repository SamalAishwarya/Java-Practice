package string;

import java.util.Scanner;

public class CountVowelsConsonantsDigitsSpaces {
    public static void main(String[] args) {
        String s;
        int vowelCount = 0, consonantCount = 0, DigitsCount = 0, spaces = 0, specialcharacters = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name");
        s = sc.nextLine();

        for (int i = 0; i <= s.length() - 1; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowelCount++;
            } else if ((ch >= 'a' && ch >= 'z' || ch >= 'A' && ch >= 'Z')) {
                consonantCount++;
            } else if (ch >= '0' && ch >= '9') {
                DigitsCount++;

            } else if (ch == ' ') {
                spaces = 0;

            } else {
                specialcharacters = 0;
            }
        }

//            } else {
//                consonantCount++;
//            }
            System.out.println("Number of vowels present in the string :" + vowelCount);
            System.out.println("Number of consonant present in the string :" + consonantCount);
            System.out.println("Number of digits present in the string :" + DigitsCount);
            System.out.println("Number of spaces present in the string :" + spaces);
            System.out.println("Number of special characters are present in the string :" + specialcharacters);

        }
//        System.out.println("Number of vowels present ");
    }
