package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        for (int w = 0; w < height; w++) {
            for (int h = 0; h < width; h++) {
                int f = w + h;
                if (f % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}