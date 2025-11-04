package Activities;
import java.util.Scanner;
import java.lang.Math;
/**
 * Actividad de grupo: Utilizando las funciones de String, vas a diseñar el
 * juego del ahorcado. De un array de palabras vas a coger una al azar y se
 * creará el vector con * de la longitud para que cuando el usuario acierte
 * una letra se vaya sustituyendo hasta que o bien la palabra se puede leer
 * (ganas) o acaba el juego si fallas 7 veces (pierdes)
 */



/**
 * Necesitamos
 * 
 * - Lista de palabras
 * - Contador de aciertos / fallas
 * - que el programa eliga la palabra al azar
 * - CRISTOPHER (DIBUJA AL CACHACIO AHOGADO)
 * - Usuario inserte datos
 * - Que el programa lea letra por letra la palabra elegida
 * - Acaba el juego cuando hay 7 fallas
 */
public class Activity7 {
    
    static String[] palabras ={"domingo","perro","mamon","gato","aurora","rocio"};

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int falladas=0;|


        System.out.println("Di una letra");


        // Programa elige azar
        String palabraAleatoria = palabras[(int) (Math.random()* palabras.lenght)];
        String[] vector;
        for(int i = 0; i < palabraAleatoria.lenght; i++) {
            vector[i] = "*";
        } 
        // Pedir datos
        do{
            falla
        }while(falladas!=7)
        // verificar acerto o fallo
         for (int i = 0; i < palabraAleatoria.length(); i++) {
                if (palabraAleatoria.charAt(i) == letra) {
                    palabraOculta[i] = letra;
                    letraAcertada = true;
                }
            }

            if (letraAcertada) {
                System.out.println("¡Bien hecho! La letra está en la palabra.");
            } else {
                fallos++;
                System.out.println("Letra incorrecta. Te quedan " + (7 - fallos) + " intentos.");
            }
        // Validar datos
        // ACABAR JUEGO / CONTINUAR


        int usuario;|
    
        
    
    }

    static void printGame()
    {
        
    }
    
}
