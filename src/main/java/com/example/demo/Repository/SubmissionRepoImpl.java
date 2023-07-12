package com.example.demo.Repository;


import com.example.demo.Model.SubmissionDTO;
import org.springframework.stereotype.Repository;

import java.util.*;


@Repository
public class SubmissionRepoImpl implements SubmissionsRepo{

    HashMap<String, SubmissionDTO> submissionsMap = new HashMap<>();
    @Override
    public List<SubmissionDTO> getAll() {
        List<SubmissionDTO> valuesList = new ArrayList<>();
        for (Map.Entry<String, SubmissionDTO> entry : submissionsMap.entrySet()) {
            valuesList.add(entry.getValue());
        }
        return valuesList;
    }

    @Override
    public SubmissionDTO getSubmissionById(String id) {
       return submissionsMap.get(id);
    }

    @Override
    public SubmissionDTO addSubmission(SubmissionDTO submission) {

         String id = UUID.randomUUID().toString();
         submission.setId(id);
        submissionsMap.put(id, submission);
        return submission;

    }

    @Override
    public SubmissionDTO updateSubmission(SubmissionDTO submission) {

        if (submissionsMap.containsKey(submission.getId())) {
            submissionsMap.put(String.valueOf(submission.getId()), submission);
            return submission;
        } else {
            return null; // Or throw an exception indicating the submission was not found
        }
    }

    @Override
    public SubmissionDTO deleteSubmission(String id) {
        return submissionsMap.remove(id);
    }







}
