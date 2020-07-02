package codegym.case_study.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;
@Entity
@Table(name = "contracts")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date startDate;
    private Date endDate;
    private String deposit;
    private String facilityCode;
    @ManyToMany
    @JoinTable(name = "contract_details")
    private List<AttachFacility> attachFacilityList;

    public Contract() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    public String getFacilityCode() {
        return facilityCode;
    }

    public void setFacilityCode(String facilityCode) {
        this.facilityCode = facilityCode;
    }

    public List<AttachFacility> getAttachFacilityList() {
        return attachFacilityList;
    }

    public void setAttachFacilityList(List<AttachFacility> attachFacilityList) {
        this.attachFacilityList = attachFacilityList;
    }
}

