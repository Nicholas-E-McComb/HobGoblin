package com.worldgate.dao;

import com.worldgate.model.Batch;
import com.worldgate.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class BatchDaoImplementation implements BatchDao{

    @Override
    public void insertBatch(Batch batch) {
        Session session = HibernateUtil.getSession().openSession();
        Transaction t1 = null;
        try {
            t1 = session.beginTransaction();
            session.save(batch);
            t1.commit();
            // save and persist
        } catch (HibernateException h) {

        } finally {
            session.close();
        }

    }
}
