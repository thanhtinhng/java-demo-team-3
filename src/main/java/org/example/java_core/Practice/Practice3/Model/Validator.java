package org.example.java_core.Practice.Practice3.Model;

import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Validator {
    private static final Set<String> VALID_MANUFACTURERS = new HashSet<>(Arrays.asList(
            "Honda", "Yamaha", "Toyota", "Suzuki"
    ));

    public static boolean isValidNumber(String number) {
        return number != null && number.length() == 5;
    }

    public static boolean isDuplicateNumber(String number, ArrayList<Vehicles> list) {
        for (Vehicles v : list) {
            if (v.getNumber().equalsIgnoreCase(number)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValidManufacturer(String manufacturer) {
        return VALID_MANUFACTURERS.contains(manufacturer);
    }

    public static boolean isValidYear(int year) {
        int currentYear = Year.now().getValue();
        return year > 2000 && year <= currentYear;
    }

    public static boolean isValidCMND(String CMND) {
        return CMND != null && CMND.length() == 12;
    }

    public static boolean isValidEmail(String email) {
        if (email == null) return false;
        if (!email.contains("@") || !email.contains(".")) return false;

        int atIndex = email.indexOf("@");           // Vị trí của ký tự '@' đầu tiên
        int dotIndex = email.lastIndexOf(".");  // Vị trí của dấu '.' cuối cùng

        // '@' không nằm ở đầu (atIndex > 0)
        // '.' xuất hiện sau '@' (dotIndex > atIndex)
        // '.' không nằm ở cuối chuỗi (dotIndex < email.length() - 1)
        return atIndex > 0 && dotIndex > atIndex && dotIndex < email.length() - 1;
    }
}
