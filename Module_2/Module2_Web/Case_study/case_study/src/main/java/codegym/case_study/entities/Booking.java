package codegym.case_study.entities;

import java.sql.Date;
import java.util.List;

public class Booking {

    private Date startDate;
    private Date endDate;
    private String[] attachFacilityList;
    private String serviceCode;

    public Booking() {
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }


    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String[] getAttachFacilityList() {
        return attachFacilityList;
    }

    public void setAttachFacilityList(String[] attachFacilityList) {
        this.attachFacilityList = attachFacilityList;
    }
}
