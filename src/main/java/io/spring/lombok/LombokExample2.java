package io.spring.lombok;

/*
More detail getters and setters
When you don't want getters and setters for all fields
and also maybe control access modifiers
*/

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

public class LombokExample2 {
    @Getter(AccessLevel.PROTECTED)
    @Setter(AccessLevel.PROTECTED)
    private String ejemplo1;

    @Getter(AccessLevel.PACKAGE)
    @Setter(AccessLevel.PACKAGE)
    private String ejemplo2;

    @Getter
    @Setter
    private String ejemplo3;

    @Setter
    private String ejemplo4;

    @Getter
    private String ejemplo5;

    @Getter(AccessLevel.PROTECTED)
    @Setter(AccessLevel.PROTECTED)
    private Double example1;
}
