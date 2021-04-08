package io.spring.lombok;

import lombok.extern.java.Log;

/*
Create a logs
*/
@Log
public class LombokExample6 {

    private LombokExample6() {
    }

    public static void main() {
        log.info("greado");
    }
}

