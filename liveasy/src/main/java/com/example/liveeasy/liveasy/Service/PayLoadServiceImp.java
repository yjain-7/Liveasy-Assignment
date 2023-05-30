package com.example.liveeasy.liveasy.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.liveeasy.liveasy.DAO.PayLoadDao;
import com.example.liveeasy.liveasy.Entities.PayLoad;
@Service
public class PayLoadServiceImp implements PayLoadService {
    @Autowired
    private PayLoadDao payLoadDao;
    public PayLoadServiceImp(){
    }

    @Override
    public List<PayLoad> getLoad() {
        return payLoadDao.findAll();
    }

    @Override
    public PayLoad getLoadById(Integer loadId) {
       return payLoadDao.findById(loadId).orElse(null);
    }

    @Override
    public Integer addLoad(PayLoad payLoad) {
        return payLoadDao.save(payLoad).getLoadId();
    }

    @Override
    public void deleteLoad(Integer loadId) {
        payLoadDao.deleteById(loadId);
    }

    @Override
    public void updateLoad(Integer loadId, PayLoad payLoad) {
        if(payLoadDao.existsById(loadId)){
            payLoad.setLoadId(loadId); // Set the ID of the payload to the loadId
            // Save the updated payload
            payLoadDao.save(payLoad);
        }
    }

}
