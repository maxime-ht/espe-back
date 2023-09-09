package com.maxcorp.espeplanning.dao;

import com.maxcorp.espeplanning.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

    Optional<Address> findByCityAndStreetAndZipCodeAndAdditionalAddressAndCountry(
            String city, String street, String zipCode, String additionalAddress, String country
    );
}
