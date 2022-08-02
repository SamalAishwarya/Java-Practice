package exceptionHandling;

import java.util.Scanner;

public class VaccinationCriteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = sc.nextInt();
        try {
            validateAge(age);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
        public static void validateAge ( int age){
            if (age < 18 || age > 55) {
                throw new ArithmeticException("You are not eligilble for vaccine");
            } else {
                System.out.println("You are eligilble for vaccine");
            }
        }
    }

