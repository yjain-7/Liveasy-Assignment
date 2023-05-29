package com.example.liveeasy.liveasy.Service;

import java.util.List;

import com.example.liveeasy.liveasy.Entities.PayLoad;

public interface PayLoadService {
    public List<PayLoad> getLoad();
    public PayLoad getLoadById(int loadId);
    public int addLoad(PayLoad payLoad);
    public void deleteLoad(int parseInt);
    public void updateLoad(PayLoad payLoad);
    
}
