package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("genişlik değeri girin");
        double width = scanner.nextDouble();
        System.out.println("yükseklik değeri girin");
        double height = scanner.nextDouble();
        System.out.println("dikdörtgenin alanı: " + area(width, height));

        System.out.println("Daire yarı çapı girin");
        double radius = scanner.nextDouble();
        System.out.println("Dairenin alanı: " + area(radius));


    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23 || !isBarking) {
            return false;
        }
        return (clock < 8 || clock >= 20);
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
       if ( firstAge >= 13 && firstAge <= 19) {
           return true;
       }
       if ( secondAge >= 13 && secondAge <= 19) {
            return true;
        }
       if ( thirdAge >= 13 && thirdAge <= 19) {
            return true;
        }
           return false;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
     if ( isSummer && temp >= 25 && temp <= 45) {
         return true;
     }
     if (!isSummer && temp >= 25 && temp <= 35) {
         return true;
     }
     return false;
    }

    public static double area(double width, double height) {
        if ((width < 0) || (height < 0)) {
            System.out.println("Değer 0'dan küçük olamaz!");
            return -1;
        };
        return width * height;
    }

    public static double area(double radius) {
        if (radius < 0) {
            System.out.println("Değer 0'dan küçün olamaz!");
            return -1;
        }
        return radius*radius*Math.PI;
    }
}
