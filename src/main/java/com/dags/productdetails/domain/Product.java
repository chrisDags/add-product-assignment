package com.dags.productdetails.domain;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
public class Product {

    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column(name = "product_name")
    @NotNull
    @NotBlank
    private String productName;

    @Column
    @NotNull
    private BigDecimal productPrice;

}
