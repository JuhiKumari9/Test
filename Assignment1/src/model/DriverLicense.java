/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author juhip
 */
public class DriverLicense {
    //License number, date it was issued, date of expiration, blood type, and a picture.
    
    String licenseNum;
    String dateOfIssuence;
    String dateOfExpiration;
    String bloodType;
    String picture;

    public String getLicenseNum() {
        return licenseNum;
    }

    public void setLicenseNum(String licenseNum) {
        this.licenseNum = licenseNum;
    }

    public String getDateOfIssuence() {
        return dateOfIssuence;
    }

    public void setDateOfIssuence(String dateOfIssuence) {
        this.dateOfIssuence = dateOfIssuence;
    }

    public String getDateOfExpiration() {
        return dateOfExpiration;
    }

    public void setDateOfExpiration(String dateOfExpiration) {
        this.dateOfExpiration = dateOfExpiration;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
    
    
}
