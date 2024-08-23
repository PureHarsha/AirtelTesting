package com.example.testing.repositroy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.testing.model.CustomerModel;

@Repository
public interface CustRepository extends JpaRepository<CustomerModel, String>{

}
