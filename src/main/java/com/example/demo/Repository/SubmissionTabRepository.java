package com.example.demo.Repository;

import com.example.demo.Entity.SubmissionDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubmissionTabRepository extends JpaRepository<SubmissionDetails,Long> {
}
