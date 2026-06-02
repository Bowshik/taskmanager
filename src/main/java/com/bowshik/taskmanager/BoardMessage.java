package com.bowshik.taskmanager;
import lombok.Data;

@Data
public class BoardMessage {
    private String type;
    private Object data;
}