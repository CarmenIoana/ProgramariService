package com.ServiceApp.ServiceApp.dto;

import lombok.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProgramareDto {
    private String angajat_id;
    private String client_id;
    private LocalDateTime dataSiOra;
}