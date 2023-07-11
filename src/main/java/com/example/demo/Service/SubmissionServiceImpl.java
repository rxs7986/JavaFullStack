package com.example.demo.Service;

import com.example.demo.Model.SubmissionsModel;
import com.example.demo.Repository.SubmissionsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubmissionServiceImpl implements SubmissionsService{

    @Autowired
    private SubmissionsRepo subRepo;
    @Override
    public SubmissionsModel getSubmission(String id) {
        return subRepo.getSubmissionById(id);
    }

    @Override
    public SubmissionsModel addSubmission(SubmissionsModel submission) {
        return subRepo.addSubmission(submission);
    }

    @Override
    public SubmissionsModel updateSubmission(SubmissionsModel submission) {
        return subRepo.updateSubmission(submission);
    }

    @Override
    public SubmissionsModel deleteSubmission(String id) {
        return subRepo.deleteSubmission(id);
    }

    @Override
    public List<SubmissionsModel> getAll() {
        return subRepo.getAll()    ;
    }
}
