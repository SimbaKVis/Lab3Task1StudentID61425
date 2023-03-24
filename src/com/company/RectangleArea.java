package com.company;
import java.util.Scanner;

public class RectangleArea {
    public static int[] getData() {
        System.out.println("Please input the length of the rectangle ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        System.out.println("Please input the width of the rectangle ");
        int width = scanner.nextInt();
        int data[] = {length, width};
        return data;
    }

    public static int computeField(int[] measurements) {
        int length = measurements[0];
        int width = measurements[1];
        int area = length * width;
        return area;
    }

    public static void fieldDisplay(int area) {
        System.out.println("The area of the rectangle is " + area);
    }
}



