package com.kafka.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class KafkaModel {
    private	String	activationCode;
    private	String	token;
    private	String	email;
    private String firstname;

}
