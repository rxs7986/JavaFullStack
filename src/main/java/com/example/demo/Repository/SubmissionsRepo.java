package com.example.demo.Repository;


import com.example.demo.Model.SubmissionsModel;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface SubmissionsRepo {

    List<SubmissionsModel> getAll();

    SubmissionsModel getSubmissionById(String id);

    SubmissionsModel addSubmission(SubmissionsModel submission);
    SubmissionsModel updateSubmission(SubmissionsModel submission);

    SubmissionsModel deleteSubmission(String id);


}
