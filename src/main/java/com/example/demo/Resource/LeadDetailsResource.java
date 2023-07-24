package com.example.demo.Resource;


import com.example.demo.Entity.LeadDetails;
import com.example.demo.Service.LeadDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/get_id/{id}")
    public LeadDetails get_byId(@PathVariable int id)
    {
        return lServ.getId(id);
    }

    @PostMapping("/post_leads")
    public LeadDetails postLeads(@RequestBody LeadDetails leadDetails)
    {
        return lServ.createLead(leadDetails);
    }


    @PutMapping("/put_leads")
    public LeadDetails updateLeads(@RequestBody LeadDetails leadDetails ){
        return lServ.updateLead(leadDetails);
    }

    @DeleteMapping("/del_lead/{id}")
    public void delLeads(@PathVariable Long id)
    {
        lServ.deleteLead(id);
    }

}
