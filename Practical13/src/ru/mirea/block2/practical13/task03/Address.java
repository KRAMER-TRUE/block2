package ru.mirea.block2.practical13.task03;

import java.util.StringTokenizer;

public class Address {
    private final String country;
    private final String region;
    private final String city;
    private final String street;
    private final String house;
    private final String building;
    private final String apartment;

    private Address(String[] parts) {
        if (parts.length != 7) {
            throw new IllegalArgumentException("В адресе должно быть семь полей.");
        }
        for (int i = 0; i < parts.length; i++) {
            parts[i] = parts[i].trim();
            if (parts[i].isEmpty()) {
                throw new IllegalArgumentException("Поля адреса не могут быть пустыми.");
            }
        }
        country = parts[0];
        region = parts[1];
        city = parts[2];
        street = parts[3];
        house = parts[4];
        building = parts[5];
        apartment = parts[6];
    }

    public static Address fromCommas(String text) {
        return new Address(text.split(",", -1));
    }

    public static Address fromDelimiters(String text) {
        StringTokenizer tokens = new StringTokenizer(text, ",.;");
        int separators = 0;
        for (int i = 0; i < text.length(); i++) {
            if (",.;".indexOf(text.charAt(i)) >= 0) {
                separators++;
            }
        }
        if (separators != 6 || tokens.countTokens() != 7) {
            throw new IllegalArgumentException("В адресе должно быть семь полей.");
        }

        String[] parts = new String[7];
        for (int i = 0; i < parts.length; i++) {
            parts[i] = tokens.nextToken();
        }
        return new Address(parts);
    }

    @Override
    public String toString() {
        return String.join(", ", country, region, city, street, house, building, apartment);
    }
}
