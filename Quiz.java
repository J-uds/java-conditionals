import java.sql.SQLOutput;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        //Escribe un programa que sea un pequeño juego trivial de acertar preguntas
        //Cada pregunta tendrá 4 opciones que el usuario podrá escoger
        //Por cada respuesta correcta, añade 5 puntos al puntaje
        //Al finalizar el juego imprime cual fue tu puntaje /20
        //Si el puntaje es 15 o más, imprime: Tú si que sabes mucho
        //Si el puntaje es menor de 15 pero mayor o igual a 5, imprime: No lo has hecho mal
        //De lo contrario imprime: Buena suerte la próxima vez
        //Las opciones a, b, c y d de cada pregunta, deberán dejar en terminal un espacio de sangría, averigua como hacerlo en java
        //Preguntas:
        /* 1. ¿Quién fue la hacker que escribió en 1994 Hacking the Wetware?
                a. Ada Lovelace
                b. Jude Milhon
                c. Martha Ackelsberg
                d. Jane Jacobs

            2. ¿Quién es Fuencisla Clemares?
                a. La directora general de IBM Europa, Oriente Medio y África
                b. La vicepresidenta de Microsoft Western Europe
                c. La directora general de Google en España y Portugal
                d. Fundadora y CEO de Marsi Bionics

            3. ¿Quién fue Hedwig Eva Maria Kiesler, conocida como Hedy Lamarr?
                a. Primera programadora de software
                b. Una actriz de cine
                c. Inventora del procesador de datos
                d. Inventora del sistema de comunicaciones de salto de frecuencia, base del wifi, bluetooth y GPS

            4. ¿Cómo se llamaban las principales 'mujeres ocultas' de la NASA, encargadas de los cálculos para que la misión del Apolo 11 concluyera con éxito?
                a. Katherine Johnson, Dorothy Vaughan y Mary Jackson
                b. Jessica Miller, Emily Johnson, Sarah Davis
                c. bell hooks, Toni Morrison y Alice Walker
                d. Emmeline Pankhurst, Millicent Fawcett y Harriet Harman
        */

        //Respuestas: 1. b / 2. c / 3. b y d / 4. a

        byte points = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println(" 1. ¿Quién fue la hacker que escribió en 1994 Hacking the Wetware?\n" +
                "                a. Ada Lovelace\n" +
                "                b. Jude Milhon\n" +
                "                c. Martha Ackelsberg\n" +
                "                d. Jane Jacobs");
        String answerOne = scanner.nextLine();
        if ((answerOne.equalsIgnoreCase("b"))) {
            points += 5;
        }

        System.out.println("2. ¿Quién es Fuencisla Clemares?\n" +
                "                a. La directora general de IBM Europa, Oriente Medio y África\n" +
                "                b. La vicepresidenta de Microsoft Western Europe\n" +
                "                c. La directora general de Google en España y Portugal\n" +
                "                d. Fundadora y CEO de Marsi Bionics");
        String answerTwo = scanner.nextLine();
        if (answerTwo.equalsIgnoreCase("c")) {
            points += 5;
        }

        System.out.println(" 3. ¿Quién fue Hedwig Eva Maria Kiesler, conocida como Hedy Lamarr?\n" +
                "                a. Primera programadora de software\n" +
                "                b. Una actriz de cine\n" +
                "                c. Inventora del procesador de datos\n" +
                "                d. Inventora del sistema de comunicaciones de salto de frecuencia, base del wifi, bluetooth y GPS");
        String answerThree = scanner.nextLine();
        if ((answerThree.contains("b")) && (answerThree.contains("d"))) {
            points += 5;
        }

        System.out.println("  4. ¿Cómo se llamaban las principales 'mujeres ocultas' de la NASA, encargadas de los cálculos para que la misión del Apolo 11 concluyera con éxito?\n" +
                "                a. Katherine Johnson, Dorothy Vaughan y Mary Jackson\n" +
                "                b. Jessica Miller, Emily Johnson, Sarah Davis\n" +
                "                c. bell hooks, Toni Morrison y Alice Walker\n" +
                "                d. Emmeline Pankhurst, Millicent Fawcett y Harriet Harman");
        String answerFour = scanner.nextLine();
        if (answerFour.equalsIgnoreCase("a")){
            points += 5;
        }

        if (points >= 15) {
            System.out.println("Tú si que sabes mucho");
        } else if (points >= 5) {
            System.out.println("No lo has hecho mal");
        } else {
            System.out.println("Buena suerte la próxima vez");
        }

        scanner.close();
    }
}