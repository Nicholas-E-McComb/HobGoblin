package com.worldgate.test;

import com.worldgate.dao.BatchDaoImplementation;
import com.worldgate.model.Batch;

import java.util.Date;

public class testImp {

    public static void main(String[] args) {

        Batch temp = new Batch("JTA 1804", "SDET", "Yuvi", "Revature HQ",
                "Main", 304, new Date(), new Date());


        BatchDaoImplementation BDao = new BatchDaoImplementation();

        BDao.insertBatch(temp);
    }
}
