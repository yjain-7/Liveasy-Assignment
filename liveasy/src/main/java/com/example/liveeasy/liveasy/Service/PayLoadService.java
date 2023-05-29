package com.example.liveeasy.liveasy.Service;

import java.util.List;

import com.example.liveeasy.liveasy.Entities.PayLoad;

public interface PayLoadService {
    public List<PayLoad> getLoad();
    public PayLoad getLoadById(Integer loadId);
    public Integer addLoad(PayLoad payLoad);
    public void deleteLoad(Integer parseInt);
    public void updateLoad(Integer loadId, PayLoad payLoad);
    
}
