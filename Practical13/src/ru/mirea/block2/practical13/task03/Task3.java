package ru.mirea.block2.practical13.task03;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Разбор по запятым:");
        System.out.println(Address.fromCommas(" Россия, Москва, Москва, Тверская, 10, 1, 24 "));
        System.out.println(Address.fromCommas(" Россия, Татарстан, Казань, Баумана, 5, 2, 12 "));

        System.out.println("Разбор по разным разделителям:");
        System.out.println(Address.fromDelimiters(" Россия; Свердловская область. Екатеринбург, Ленина; 18. 1, 45 "));
        System.out.println(Address.fromDelimiters(" Беларусь. Минская область; Минск, Немига. 3; 2, 16 "));
    }
}
