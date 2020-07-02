package codegym.case_study.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="customer_type")
public class CustomerType {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="customer_type_id")
    private Long id;

    private String name;

    @OneToMany(targetEntity = Customer.class)
    private List<Customer> customerList;

    public CustomerType() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
}
