package com.example.demo.Service;


import com.example.demo.Model.SubmissionDTO;

import java.util.List;


public interface SubmissionsService {

    SubmissionDTO getSubmission(String id);

    SubmissionDTO addSubmission(SubmissionDTO submission);

    SubmissionDTO updateSubmission(SubmissionDTO submission);

    SubmissionDTO deleteSubmission(String id);

    List<SubmissionDTO> getAll();

}
