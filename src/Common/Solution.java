package Common;

import Common.impl.IncomeDataImpl;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static Map<String, String> countries = new HashMap<String, String>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {
        IncomeDataImpl incomeData = new IncomeDataImpl();
        incomeData.setContactFirstName("Андрей");
        incomeData.setContactLastName("Иванов");
        incomeData.setCompany("ООО моя оборона");
        incomeData.setCountryCode("RU");
        incomeData.setPhoneCode(4325);
        incomeData.setPhoneNumber(2353535);

        IncomeDataAdapter incomeDataAdapter = new IncomeDataAdapter(incomeData);

        Contact contact = incomeDataAdapter.getContact();
        System.out.println(contact.getName());
        System.out.println(contact.getPhoneNumber() + "\n");

        Customer customer = incomeDataAdapter.getCustomer();
        System.out.println(customer.getCompanyName());
        System.out.println(customer.getCountryName());

    }

}
