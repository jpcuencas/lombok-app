package io.spring.lombok;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/*
Just read the class, added a nice to string method and a Equals and Hashcode method (only one field)
*/
@EqualsAndHashCode(of = "id")
@Getter
@Setter
public class LombokExample4 {
    private String ejemplo1;
    private String ejemplo2;
    private String ejemplo3;
    private String ejemplo4;
    private String ejemplo5;
    private Double id;
}
