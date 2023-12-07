package com.spring.Basic;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(path = "/data")
public class GetData {
    static ArrayList<String>students = new ArrayList<>();
    static {
        students.add("Id = 1, first name = volkan, last name = onal, birth country = turkey");
        students.add("Id = 2, first name = niloya, last name = tosbik, birth country = turkey");
    }

    @GetMapping({"/student/{id}"})
    public String getStudent(@PathVariable int id) {
        int index = getIndex(id);
        if(index == -1){
            return "User not found";
        }
        System.out.println("sadasdasd");
        return students.get(index);
    }

    public static int getIndex(int id){
        for(int i = 0; i<students.size(); i++){
            if(students.get(i).contains("Id = "+id)){
                return i;
            }
        }
        return -1;
    }
}
