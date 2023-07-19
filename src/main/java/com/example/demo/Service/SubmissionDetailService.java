package com.example.demo.Service;


import com.example.demo.Entity.SubmissionDetails;
import com.example.demo.Repository.SubmissionTabRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubmissionDetailService implements  ISubmissionDetailService{

    @Autowired
    private SubmissionTabRepository sRepo;

    @Override
    public List<SubmissionDetails> getAll() {
        return sRepo.findAll();
    }
}
