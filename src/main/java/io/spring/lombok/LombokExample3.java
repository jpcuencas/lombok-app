package io.spring.lombok;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/*
Generates a constructor for all final fields, with parameter order same as field order
Creates an empty constructor.
Creates a constructor for all fields
*/
@AllArgsConstructor
@NoArgsConstructor
public class LombokExample3 {
    private String ejemplo1;
    private String ejemplo2;
    private String ejemplo3;
    private String ejemplo4;
    private String ejemplo5;
    private Double example1;
}
