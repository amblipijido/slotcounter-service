package com.dgv.slotcounter.model.drivers;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RaceDriverSimpleDTO {

    private Long id;
    @NotEmpty
    private String name;
    @NotEmpty
    private String surname;
    @NotEmpty
    private String alias;
    @NotNull
    private LocalDate birthday;
}
