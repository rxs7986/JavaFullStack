package com.example.demo.Service;


import com.example.demo.Entity.LeadDetails;
import com.example.demo.Repository.LeadDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Service
public class LeadDetailsServiceImpl implements LeadDetailsService{


    @Autowired
    private LeadDetailsRepository lRepo;

    @Override
    public List<LeadDetails> getAll() {
        return lRepo.findAll();
    }

    @Override
    public LeadDetails getId(long id) {
        Optional<LeadDetails> leadDetailsOptional = lRepo.findById(id);
        return leadDetailsOptional.orElse(null);
    }

    @Override
    public LeadDetails createLead(LeadDetails leadDetails) {

        return lRepo.save(leadDetails);

    }


    @Override
    public LeadDetails updateLead(LeadDetails leadDetails) {
        // First, check if the entity with the given ID exists in the database
        Optional<LeadDetails> existingLeadOptional = lRepo.findById(leadDetails.getId());

        if (existingLeadOptional.isPresent()) {
            // If the entity exists, update its properties
            LeadDetails existingLead = existingLeadOptional.get();
            existingLead.setFirstName(leadDetails.getFirstName());
            existingLead.setLastName(leadDetails.getLastName());
            existingLead.setEmailAddress(leadDetails.getEmailAddress());
            existingLead.setPhoneNumber(leadDetails.getPhoneNumber());

            // Save the updated entity back to the database
            return lRepo.save(existingLead);
        } else {
            // If the entity with the given ID does not exist, you may choose to throw an exception or handle it accordingly.
            // For simplicity, I'm returning null here to indicate that the update was not successful.
            return null;
        }
    }


    @Override
    public void deleteLead(Long id) {
        lRepo.deleteById(id);
    }


}
