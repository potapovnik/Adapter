package Common.impl;

import Common.IncomeData;

public class IncomeDataImpl implements IncomeData {
    private String countryCode;
    private String company;
    private String contactFirstName;
    private String contactLastName;
    private int phoneCode;
    private int phoneNumber;

    @Override
    public String getCountryCode() {
        return countryCode;
    }

    @Override
    public String getCompany() {
        return company;
    }

    @Override
    public String getContactFirstName() {
        return contactFirstName;
    }

    @Override
    public String getContactLastName() {
        return contactLastName;
    }

    @Override
    public int getCountryPhoneCode() {
        return phoneCode;
    }

    @Override
    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPhoneCode(int phoneCode) {
        this.phoneCode = phoneCode;
    }

    public void setContactLastName(String contactLastName) {
        this.contactLastName = contactLastName;
    }

    public void setContactFirstName(String contactFirstName) {
        this.contactFirstName = contactFirstName;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}
