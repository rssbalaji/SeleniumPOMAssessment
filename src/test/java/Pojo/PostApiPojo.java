package Pojo;

import java.util.Map;

public class PostApiPojo {

    private Integer petId;
    private Integer id;
    private Integer quantity;
    private String status;
    private String shipDate;
    private Boolean complete;

    public PostApiPojo(Map<String,String> requestBody) {
        this.petId = Integer.parseInt(requestBody.get("petId")) ;
        this.id = Integer.parseInt(requestBody.get("id"));
        this.quantity = Integer.parseInt(requestBody.get("quantity"));
        this.status = requestBody.get("status").toString();
        this.shipDate = requestBody.get("shipDate").toString();
        this.complete =  Boolean.parseBoolean(requestBody.get("complete"));
    }

    public Integer getPetId() {
        return petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getShipDate() {
        return shipDate;
    }

    public void setShipDate(String shipDate) {
        this.shipDate = shipDate;
    }

    public Boolean getComplete() {
        return complete;
    }

    public void setComplete(Boolean complete) {
        this.complete = complete;
    }

    @Override
    public String toString() {
        return "PostApiPojo{" +
                "petId='" + petId + '\'' +
                ", id='" + id + '\'' +
                ", quantity='" + quantity + '\'' +
                ", status='" + status + '\'' +
                ", shipDate='" + shipDate + '\'' +
                ", complete='" + complete + '\'' +
                '}';
    }
}
