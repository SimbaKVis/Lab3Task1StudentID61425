package com.company;
import java.lang.Math;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int[] measurements = RectangleArea.getData();
        int area = RectangleArea.computeField(measurements);
        RectangleArea.fieldDisplay(area);
    }
}
