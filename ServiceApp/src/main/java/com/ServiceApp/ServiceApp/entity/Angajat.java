package com.ServiceApp.ServiceApp.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Builder
@Entity
@Setter
@Getter
@Table
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Angajat {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String nume;
    private String prenume;
    private String post;

    public  String fullName(){
        return this.nume +" " + this.prenume;
    }
}
