package codegym.case_study.validators;

import codegym.case_study.entities.Customer;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class DateValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return DateValidator.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Customer customer =(Customer)o;
        ValidationUtils.rejectIfEmpty(errors,"birthday","birthday.empty");

        if(customer.getBirthday() == null)
            errors.rejectValue("birthday", "birthday.empty1");
    }
}
