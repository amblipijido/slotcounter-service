package com.dgv.slotcounter.websockets;

import com.dgv.slotcounter.model.races.LapSimpleDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;

@Component
@Slf4j
public class WebSocketHandler extends TextWebSocketHandler {


    private final ObjectMapper objectMapper;

    public WebSocketHandler(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message)
            throws InterruptedException, IOException {
        MessageEvent messageEvent = objectMapper.readValue(message.getPayload(), MessageEvent.class);
        log.info(message.getPayload());
        switch (messageEvent.getEvent()) {
            case LAP:
                objectMapper.convertValue(messageEvent.getPayload(), LapSimpleDTO.class);
                break;
            case PENALTY:
            case END_RACE:
            case START_RACE:
        }
        session.sendMessage(new TextMessage(session.getId()));
    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        session.sendMessage(new TextMessage(session.getId()));
    }
}
