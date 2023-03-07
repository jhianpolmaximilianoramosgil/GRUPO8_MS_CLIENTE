package com.ms_customers.model;
import lombok.*;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class customers {

    @Id private Long id;
    private String  name;
    private String  lastname;
    private String  dni;
    private String  cellphone;
    private String address;
    private String ruc;
    private String companyname;
}
