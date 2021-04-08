package io.spring.app;

import io.spring.lombok.*;

import java.util.ArrayList;
import java.util.List;

public class App {


    LombokExample1 example1;

    public static void main(String[] args) {
        /*
        PS C:\Users\jcuencas\IdeaProjects\lombok-app> java -jar C:\Users\jcuencas\IdeaProjects\lombok-app\src\main\java\io\sprin
        g\lombok.jar delombok lombok -d C:\Users\jcuencas\IdeaProjects\lombok-app\src\main\java\io\spring\salida
        Can't find tools.jar. Rerun delombok as: java -cp lombok.jar;C:\path\to\tools.jar lombok.launch.Main delombok lombok -d C:\Users\jcuencas\IdeaProjects\lombok-app\src\main\java\io\spring\salida
        PS C:\Users\jcuencas\IdeaProjects\lombok-app>


        java -cp lombok.jar;C:\Program Files\Java\jdk1.8.0_144\lib\tools.jar lombok.launch.Main delombok lombok -d C:\Users\jcuencas\IdeaProjects\lombok-app\src\main\java\io\spring\salida

         */
        example1();
        example2();
        example3();
        example4();
        example5();
        example6();
        example7();
    }

    private static void example1() {
        print("example1");

        LombokExample1 example1 = new LombokExample1();
        example1.setEjemplo1("1");
        example1.setEjemplo2("2");
        example1.setEjemplo3("3");
        example1.setEjemplo4("4");
        example1.setEjemplo5("5");
    }

    private static void example2() {
        print("example2");
        LombokExample2 example2 = new LombokExample2();
        example2.setEjemplo3("3");
    }

    private static void example3() {
        print("example3");
        LombokExample3 example3 = new LombokExample3("1", "2", "3", "4", "5", 1D);
    }

    private static void example4() {
        print("example4");

        List<LombokExample4> lista = new ArrayList();
        LombokExample4 ejem1 = new LombokExample4();
        LombokExample4 ejem2 = new LombokExample4();
        ejem1.setId(1D);
        ejem2.setId(1D);
        if (ejem1.equals(ejem2)) {
            print("correcto");
        }

        lista.add(ejem1);
        if (lista.contains(ejem2)) {
            print("correcto");
        }

    }

    private static void example5() {
        print("example5");

        /**/
        // settear los eleementos de una clase
        LombokExample5 appConf = LombokExample5.builder()
                .ejemplo1("1")
                .ejemplo2("2")
                .ejemplo4("4")
                .build();

        /**/
    }

    private static void example6() {
        print("example6");
        LombokExample6.main();
    }

    private static void example7() {
        print("example7");

        LombokExample7 example7 = new LombokExample7();

        example7.main();
    }


    private static void print(final String example) {
        System.out.println(example+" ---------------------------------------------------- #");
    }
}
