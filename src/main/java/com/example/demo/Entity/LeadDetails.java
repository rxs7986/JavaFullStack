package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "lead_details")
@Data
public class LeadDetails {

    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name ="last_name")
    private String lastName;


    @Column(name ="email_address")
    private String emailAddress;


    @Column(name ="phone_number")
    private String phoneNumber;


}
