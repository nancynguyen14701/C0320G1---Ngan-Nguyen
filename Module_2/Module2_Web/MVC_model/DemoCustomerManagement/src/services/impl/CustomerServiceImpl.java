package services.impl;

import models.Customer;
import services.CustomerService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    private static Map<Integer, Customer> listCustomer;

    static {
        listCustomer = new HashMap<>();
        listCustomer.put(1, new Customer(1, "Thien Cuong", "cuong8t@gmail.com","VN"));
        listCustomer.put(2, new Customer(2, "Hoang Duy", "duy@gmail.com","Lao"));
        listCustomer.put(3, new Customer(3, "Cong Bach", "bach@gmail.com","JP"));
        listCustomer.put(4, new Customer(4, "Hoai Ngan", "ngan@gmail.com","KR"));
        listCustomer.put(5, new Customer(5, "Van Hau", "hau@gmail.com","US"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(listCustomer.values());
    }

    @Override
    public Customer findById(int id) {
        return listCustomer.get(id);
    }

    @Override
    public void deleteById(int id) {
        listCustomer.remove(id);
    }

    @Override
    public void save(Customer customer) {
        listCustomer.put(customer.getId(), customer);
    }
}
