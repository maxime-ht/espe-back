package com.maxcorp.espeplanning.service.impl;

import com.maxcorp.espeplanning.dao.AddressRepository;
import com.maxcorp.espeplanning.dto.AddressDto;
import com.maxcorp.espeplanning.entity.Address;
import com.maxcorp.espeplanning.service.AddressService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService {

    private final ModelMapper modelMapper;
    private final AddressRepository addressRepository;

    @Autowired
    public AddressServiceImpl(ModelMapper modelMapper, AddressRepository addressRepository) {
        this.modelMapper = modelMapper;
        this.addressRepository = addressRepository;
    }


    @Override
    public AddressDto add(AddressDto addressDto) {
        Optional<Address> existingAddress = addressRepository.findByCityAndStreetAndZipCodeAndAdditionalAddressAndCountry(
                addressDto.getCity(),
                addressDto.getStreet(),
                addressDto.getZipCode(),
                addressDto.getAdditionalAddress(),
                addressDto.getCountry()
        );

        if (existingAddress.isPresent()) {
            return this.modelMapper.map(existingAddress, AddressDto.class);
        }
        Address savedAddress = this.addressRepository.save(this.modelMapper.map(addressDto, Address.class));
        return this.modelMapper.map(savedAddress, AddressDto.class);
    }

    @Override
    public Optional<AddressDto> getById(Long id) {
        Optional<Address> existingAddress = this.addressRepository.findById(id);
        if (existingAddress.isPresent()) {
            return Optional.of(this.modelMapper.map(existingAddress, AddressDto.class));
        }
        return Optional.empty();
    }

}
