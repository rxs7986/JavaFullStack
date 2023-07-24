package com.example.demo.Service;

import com.example.demo.Entity.ConsultantDetails;
import com.example.demo.Entity.LeadDetails;
import com.example.demo.Repository.ConsultantDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ConsultantDetailsService implements IConsultantDetailsService{


    @Autowired
    private ConsultantDetailsRepository cRepo;

    @Override
    public List<ConsultantDetails> getAllC() {
        return cRepo.findAll();
    }

    @Override
    public ConsultantDetails getId(long id) {
        Optional<ConsultantDetails> consultantDetails = cRepo.findById(id);
        return consultantDetails.orElse(null);
    }

    @Override
    public ConsultantDetails createConsultant(ConsultantDetails consultantDetails) {
        return cRepo.save(consultantDetails);
    }

    @Override
    public ConsultantDetails updateConsultant(ConsultantDetails consultantDetails) {
        // First, check if the entity with the given ID exists in the database
        Optional<ConsultantDetails> existingConsultantOptional = cRepo.findById(consultantDetails.getId());

        if (existingConsultantOptional.isPresent()) {
            // If the entity exists, update its properties
            ConsultantDetails existingConsultant = existingConsultantOptional.get();
            existingConsultant.setFirstName(consultantDetails.getFirstName());
            existingConsultant.setLastName(consultantDetails.getLastName());
            existingConsultant.setEmailAddress(consultantDetails.getEmailAddress());
            existingConsultant.setPhoneNumber(consultantDetails.getPhoneNumber());

            // Save the updated entity back to the database
            return cRepo.save(existingConsultant);
        } else {
            // If the entity with the given ID does not exist, you may choose to throw an exception or handle it accordingly.
            // For simplicity, I'm returning null here to indicate that the update was not successful.
            return null;
        }
    }

    @Override
    public void deleteConsultant(Long id) {
          cRepo.deleteById(id);

    }
}
