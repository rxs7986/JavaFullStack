package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="submission")
@Data
public class SubmissionDetails {

  @Id
  @Column(name = "id")
   private long id;

  @Column(name = "submission_id")
  private long submission_id;


  @Column(name = "consultant_id")
    private long consultant_id ;

  @Column(name = "submission_date")
    private String submission_date;

  @Column(name = "vendor_company")
    private String vendor_company;

  @Column(name = "vendor_name")
    private String vendor_name;

 @Column(name="vendor_email_address")
    private String vendor_email_address;

 @Column(name = "vendor_phone_number")
    private String vendor_phone_number;

@Column(name= "implementation_partner")
    private String implementation_partner;

@Column(name ="clientt_name")
    private String clientt_name;
@Column(name="pay_rate")
    private int pay_rate;


@Column(name="submission_type")
    private String submission_type;

@Column(name="city")
    private String city;

  @Column(name="statee")
    private String statee;

  @Column(name="zip")
  private String zip;

    @Column(name="submission_status")
    private boolean submission_status;
}
