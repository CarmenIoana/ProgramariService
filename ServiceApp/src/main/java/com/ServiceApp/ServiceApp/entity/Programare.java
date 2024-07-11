package com.ServiceApp.ServiceApp.entity;



import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@Entity
@Setter
@Getter
@Table(uniqueConstraints={
        @UniqueConstraint(columnNames = {"id"})
})
@AllArgsConstructor
@NoArgsConstructor
@ToString


public class Programare {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name="angajat_id")
    private  Angajat angajat;

    @ManyToOne
    @JoinColumn(name="client_id")
    private Client client;

    private LocalDateTime dataSiOra;


}
