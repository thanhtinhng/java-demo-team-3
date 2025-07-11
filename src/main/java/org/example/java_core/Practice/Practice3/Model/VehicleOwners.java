package org.example.java_core.Practice.Practice3.Model;

public class VehicleOwners {
    private String CMND;
    private String fullName;
    private String email;

    VehicleOwners(String CMND, String fullName, String email) {
        if (!Validator.isValidEmail(email)) {
            throw new IllegalArgumentException("Email không hợp lệ");
        }
        if (!Validator.isValidCMND(CMND)) {
            throw new IllegalArgumentException("CMND không hợp lệ");
        }
        this.CMND = CMND;
        this.fullName = fullName;
        this.email = email;
    }

    @Override
    public String toString() {
        return "VehicleOwner{" + "CMND=" + CMND + ", fullName=" + fullName + ", email=" + email + "}";
    }

    public String getCMND() {
        return CMND;
    }
}
