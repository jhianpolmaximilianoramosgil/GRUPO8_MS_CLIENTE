package com.ms_customers.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "customers")
public class Customers {

    @Id private Long id;
    //@Id
    //private String id = UUID.randomUUID().toString().substring(0, 10);
    private String  name;
    private String  lastname;
    private String  dni;
    private String  cellphone;
    private String address;
    private String ruc;
    private String companyName;
    private String type;
    private boolean status;
}
