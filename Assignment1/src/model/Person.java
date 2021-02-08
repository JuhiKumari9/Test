/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author juhip
 */
public class Person {
    public static String firstName;
    public static String lastName;
    BankAccount account;
    Address address;
    DemographicDetails demoDetails;
    DriverLicense license;
    Medical medical;

    public BankAccount getAccount() {
        return account;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public DemographicDetails getDemoDetails() {
        return demoDetails;
    }

    public void setDemoDetails(DemographicDetails demoDetails) {
        this.demoDetails = demoDetails;
    }

    public DriverLicense getLicense() {
        return license;
    }

    public void setLicense(DriverLicense license) {
        this.license = license;
    }

    public Medical getMedical() {
        return medical;
    }

    public void setMedical(Medical medical) {
        this.medical = medical;
    }
    
    
}
