package com.example.demo.Service;

import com.example.demo.Entity.LeadDetails;

import java.util.List;

public interface LeadDetailsService {

    List<LeadDetails> getAll();

    LeadDetails getId(long id);

    LeadDetails createLead(LeadDetails leadDetails);

    LeadDetails updateLead(LeadDetails leadDetails);

    public void  deleteLead(Long id );


}
