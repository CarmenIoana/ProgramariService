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
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String nume;

    private String prenume;

    public String fullName(){
        return this.nume+" "+this.prenume;
    }



}
