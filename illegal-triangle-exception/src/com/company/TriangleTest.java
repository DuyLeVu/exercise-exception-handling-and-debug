package com.company;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Triangle triangle = new Triangle();
            System.out.println("Nhập cạnh thứ nhất của tam giác");
            double a = sc.nextDouble();
            sc.nextLine();
            System.out.println("Nhập cạnh thứ hai của tam giác");
            double b = sc.nextDouble();
            sc.nextLine();
            System.out.println("Nhập cạnh thứ ba của tam giác");
            double c = sc.nextDouble();
            triangle.checkTriangle(a, b, c);
        } catch (MyExtension e) {
            System.out.println(e.getMessage());
        }
    }
}

