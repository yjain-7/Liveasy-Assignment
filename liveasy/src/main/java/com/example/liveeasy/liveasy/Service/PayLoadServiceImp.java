package com.example.liveeasy.liveasy.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.liveeasy.liveasy.Entities.PayLoad;
@Service
public class PayLoadServiceImp implements PayLoadService {

    List<PayLoad> payloadList;

    public PayLoadServiceImp(){
        payloadList = new ArrayList<>();
        payloadList.add(new PayLoad("New York", "Los Angeles", "Electronics", "Refrigerated", 3, 5000.75, "Handle with care", "SHPR123", LocalDate.of(2023, 5, 15)));
        payloadList.add(new PayLoad("Chicago", "Houston", "Clothing", "Box Truck", 2, 3000.25, "Fragile items inside", "SHPR456", LocalDate.of(2023, 5, 20)));
        payloadList.add(new PayLoad("San Francisco", "Seattle", "Food", "Flatbed", 1, 2000.50, "Perishable goods", "SHPR789", LocalDate.of(2023, 6, 1)));
        payloadList.add(new PayLoad("Miami", "Atlanta", "Furniture", "Semi-Trailer", 4, 7000.0, "Assembly required", "SHPR987", LocalDate.of(2023, 5, 25)));
        payloadList.add(new PayLoad("Dallas", "Phoenix", "Chemicals", "Tanker", 1, 4000.75, "Hazardous materials", "SHPR654", LocalDate.of(2023, 6, 5)));
    }

    @Override
    public List<PayLoad> getLoad() {
        return payloadList;
    }

    @Override
    public PayLoad getLoadById(int loadId) {
        for(PayLoad payLoad : payloadList){
            if(payLoad.getLoadId() == loadId){
                return payLoad;
            }
        }
        return null;
    }

    @Override
    public int addLoad(PayLoad payLoad) {
        payloadList.add(payLoad);
        return payLoad.getLoadId();
    }

    @Override
    public void deleteLoad(int loadId) {
        
        for(PayLoad payLoad : payloadList){
            if(payLoad.getLoadId() == loadId) payloadList.remove(payLoad);
            return;
        }
    }

    @Override
    public void updateLoad(PayLoad payLoad) {
        
        return;
    }


    
}
