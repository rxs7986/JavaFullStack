package com.example.demo.Controller;


import com.example.demo.Model.SubmissionDTO;
import com.example.demo.Service.SubmissionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/submission")
public class SubmissionsController {

    @Autowired
    private SubmissionsService subServ;

    @GetMapping("/getAll")
    public List<SubmissionDTO> getAllSub(){
        return subServ.getAll();
    }

   @GetMapping("/getById/{id}")
    public SubmissionDTO getById(@PathVariable String id){
        return  subServ.getSubmission(id);
    }

    @PostMapping(path = "/postSub")
    public SubmissionDTO addSub(@RequestBody SubmissionDTO submission)
    {
        return subServ.addSubmission(submission);
    }


    @PutMapping("/putSub")
    public SubmissionDTO updateSub(@RequestBody SubmissionDTO submission)
    {
        return subServ.updateSubmission(submission);
    }

    @DeleteMapping("/delSub/{id}")
    public SubmissionDTO deleteSub(@PathVariable String id){
        return subServ.deleteSubmission(id);
    }


}
