package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
public class Student {
    @Id
    private String idStudent;

    @Column (name = "name")
    private String name;

    @Column (name = "address")
    private String address;

}