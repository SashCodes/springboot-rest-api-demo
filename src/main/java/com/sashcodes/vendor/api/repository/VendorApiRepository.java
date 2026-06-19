package com.sashcodes.vendor.api.repository;

import com.sashcodes.vendor.api.model.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.ObjectInputStream;
import java.math.BigDecimal;
import java.util.Optional;


public interface VendorApiRepository extends JpaRepository<Vendor, Long> {
    Optional<Vendor> findByVendorName(String vendorName);
}
