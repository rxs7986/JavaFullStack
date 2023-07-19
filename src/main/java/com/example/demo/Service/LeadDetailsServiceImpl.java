package com.example.demo.Service;


import com.example.demo.Entity.LeadDetails;
import com.example.demo.Repository.LeadDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeadDetailsServiceImpl implements LeadDetailsService{


    @Autowired
    private LeadDetailsRepository lRepo;

    @Override
    public List<LeadDetails> getAll() {
        return lRepo.findAll();
    }

}
