package com.umgsai.uorder.api.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class StepResult implements Serializable {

    private boolean success;

    private String Code;

    private String message;
}
