package Common;

import Common.impl.ContactImpl;
import Common.impl.CustomerImpl;

public class IncomeDataAdapter {
    private IncomeData incomeData;

    public IncomeDataAdapter(IncomeData incomeData) {
        this.incomeData = incomeData;
    }

    public Contact getContact() {
        ContactImpl contact = new ContactImpl();
        contact.setName(incomeData.getContactFirstName() + " " + incomeData.getContactLastName());
        String phoneNumber = String.valueOf(incomeData.getPhoneNumber());
        StringBuffer str = new StringBuffer(phoneNumber);
        while (str.length() < 10)
            str.insert(0, "0");
        str.insert(0, "+" + incomeData.getCountryPhoneCode());
        str.insert(4, "(");
        str.insert(8, ")");
        contact.setPhoneNumber(str.toString());
        return contact;
    }

    public Customer getCustomer(){
        CustomerImpl customer = new CustomerImpl();
        customer.setCompanyName(incomeData.getCompany());
        customer.setCountryName(Solution.countries.get(incomeData.getCountryCode()));
        return customer;
    }
}
