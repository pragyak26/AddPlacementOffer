package com.example.placementaddoffer.DAO.Implementation;

import com.example.placementaddoffer.DAO.OfferDAO;
import com.example.placementaddoffer.bean.Offer;
import com.example.placementaddoffer.util.HibernateSessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class OfferDAOImpl implements OfferDAO {
    @Override
    public boolean addOffer(Offer of) {
        try(Session session = HibernateSessionUtil.getSession()){
            Transaction t = session.beginTransaction();


//            Integer domain = Integer.parseInt(of.getDomain());
//            switch (domain){
//                case 1:
//                    of.setDomain("Theory and Systems");
//                    break;
//                case 2:
//                    of.setDomain("Data Science");
//                    break;
//            }
//            Integer specialization = Integer.parseInt(of.getSpecialization());
//            switch (specialization){
//                case 1:
//                    of.setSpecialization("MTech CSE");
//                    break;
//                case 2:
//                    of.setSpecialization("IMTech ECE");
//                    break;
//            }


            session.save(of);
            t.commit();
            return true;
        } catch(HibernateException exception) {
            System.out.println(exception.getLocalizedMessage());
            return false;
        }
    }


}
