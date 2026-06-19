package com.sashcodes.vendor.api.service;

import com.sashcodes.vendor.api.dto.VendorRequestDTO;
import com.sashcodes.vendor.api.dto.VendorResponseDTO;
import com.sashcodes.vendor.api.exception.VendorNotFoundException;
import com.sashcodes.vendor.api.model.Vendor;
import com.sashcodes.vendor.api.repository.VendorApiRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VendorApiServiceImpl implements VendorApiService {

    private VendorApiRepository vendorApiRepository;
    private final ModelMapper modelMapper;

    public VendorApiServiceImpl(VendorApiRepository vendorApiRepository,  ModelMapper modelMapper) {
        this.vendorApiRepository = vendorApiRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public VendorResponseDTO getVendorById(Long vendorId) {
        Optional<Vendor> vendor = vendorApiRepository.findById(vendorId);

        if(vendor.isEmpty()){
            throw new VendorNotFoundException("Vendor with id " + vendorId + " not found" );
        }

        return modelMapper.map(vendor.get(), VendorResponseDTO.class);

    }

    @Override
    public VendorResponseDTO getVendorByName(String vendorName) {
        Optional<Vendor> vendor = vendorApiRepository.findByVendorName(vendorName);

        if(vendor.isEmpty()){
            throw new VendorNotFoundException("Vendor with name " + vendorName + " not found" );
        }

        return modelMapper.map(vendor.get(), VendorResponseDTO.class);
    }

    @Override
    public List<VendorResponseDTO> getAllVendors() {

        List<VendorResponseDTO> vendorDTOList = new ArrayList<>();
        List<Vendor> vendors = vendorApiRepository.findAll();

        if(vendors!=null && !vendors.isEmpty()){
            vendors.forEach(vendor -> {
                vendorDTOList.add(modelMapper.map(vendor, VendorResponseDTO.class));
            });
        }


        return vendorDTOList;
    }

    @Override
    public String createVendor(VendorRequestDTO vendorDTO) {

        Vendor vendorEntity = modelMapper.map(vendorDTO, Vendor.class);
        vendorApiRepository.save(vendorEntity);

        return "Vendor created successfully";
    }

    @Override
    public String updateVendor(VendorRequestDTO vendorDTO) {

        Vendor vendorEntity = modelMapper.map(vendorDTO, Vendor.class);
        vendorApiRepository.save(vendorEntity);

        return "Vendor updated successfully";
    }

    @Override
    public String deleteVendor(Long vendorId) {

        vendorApiRepository.deleteById(vendorId);

        return "Vendor deleted successfully";
    }
}
