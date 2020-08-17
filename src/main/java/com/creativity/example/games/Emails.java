package com.creativity.example.games;

import java.util.ArrayList;
import java.util.List;

/**Clase de correos electrónicos: ejemplo de prueba unitaria.
 * Encapsula algún texto con direcciones de correo electrónico.
 * getUsers () devuelve una lista de los nombres de usuario del texto.
 */
public class Emails {

    private String text;

    public Emails(String text){
        this.text=text;
    }

    //Devuelve una lista de los nombres de usuario que se encuentran en el texto.
    // Diremos que un nombre de usuario es una o más letras, dígitos,
    // o puntos a la izquierda de @.
    public List<String> getUsers(){
        int pos = 0;
        List<String> users = new ArrayList<>();
        //hansel.hir@gmail.com  pos --> 11
        while (true){
            int at = text.indexOf('@',pos);
            if (at == -1)
                break;
            //Mira hacia atrás desde
            int back = at - 1;
            while(back >= 0 && (Character.isLetterOrDigit(text.charAt(back)) || text.charAt(back)=='.')){
                back--;
            }
            //Ahora de atrás es antes del inicio del nombre de usuario
            String user = text.substring(back + 1, at);
            if (user.length() > 0)
                users.add(user);
            // Posición avanzada para la próxima vez
            pos = at + 1;
        }
        return users;
    }
}
