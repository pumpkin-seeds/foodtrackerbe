package com.foodtrackerbe.foodtrackerbe.websocket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

@Controller
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class ChatController {

    private static final Logger log = LoggerFactory.getLogger(ChatMessage.class); // TODO: get rid of logging

    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    public ChatMessage send(ChatMessage message) throws Exception {
        Thread.sleep(1000);
        log.info("Websocket testing message is: {}", message);
        return message;
    }
}
