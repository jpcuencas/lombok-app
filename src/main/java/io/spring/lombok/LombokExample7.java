package io.spring.lombok;

import com.sun.istack.internal.NotNull;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

import java.io.InputStream;

/*
Check exceptions burden
*/
@RequiredArgsConstructor
public class LombokExample7 {
    private @NotNull
    String ejemplo1;
    private @NotNull
    String ejemplo2;
    private @NotNull
    String ejemplo3;
    private @NotNull
    String ejemplo4;
    private @NotNull
    String ejemplo5;
    private @NotNull
    Double id;

    /**
     * quita las excepciones
     */
    @SneakyThrows
    public void main() {
        try (InputStream ex = this.getClass().getResourceAsStream("ejample.txt")) {
            id = null;
        }
    }

/**
 @SneakyThrows public void main1() {
 try {
 Object a = this.getClass().getResourceAsStream("ejample.txt");
 }
 }
 /***
 public void main2() {
 //@Cleanup InputStream ex = this.getClass().getResourceAsStream("ejample.txt");
 }
 /**/
}

