package com.example.demo.Service;


import com.example.demo.Model.SubmissionsModel;
import com.example.demo.Repository.SubmissionRepoImpl;
import org.springframework.stereotype.Service;

import java.util.List;


public interface SubmissionsService {

    SubmissionsModel getSubmission(String id);

    SubmissionsModel addSubmission(SubmissionsModel submission);

    SubmissionsModel updateSubmission(SubmissionsModel submission);

    SubmissionsModel deleteSubmission(String id);

    List<SubmissionsModel> getAll();

}
