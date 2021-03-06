package com.example.placementaddoffer.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Offer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int offer_id;

    @Column(nullable = false)
    private String organization;

    @Column
    private String domain;

//    @Column
//   private String domain1;
//
//    @Column
//    private String domain2;


    @Column
    private String specialization;

    @Column
    private String minimum_grade;

    @Column
    private int maximum_intake;

    public Offer() {
    }

//    public String getDomain1() {
//        return domain1;
//    }
//
//    public void setDomain1(String domain1) {
//        this.domain1 = domain1;
//    }
//
//    public String getDomain2() {
//        return domain2;
//    }
//
//    public void setDomain2(String domain2) {
//        this.domain2 = domain2;
//    }

    public Offer(int offer_id, String organization, String domain, String specialization, String minimum_grade, int maximum_intake) {
        this.offer_id = offer_id;
        this.organization = organization;
       this.domain = domain;
//        this.domain2 = domain1;
        this.specialization = specialization;
        this.minimum_grade = minimum_grade;
        this.maximum_intake = maximum_intake;
    }

    public int getOffer_id() {
        return offer_id;
    }

    public void setOffer_id(int offer_id) {
        this.offer_id = offer_id;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getMinimum_grade() {
        return minimum_grade;
    }

    public void setMinimum_grade(String minimum_grade) {
        this.minimum_grade = minimum_grade;
    }

    public int getMaximum_intake() {
        return maximum_intake;
    }

    public void setMaximum_intake(int maximum_intake) {
        this.maximum_intake = maximum_intake;
    }
}
