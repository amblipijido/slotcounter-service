package com.dgv.slotcounter.websockets;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MessageEvent {
    private RaceEvents event;
    private Object payload;
}
