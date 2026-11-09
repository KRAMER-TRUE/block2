package ru.mirea.block2.practical13.task04;

public class Task4 {
    public static void main(String[] args) {
        String[] rows = {
                "S001,Black Polo Shirt,Black,XL",
                "S002,Black Polo Shirt,Black,L",
                "S003,Blue Polo Shirt,Blue,XL",
                "S004,Blue Polo Shirt,Blue,M",
                "S005,Tan Polo Shirt,Tan,XL",
                "S006,Black T-Shirt,Black,XL",
                "S007,White T-Shirt,White,XL",
                "S008,White T-Shirt,White,L",
                "S009,Green T-Shirt,Green,S",
                "S010,Orange T-Shirt,Orange,S",
                "S011,Maroon Polo Shirt,Maroon,S"
        };

        Shirt[] shirts = new Shirt[rows.length];
        for (int i = 0; i < rows.length; i++) {
            shirts[i] = new Shirt(rows[i]);
        }
        for (Shirt shirt : shirts) {
            System.out.println(shirt);
            System.out.println();
        }
    }
}
