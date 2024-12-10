package org.sid.billingservice.model;

import lombok.Data;

import java.nio.file.LinkOption;
@Data
public class Customer {
    private Long id;
    private String name;
    private String email;

}
