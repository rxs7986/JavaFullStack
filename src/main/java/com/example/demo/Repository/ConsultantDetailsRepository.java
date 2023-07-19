package com.example.demo.Repository;

import com.example.demo.Entity.ConsultantDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConsultantDetailsRepository extends JpaRepository<ConsultantDetails,Long> {


}
