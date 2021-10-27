package com.company;

public class Triangle {
    public static void checkTriangle(double a, double b, double c) throws MyExtension {
        if (a <= 0 || b <= 0 || c <= 0) throw new MyExtension("Dữ liệu nhập không hợp lệ!");
        else if ((a + b <= c) || (a + c <= b) || (b + c <= a)) throw new MyExtension("Ba cạnh của tam giác không hợp lệ!");
        else System.out.println("Ba cạnh của tam giác hợp lệ!");
    }
}

