package codegym.case_study;

import codegym.case_study.entities.Customer;
import codegym.case_study.entities.CustomerType;
import codegym.case_study.formatters.CustomerTypeFormatter;
import codegym.case_study.services.CustomerTypeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.sql.Date;

@Configuration
public class AppConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addFormatter( new CustomerTypeFormatter());

    }
}
