package com.zw.db.service;

import cn.hutool.core.util.RandomUtil;
import com.zw.db.model.StockModel;
import org.javalite.activejdbc.Model;
import org.springframework.stereotype.Service;

@Service
public class StockService {
    /**
     *
     */
   public void addStock(){
        StockModel model = StockModel.findById(10);
       if (model==null){
           model=new StockModel();
       }
        model.set("name","ActiveJdbc"+System.currentTimeMillis());
        model.set("num",3);
        model.set("code", RandomUtil.randomInt(1,100000));

//        model.saveIt();

    }
}
