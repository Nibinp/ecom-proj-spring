package com.nibin.ecom_proj.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
public class Product {

    @Id
    private int id;

    private String name;
    private String desc ;
    private String brand;
    private BigDecimal price;
    private String category;

    @JsonFormat( shape =JsonFormat.Shape.STRING ,pattern = "dd-MM-yyyy")
    private Date releasedate;
    private int quantity;
    private boolean available;

    public String getname()
    {
        return  this.name;
    }
}
