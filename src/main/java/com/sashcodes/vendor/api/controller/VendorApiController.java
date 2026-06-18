package com.sashcodes.vendor.api.controller;

import com.sashcodes.vendor.api.model.Vendor;
import com.sashcodes.vendor.api.service.VendorApiService;
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
    public Vendor getVendor(@PathVariable("vendorId") BigDecimal vendorId)
    {
        return vendorApiService.getVendorById(vendorId);
    }

    @GetMapping("/vendor/{vendorName}")
    public Vendor getVendorByName(@PathVariable("vendorName") String vendorName)
    {
        return vendorApiService.getVendorByName(vendorName);
    }

    @GetMapping("/vendors")
    public List<Vendor> getAllVendors()
    {
        return vendorApiService.getAllVendors();
    }

    @PostMapping("/vendor")
    public String createVendor(@RequestBody Vendor vendor)
    {
        vendorApiService.createVendor(vendor);
        return "Vendor created successfully";
    }

    @PutMapping("/vendor")
    public String updateVendor(@RequestBody Vendor vendor)
    {
        vendorApiService.updateVendor(vendor);
        return "Vendor updated successfully";
    }

    @DeleteMapping("/vendor/{vendorId}")
    public String deleteVendor(@PathVariable("vendorId") BigDecimal vendorId)
    {
        vendorApiService.deleteVendor(vendorId);
        return "Vendor deleted successfully";
    }

}
