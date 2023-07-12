package com.example.demo.Repository;


import com.example.demo.Model.SubmissionDTO;

import java.util.List;


public interface SubmissionsRepo {

    List<SubmissionDTO> getAll();

    SubmissionDTO getSubmissionById(String id);

    SubmissionDTO addSubmission(SubmissionDTO submission);
    SubmissionDTO updateSubmission(SubmissionDTO submission);

    SubmissionDTO deleteSubmission(String id);


}
