package nl.novi.jp.methods.junior;

import java.util.Locale;

/**
 * Deze klasse is helemaal leeg, je mag nu dus alles zelf doen.
 * Maak een methode die een String ontvangt en deze in HOOFDLETTERS uitprint.
 * Bedenk zelf een goede Engelse naam voor de methode.
 *
 * Hoe maak je hoofdletters van een String in Java?
 * https://duckduckgo.com/?q=java+to+uppercase
 */

public class JuniorFive {

    public static void main(String[] args) {
        printToUppercase("hello, world!");
    }

    public static void printToUppercase(String text) {
        System.out.println(text.toUpperCase());
    }
}
