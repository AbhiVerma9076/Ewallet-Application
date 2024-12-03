package com.example.majorproject;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResponseDto {

    private String name;
    private String email;
}
