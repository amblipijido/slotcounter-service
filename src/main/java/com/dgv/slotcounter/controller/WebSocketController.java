package com.dgv.slotcounter.controller;

import com.dgv.slotcounter.model.races.LapSimpleDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
@Slf4j
public class WebSocketController {
    @MessageMapping("/event")
    public void send(String message) throws Exception {

         log.info(message);
    }
}
