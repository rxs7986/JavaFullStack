package com.example.demo.Resource;

import com.example.demo.Entity.ConsultantDetails;
import com.example.demo.Service.ConsultantDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/get_id/{id}")
    public ConsultantDetails getByid(@PathVariable int id)
    {
        return cServ.getId(id);
    }

    @PostMapping("post_consultant")
            public ConsultantDetails createConsultant(@RequestBody ConsultantDetails consultantDetails)
    {
        return cServ.createConsultant(consultantDetails);
    }

    @PutMapping("/put_consultant")
    public  ConsultantDetails updateConsultant(@RequestBody ConsultantDetails consultantDetails)
    {
        return cServ.updateConsultant(consultantDetails);
    }

    @DeleteMapping("/del_consultant/{id}")
    public void  delConsultant(@PathVariable Long id)
    {
        cServ.deleteConsultant(id);
    }

}
