package codegym.case_study.entities;



import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.sql.Date;

@Entity
@Table (name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="customer_id")
    private Long id;

    @Pattern(regexp = "^KH-\\d{4}$", message = "PLEASE ENTER CODE IN CORRECT FORMAT(KH-XXXX)")
    @Column(name = "customer_code", length = 10, nullable = false)
    private String code;

    @ManyToOne
    @JoinColumn(name = "customer_type_id")
    private CustomerType customerType;

    @Size(min = 3, max=30, message = "INVALID FORMAT!!! PLEASE TRY AGAIN...")
    @Column(name = "customer_name")
    private String name;

    @Column(name = "customer_birthday")
    private Date birthday;

    @Pattern(regexp = "^((\\(\\+84\\))|0)9[01]\\d{7}$", message = "INVALID FORMAT!!! PLEASE TRY AGAIN...")
    @Column(name = "customer_phonenumber")
    private String phoneNumber;

    @Pattern(regexp = "^([-\\w.])+[a-zA-Z\\d]@(\\w+\\.)+(\\w+)$", message = "INVALID FORMAT!!! PLEASE TRY AGAIN...")
    @Column(name = "customer_email")
    private String email;

    @Size(min=1, max = 30, message = "INVALID FORMAT!!! PLEASE TRY AGAIN...")
    @Column(name = "customer_address")
    @Pattern(regexp = "^\\D+$", message = "INVALID FORMAT!!! PLEASE TRY AGAIN...")
    private String address;

    @Column(name = "customer_idnumber")
    @Pattern(regexp = "^\\d{9}$",message = "INVALID FORMAT!!! PLEASE TRY AGAIN...")
    private String idNumber;

    private Boolean status=true;

    public Customer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthDay) {
        this.birthday = birthDay;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
}
