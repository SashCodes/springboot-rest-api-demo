package com.sashcodes.vendor.api.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class VendorRequestDTO {
    @NotBlank(message = "Vendor name cannot be null!")
    private String vendorName;
    @NotBlank(message = "Password cannot be null!")
    private String vendorPassword;
    @NotBlank(message = "Address cannot be null!")
    private String vendorAddress;
    @NotBlank(message = "Email cannot be empty!")
    @Email(message = "Invalid email!")
    private String vendorEmail;
    @NotBlank(message = "Invalid phone number!")
    private String vendorPhone;

    public VendorRequestDTO(String vendorName, String vendorPassword, String vendorAddress, String vendorEmail, String vendorPhone) {
        this.vendorName = vendorName;
        this.vendorPassword = vendorPassword;
        this.vendorAddress = vendorAddress;
        this.vendorEmail = vendorEmail;
        this.vendorPhone = vendorPhone;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorPassword() {
        return vendorPassword;
    }

    public void setVendorPassword(String vendorPassword) {
        this.vendorPassword = vendorPassword;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public String getVendorEmail() {
        return vendorEmail;
    }

    public void setVendorEmail(String vendorEmail) {
        this.vendorEmail = vendorEmail;
    }

    public String getVendorPhone() {
        return vendorPhone;
    }

    public void setVendorPhone(String vendorPhone) {
        this.vendorPhone = vendorPhone;
    }
}
