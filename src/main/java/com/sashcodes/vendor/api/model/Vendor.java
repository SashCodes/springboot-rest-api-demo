package com.sashcodes.vendor.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "vendor_info")
public class Vendor {

    @Id
    private BigDecimal vendorId;
    private String vendorName;
    private String vendorAddress;
    private String vendorPhone;
    private String vendorEmail;

    public Vendor() {
    }

    public Vendor(BigDecimal vendorId, String vendorName, String vendorAddress, String vendorPhone, String vendorEmail) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorPhone = vendorPhone;
        this.vendorEmail = vendorEmail;
    }

    public BigDecimal getVendorId() {
        return vendorId;
    }

    public void setVendorId(BigDecimal vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public String getVendorPhone() {
        return vendorPhone;
    }

    public void setVendorPhone(String vendorPhone) {
        this.vendorPhone = vendorPhone;
    }

    public String getVendorEmail() {
        return vendorEmail;
    }

    public void setVendorEmail(String vendorEmail) {
        this.vendorEmail = vendorEmail;
    }
}
