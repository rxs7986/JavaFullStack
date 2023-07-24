package com.example.demo.Service;

import com.example.demo.Entity.ConsultantDetails;
import com.example.demo.Entity.LeadDetails;

import java.util.List;

public interface IConsultantDetailsService {

    List<ConsultantDetails> getAllC();

    ConsultantDetails getId(long id);

    ConsultantDetails createConsultant(ConsultantDetails consultantDetails);

    ConsultantDetails updateConsultant(ConsultantDetails consultantDetails);

    public void  deleteConsultant(Long id );
}
