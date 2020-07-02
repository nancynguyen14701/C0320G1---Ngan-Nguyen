package codegym.case_study.entities;

import org.springframework.context.annotation.EnableMBeanExport;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "facility_type")
public class FacilityType {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(targetEntity = Facility.class)
    private List<Facility> facilityList;

    public FacilityType() {
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

    public List<Facility> getFacilityList() {
        return facilityList;
    }

    public void setFacilityList(List<Facility> facilityList) {
        this.facilityList = facilityList;
    }
}
