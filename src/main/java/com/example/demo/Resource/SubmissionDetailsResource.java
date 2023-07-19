package com.example.demo.Resource;


import com.example.demo.Entity.SubmissionDetails;
import com.example.demo.Service.SubmissionDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/submission_details")
public class SubmissionDetailsResource {


    @Autowired
    private SubmissionDetailService sServ;

    @GetMapping("/get_submission")
    public List<SubmissionDetails> getAll(){
        return sServ.getAll();

    }





}
