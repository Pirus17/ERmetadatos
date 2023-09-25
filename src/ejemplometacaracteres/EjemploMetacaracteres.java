/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplometacaracteres;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Piruxb17
 */
public class EjemploMetacaracteres {

    public static void main(String[] args) {
        //EJEMPLO *
        String regex = "a*t";
        String texto = "ct cat caat";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        while (matcher.find()) {
            System.out.println("Coincidencia encontrada: " + matcher.group());
        }
        //EJEMPLO +
        /*String regex = "[0-9]+";
        String texto = "Los números son 123, 42 y 7.";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        while (matcher.find()) {
            System.out.println("Número encontrado: " + matcher.group());
        }*/
        //EJEMPLO ()
        /*
        String regex = "(\\d{2})/(\\d{2})/(\\d{4})"; // Aquí usamos paréntesis para agrupar día, mes y año.
        String texto = "Hoy es 25/09/2023 y mañana será 26/09/2023.";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        while (matcher.find()) {
            String fechaCompleta = matcher.group(); // Obtenemos la fecha completa.
            String dia = matcher.group(1); // Obtenemos el día.
            String mes = matcher.group(2); // Obtenemos el mes.
            String año = matcher.group(3); // Obtenemos el año.

            System.out.println("Fecha encontrada: " + fechaCompleta);
            System.out.println("Día: " + dia);
            System.out.println("Mes: " + mes);
            System.out.println("Año: " + año);
        }
        */
    }

}
