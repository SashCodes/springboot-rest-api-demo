package com.sashcodes.vendor.api.service;

import com.sashcodes.vendor.api.dto.VendorRequestDTO;
import com.sashcodes.vendor.api.dto.VendorResponseDTO;
import com.sashcodes.vendor.api.model.Vendor;

import java.math.BigDecimal;
import java.util.List;

public interface VendorApiService {
    public VendorResponseDTO getVendorById(Long vendorId);
    public VendorResponseDTO getVendorByName(String vendorName);
    public List<VendorResponseDTO> getAllVendors();
    public String createVendor(VendorRequestDTO vendor);
    public String updateVendor(VendorRequestDTO vendor);
    public String deleteVendor(Long vendorId);

}
