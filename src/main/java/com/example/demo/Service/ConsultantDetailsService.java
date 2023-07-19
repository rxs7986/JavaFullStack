package com.example.demo.Service;

import com.example.demo.Entity.ConsultantDetails;
import com.example.demo.Repository.ConsultantDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ConsultantDetailsService implements IConsultantDetailsService{


    @Autowired
    private ConsultantDetailsRepository cRepo;

    @Override
    public List<ConsultantDetails> getAllC() {
        return cRepo.findAll();
    }
}
