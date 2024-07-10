package com.ServiceApp.ServiceApp.entity;



import jakarta.persistence.*;
import lombok.*;

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
    

}
