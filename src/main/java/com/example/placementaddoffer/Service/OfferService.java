package com.example.placementaddoffer.Service;

import com.example.placementaddoffer.DAO.Implementation.OfferDAOImpl;
import com.example.placementaddoffer.bean.Offer;

public class OfferService {
    OfferDAOImpl offerDAO = new OfferDAOImpl();
    public boolean addOffer(Offer offer){
        return offerDAO.addOffer(offer);
    }

}
