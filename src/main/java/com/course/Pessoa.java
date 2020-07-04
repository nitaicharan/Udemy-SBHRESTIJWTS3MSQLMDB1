package com.course;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Pessoa implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private Integer id;
    private String nome;
    private String email;
}