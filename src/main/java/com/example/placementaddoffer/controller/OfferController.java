package com.example.placementaddoffer.controller;

import com.example.placementaddoffer.Service.OfferService;
import com.example.placementaddoffer.bean.Offer;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URISyntaxException;

@Path("offer")
public class OfferController {
    @POST
    @Path("/addOffer")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addOffer(Offer offer) throws URISyntaxException{
        boolean val = new OfferService().addOffer(offer);
        if(val == true)
            return Response.ok().build();
        else
            return Response.status(203).build();
    }


}



