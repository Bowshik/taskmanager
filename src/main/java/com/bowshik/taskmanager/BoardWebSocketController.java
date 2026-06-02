package com.bowshik.taskmanager;

import org.springframework.messaging.handler.annotation.*;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class BoardWebSocketController {

    private final SimpMessagingTemplate messagingTemplate;

    public BoardWebSocketController(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    @MessageMapping("/board/{boardId}")
    public void handleBoardMessage(@DestinationVariable Long boardId,
                                   @Payload BoardMessage message) {
        messagingTemplate.convertAndSend("/topic/board/" + boardId, message);
    }
}