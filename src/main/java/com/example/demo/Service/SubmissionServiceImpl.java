package com.example.demo.Service;

import com.example.demo.Model.SubmissionDTO;
import com.example.demo.Repository.SubmissionsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubmissionServiceImpl implements SubmissionsService{

    @Autowired
    private SubmissionsRepo subRepo;
    @Override
    public SubmissionDTO getSubmission(String id) {
        return subRepo.getSubmissionById(id);
    }

    @Override
    public SubmissionDTO addSubmission(SubmissionDTO submission) {
        return subRepo.addSubmission(submission);
    }

    @Override
    public SubmissionDTO updateSubmission(SubmissionDTO submission) {
        return subRepo.updateSubmission(submission);
    }

    @Override
    public SubmissionDTO deleteSubmission(String id) {
        return subRepo.deleteSubmission(id);
    }

    @Override
    public List<SubmissionDTO> getAll() {
        return subRepo.getAll()    ;
    }
}
