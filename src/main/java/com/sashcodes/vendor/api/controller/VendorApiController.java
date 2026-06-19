package com.sashcodes.vendor.api.controller;

import com.sashcodes.vendor.api.dto.VendorRequestDTO;
import com.sashcodes.vendor.api.dto.VendorResponseDTO;
import com.sashcodes.vendor.api.model.Vendor;
import com.sashcodes.vendor.api.service.VendorApiService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/vendorApi")
public class VendorApiController {

    private VendorApiService vendorApiService;

    public VendorApiController(VendorApiService vendorApiService)
    {
        this.vendorApiService = vendorApiService;
    }

    @GetMapping("/vendor/{vendorId}")
    public VendorResponseDTO getVendorById(@PathVariable("vendorId") Long vendorId)
    {
        return vendorApiService.getVendorById(vendorId);
    }

    @GetMapping("/vendor/name/{vendorName}")
    public VendorResponseDTO getVendorByName(@PathVariable("vendorName") String vendorName)
    {
        return vendorApiService.getVendorByName(vendorName);
    }

    @GetMapping("/vendors")
    public List<VendorResponseDTO> getAllVendors()
    {
        return vendorApiService.getAllVendors();
    }

    @PostMapping("/vendor")
    public String createVendor(@RequestBody @Valid VendorRequestDTO vendor)
    {
        vendorApiService.createVendor(vendor);
        return "Vendor created successfully";
    }

    @PutMapping("/vendor")
    public String updateVendor(@RequestBody @Valid VendorRequestDTO vendor)
    {
        vendorApiService.updateVendor(vendor);
        return "Vendor updated successfully";
    }

    @DeleteMapping("/vendor/{vendorId}")
    public String deleteVendor(@PathVariable("vendorId") Long vendorId)
    {
        vendorApiService.deleteVendor(vendorId);
        return "Vendor deleted successfully";
    }

}
