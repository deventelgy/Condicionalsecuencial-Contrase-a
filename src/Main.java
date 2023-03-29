import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*
        16) Escribe una aplicación con un String que contenga una contraseña cualquiera.
        Después se te pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes
         ya no pedirá mas la contraseña y mostrara un mensaje diciendo «Enhorabuena».
        Piensa bien en la condición de salida (3 intentos y si acierta sale, aunque le queden intentos).
        * */

        String email="alin.javier@entelgy.com";
        String password="123a";
        int intentos = 3;

        boolean acierto =false;
        for(int i=1; i<=intentos && !acierto;i++){
                String email1 = JOptionPane.showInputDialog("Ingresar correo: "+"Intento N° "+i);
                String password1 = JOptionPane.showInputDialog("Ingresar contraseña: "+"Intento N° "+i);
                if((email1.equals(email)) && (password1.equals(password))){
                    System.out.println("Bienvenido a su INTRANET");
                    acierto=true;
                }
                else{
                    System.out.println("Error!. Vuelva intentar.");
                }
            }
        }
    }