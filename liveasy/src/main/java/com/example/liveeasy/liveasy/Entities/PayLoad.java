package com.example.liveeasy.liveasy.Entities;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// "loadingPoint": "delhi",
// "unloadingPoint": "jaipur",
// "productType": "chemicals",
// "truckType": "canter",
// "noOfTrucks": "1",
// "weight": "100",
// optional:"comment": "",
// “shipperId” : “shipper:<UUID>”,
// “Date” : “dd-mm-yyyy”
@Data
@NoArgsConstructor
public class PayLoad {
    private static int nextLoadId = 1;
    @JsonProperty("loadId")
    private int loadId;

    @JsonProperty("loadingPoint")
    private String loadingPoint;
    
    @JsonProperty("unloadingPoint")
    private String unloadingPoint;
    
    @JsonProperty("productType")
    private String productType;
    
    @JsonProperty("truckType")
    private String truckType;
    
    @JsonProperty("noOfTrucks")
    private int noOfTrucks;
    
    @JsonProperty("weight")
    private double weight;
    
    @JsonProperty("comment")
    private String comment;
    
    @JsonProperty("shipperId")
    private String shipperId;
    
    @JsonProperty("date")
    private LocalDate date;

    public PayLoad(String loadingPoint, String unloadingPoint, String productType, String truckType, int noOfTrucks,
            double weight, String comment, String shipperId, LocalDate date) {
        this.loadId = getNextLoadId();
        this.loadingPoint = loadingPoint;
        this.unloadingPoint = unloadingPoint;
        this.productType = productType;
        this.truckType = truckType;
        this.noOfTrucks = noOfTrucks;
        this.weight = weight;
        this.comment = comment;
        this.shipperId = shipperId;
        this.date = date;
    }

    private int getNextLoadId() {
        return nextLoadId++;
    }



}
