package com.example.demo.Service;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestHTTPMService {

    List<String> names = new ArrayList<>();
    public TestHTTPMService() {
        names.add("Rachna");
        names.add("Sanda");

    }

    public List<String> getNames(){
        return names;
    }

    public void addName(String str)
    {
        names.add(str);
    }

    public void updateName(int idx, String newName){
        if(idx>=0 && idx<names.size()){
            names.set(idx,newName);
        }
    }


    public void deleteName(int id)
    {
        if(id>=0 && id<names.size()){
            names.remove(id);
        }
    }




}