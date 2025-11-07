package Entities;

import java.util.Date;

public class Order {
    private String code;
    private Float total_value;
    private String status;
    private Date creation_date;

    public Order(){}

    public Order(Date creation_date, String status, Float total_value, String code) {
        this.creation_date = creation_date;
        this.status = status;
        this.total_value = total_value;
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Float getTotal_value() {
        return total_value;
    }

    public void setTotal_value(Float total_value) {
        this.total_value = total_value;
    }
}
