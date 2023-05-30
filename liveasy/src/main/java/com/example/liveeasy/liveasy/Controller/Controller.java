package com.example.liveeasy.liveasy.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.liveeasy.liveasy.Entities.PayLoad;
import com.example.liveeasy.liveasy.Service.PayLoadService;

import jakarta.persistence.criteria.CriteriaBuilder.In;

@RestController
public class Controller {
    //post /load
    //get /load - done
    // get /load/{loadId} done 
    // put /load/{loadId}
    //delete load/{loadId}
    @Autowired
    private PayLoadService service;

    @GetMapping("/home")
    public String home(){
        return "My application";
    }

    @GetMapping("/load")
    public List<PayLoad> getLoad(){
        return this.service.getLoad();
    }

    @GetMapping("/load/{loadId}")
    public ResponseEntity<?> getLoad(@PathVariable("loadId") String loadId){
        try {
            Integer id = Integer.parseInt(loadId);
            return ResponseEntity.ok(this.service.getLoadById(id));
        } catch (NumberFormatException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid input. The string cannot be converted to an integer.");
        }
    }

    @PostMapping("/load")
    public String postLoad(@RequestBody PayLoad payLoad){
        Integer id = this.service.addLoad(payLoad);

        return "Load details added successfully. LoadId : " + id;
    }

    @DeleteMapping("/load/{loadId}")
    public String deleteLoad(@PathVariable String loadId){
        this.service.deleteLoad(Integer.parseInt(loadId));
        return "Successfully Deleted"+loadId;
    }

    @PutMapping("/load/{loadId}")
    public String puttLoad(@PathVariable String loadId, @RequestBody PayLoad payLoad){
        this.service.updateLoad(Integer.parseInt(loadId),payLoad);
        return "Updated Successfully";
    }
}
