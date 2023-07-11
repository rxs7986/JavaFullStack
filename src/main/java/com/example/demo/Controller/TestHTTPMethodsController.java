package com.example.demo.Controller;

import com.example.demo.Service.TestHTTPMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/resource")
public class TestHTTPMethodsController {


    @Autowired
    private TestHTTPMService sd;

//    @GetMapping("/hi")
//    public String sayHi()
//    {
//        return "Hi.!!!";
//    }
//
//
//    @GetMapping("/hello")
//    public String sayHello(){
//        return "Hello";
//    }


    @GetMapping("/get_names")
    public List<String> getAllNames()
    {

        return sd.getNames();
    }

    @PostMapping("/post_name")
    public void postName(@RequestBody String name){
        sd.addName(name);
    }

    @PutMapping("/put_name/{idx}")
    public void putName(@PathVariable int idx, @RequestBody String  newStr)
    {
        sd.updateName(idx, newStr);
    }

    @DeleteMapping("/delete_name/{id}")
    public void delName(@PathVariable int id)
    {
        sd.deleteName(id);
    }



}
