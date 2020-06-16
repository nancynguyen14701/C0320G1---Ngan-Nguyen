package model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String birthday;
    private String address;
    private String urlImage;
    static private List<Customer> customers;
static{
    customers= new ArrayList<>();
    customers.add(new Customer("Hoàn","14/06/2001","HaNoi","https://scx1.b-cdn.net/csz/news/800/2019/canwereallyk.jpg"));
    customers.add(new Customer("Hoa","12/09/1890","America","https://scx1.b-cdn.net/csz/news/800/2019/canwereallyk.jpg"));
    customers.add(new Customer("Duy","13/09/1998","Australia","https://scx1.b-cdn.net/csz/news/800/2019/canwereallyk.jpg"));
    customers.add(new Customer("Huy","30/09/1997","Warsaw","https://scx1.b-cdn.net/csz/news/800/2019/canwereallyk.jpg"));
}
public static List<Customer> getList(){
    return customers;
}
    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public Customer(String name, String birthday, String address, String urlImage) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.urlImage= urlImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Customer() {
    }
}
