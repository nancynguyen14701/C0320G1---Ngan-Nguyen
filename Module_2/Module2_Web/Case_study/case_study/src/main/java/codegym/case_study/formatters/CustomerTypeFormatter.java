package codegym.case_study.formatters;

import codegym.case_study.entities.CustomerType;
import codegym.case_study.services.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class CustomerTypeFormatter implements Formatter<CustomerType> {
    @Autowired
    CustomerTypeService customerTypeService;
    @Override
    public CustomerType parse(String s, Locale locale) throws ParseException {
        return customerTypeService.findCustomerTypeById(Long.parseLong(s));
    }

    @Override
    public String print(CustomerType customerType, Locale locale) {
        return null;
    }
}
