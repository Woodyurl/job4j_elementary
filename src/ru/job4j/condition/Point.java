package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int a = x2 - x1;
        int b = y2 - y1;
        double inta = Math.pow(a, 2);
        double intb = Math.pow(b, 2);
        double rsl = inta + intb;
        double rsl2 = Math.sqrt(rsl);
        return rsl2;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result1 = Point.distance(2, 2, 4, 4);
        double result3 = Point.distance(4, 5, 4, 8);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result (2, 2) to (4, 4) " + result1);
        System.out.println("result (4, 5) to (4, 8) " + result3);
    }
}