package com.example.demo.Resource;

import com.example.demo.Entity.ConsultantDetails;
import com.example.demo.Service.ConsultantDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/consultants")
public class ConsultantDetailsResource {


    @Autowired
    private ConsultantDetailsService cServ;

    @GetMapping("/get_consultants")
    public List<ConsultantDetails> getAll()
    {
        return cServ.getAllC();
    }

}
