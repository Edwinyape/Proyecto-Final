package com.nttdata.customerservice.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Cliente")
public class Customer {
    @Id
    private String id;
    private String nomCustomer;
    private String razSocialCustomer;
    private String tipoCustomer;
    private String numidentidadCustomer;
    private String telefCustomer;
    private String correoCustomer;
}