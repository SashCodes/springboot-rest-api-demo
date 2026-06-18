package com.sashcodes.vendor.api.service;

import com.sashcodes.vendor.api.model.Vendor;
import com.sashcodes.vendor.api.repository.VendorApiRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class VendorApiServiceImpl implements VendorApiService {

    private VendorApiRepository vendorApiRepository;

    public VendorApiServiceImpl(VendorApiRepository vendorApiRepository) {
        this.vendorApiRepository = vendorApiRepository;
    }

    @Override
    public Vendor getVendorById(BigDecimal vendorId) {
        return vendorApiRepository.findById(vendorId).get();
    }

    @Override
    public Vendor getVendorByName(String vendorName) {
        return vendorApiRepository.findByVendorName(vendorName).get();
    }

    @Override
    public List<Vendor> getAllVendors() {
        return vendorApiRepository.findAll();
    }

    @Override
    public String createVendor(Vendor vendor) {
        vendorApiRepository.save(vendor);
        return "Vendor created successfully";
    }

    @Override
    public String updateVendor(Vendor vendor) {
        vendorApiRepository.save(vendor);
        return "Vendor updated successfully";
    }

    @Override
    public String deleteVendor(BigDecimal vendorId) {
        vendorApiRepository.deleteById(vendorId);
        return "Vendor deleted successfully";
    }
}
