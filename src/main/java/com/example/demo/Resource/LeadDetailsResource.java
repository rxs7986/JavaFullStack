package com.example.demo.Resource;


import com.example.demo.Entity.LeadDetails;
import com.example.demo.Service.LeadDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lead")
public class LeadDetailsResource {


    @Autowired
    private LeadDetailsService lServ;


    @GetMapping("/get_leads")
    public List<LeadDetails> getAllLeads(){
        return lServ.getAll();
    }

}
