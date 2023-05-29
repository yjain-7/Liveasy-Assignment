package com.example.liveeasy.liveasy.Entities;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Entity
public class PayLoad {
    @JsonProperty("loadId")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer loadId;

    @JsonProperty("loadingPoint")
    private String loadingPoint;
    
    @JsonProperty("unloadingPoint")
    private String unloadingPoint;
    
    @JsonProperty("productType")
    private String productType;
    
    @JsonProperty("truckType")
    private String truckType;
    
    @JsonProperty("noOfTrucks")
    private Integer noOfTrucks;
    
    @JsonProperty("weight")
    private Double weight;
    
    @JsonProperty("comment")
    private String comment;
    
    @JsonProperty("shipperId")
    private String shipperId;
    
    @JsonProperty("date")
    private LocalDate date;

    public PayLoad(String loadingPoint, String unloadingPoint, String productType, String truckType, int noOfTrucks,
            double weight, String comment, String shipperId, LocalDate date) {
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



}
