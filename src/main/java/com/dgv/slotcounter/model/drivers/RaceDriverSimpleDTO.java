package com.dgv.slotcounter.model.drivers;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RaceDriverSimpleDTO {

    private Long id;
    private String name;
    private String surname;
    private String alias;
    private LocalDate birthday;
}
