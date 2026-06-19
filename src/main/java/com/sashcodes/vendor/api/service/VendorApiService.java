package com.sashcodes.vendor.api.service;

import com.sashcodes.vendor.api.model.Vendor;

import java.math.BigDecimal;
import java.util.List;

public interface VendorApiService {
    public Vendor getVendorById(Long vendorId);
    public Vendor getVendorByName(String vendorName);
    public List<Vendor> getAllVendors();
    public String createVendor(Vendor vendor);
    public String updateVendor(Vendor vendor);
    public String deleteVendor(Long vendorId);

}
