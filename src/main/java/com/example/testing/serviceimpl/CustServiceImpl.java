package com.example.testing.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testing.model.CustomerModel;
import com.example.testing.repositroy.CustRepository;
import com.example.testing.service.CustService;

@Service
public class CustServiceImpl implements CustService {

    @Autowired
    private CustRepository custRepository;

    @Override
    public void saveCustomer(CustomerModel custsa) {
        custRepository.save(custsa);
    }
}
