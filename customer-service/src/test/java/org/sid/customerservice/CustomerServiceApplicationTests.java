package org.sid.customerservice;

import org.junit.jupiter.api.Test;
import org.sid.customerservice.entities.Customer;
import org.sid.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootTest
class CustomerServiceApplicationTests {

    @Test
    void contextLoads() {
    }

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class,args);
    }

}
