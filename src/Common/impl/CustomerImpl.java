package Common.impl;

import Common.Customer;

public class CustomerImpl implements Customer {
    private String companyName;
    private String countryName;

    @Override
    public String getCompanyName() {
        return companyName;
    }

    @Override
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
