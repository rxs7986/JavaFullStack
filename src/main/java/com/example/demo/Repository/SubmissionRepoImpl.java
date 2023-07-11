package com.example.demo.Repository;


import com.example.demo.Model.SubmissionsModel;
import org.springframework.stereotype.Repository;

import java.util.*;


@Repository
public class SubmissionRepoImpl implements SubmissionsRepo{

    HashMap<String, SubmissionsModel> submissionsMap = new HashMap<>();
    @Override
    public List<SubmissionsModel> getAll() {
        List<SubmissionsModel> valuesList = new ArrayList<>();
        for (Map.Entry<String, SubmissionsModel> entry : submissionsMap.entrySet()) {
            valuesList.add(entry.getValue());
        }
        return valuesList;
    }

    @Override
    public SubmissionsModel getSubmissionById(String id) {
       return submissionsMap.get(id);
    }

    @Override
    public SubmissionsModel addSubmission(SubmissionsModel submission) {

         String id = UUID.randomUUID().toString();
         submission.setId(id);
        submissionsMap.put(id, submission);
        return submission;

    }

    @Override
    public SubmissionsModel updateSubmission(SubmissionsModel submission) {

        if (submissionsMap.containsKey(submission.getId())) {
            submissionsMap.put(String.valueOf(submission.getId()), submission);
            return submission;
        } else {
            return null; // Or throw an exception indicating the submission was not found
        }
    }

    @Override
    public SubmissionsModel deleteSubmission(String id) {
        return submissionsMap.remove(id);
    }







}
