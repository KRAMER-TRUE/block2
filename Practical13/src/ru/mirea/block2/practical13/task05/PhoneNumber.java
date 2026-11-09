package ru.mirea.block2.practical13.task05;

public class PhoneNumber {
    private final String countryCode;
    private final String digits;

    public PhoneNumber(String input) {
        String number = input.trim();
        if (!number.matches("\\+[1-9][0-9]{10,}|8[0-9]{10}")) {
            throw new IllegalArgumentException("Номер должен начинаться с + и кода страны или с 8.");
        }

        int start = number.length() - 10;
        countryCode = number.startsWith("+") ? number.substring(1, start) : "7";
        digits = number.substring(start);
    }

    @Override
    public String toString() {
        return "+" + countryCode + digits.substring(0, 3) + "-"
                + digits.substring(3, 6) + "-" + digits.substring(6);
    }
}
