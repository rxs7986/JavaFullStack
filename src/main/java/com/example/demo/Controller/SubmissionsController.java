package com.example.demo.Controller;


import com.example.demo.Model.SubmissionsModel;
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
    public List<SubmissionsModel> getAllSub(){
        return subServ.getAll();
    }

   @GetMapping("/getById/{id}")
    public SubmissionsModel getById(@PathVariable String id){
        return  subServ.getSubmission(id);
    }

    @PostMapping(path = "/postSub")
    public SubmissionsModel addSub(@RequestBody SubmissionsModel submission)
    {
        return subServ.addSubmission(submission);
    }


    @PutMapping("/putSub")
    public SubmissionsModel updateSub(@RequestBody SubmissionsModel submission)
    {
        return subServ.updateSubmission(submission);
    }

    @DeleteMapping("/delSub/{id}")
    public SubmissionsModel deleteSub(@PathVariable String id){
        return subServ.deleteSubmission(id);
    }


}
