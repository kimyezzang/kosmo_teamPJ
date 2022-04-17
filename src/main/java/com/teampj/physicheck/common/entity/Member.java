package com.teampj.physicheck.common.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.Type;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor
public class Member {

    @Id
    @SequenceGenerator(sequenceName = "member_seq", name = "member_seq_generator", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "member_seq_generator")
    private int memberNo;

    @NonNull
    private String id;

    @NonNull
    private String password;

    @Type(type="yes_no")
    private boolean able = true;

    @NonNull
    private String name;

    private String email;

    private LocalDateTime inDate = LocalDateTime.now();

    private LocalDateTime outDate;

    private String authority;

    private String tel;

    private String gender;

    private int jumin1;

    private int jumin2;

    private String address;

    private int enabled;

    private String examination;

}