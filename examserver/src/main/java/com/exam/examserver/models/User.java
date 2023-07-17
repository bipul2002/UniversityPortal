package com.exam.examserver.models;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private  String userId;
    private String name;
    private String email;

}
