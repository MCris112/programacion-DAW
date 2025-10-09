# Repositorio de actividades

## Estrucutra

### Proyecto
La estrucutra del folder ``src/`` es la siguiente

```
src/
    Utilities/
        MC.java // Un helper para poder imprimir en pantalla
        Table.java //Helper para poder imprimir en pantalla una tabla
        TableRow.kava //Uso directo en Table.java para imprimir filas
    ....java
```

### Actividades

Las actividades están separadas como:
```
Activity[numero][titulo].java
    
    -Activity // nombre general
    [numero] // Orden en las que se muestran las actividades
    [titulo] //Acerca de que seccion del pdf trata
```

esto se cumple en la mayoria de archivos, ya que en as 2 primeras actividades no lo habia pensado de esa forma

## ¿Como ejecutar?
Dentro del archivo cada funcion tiene su comentario referido, por ejemplo:

```java
/**
* Actividad 6
* Desarrolla un programa que simule una calculadora
* según la opción introducida y que pida los
* operandos hasta que introduces -1
*/
static void calculadora() {
    //....
}
```

por lo que en el main de cada clase, para poder usar el programa de cada actividad, hay que descomentar segun lo que se quiera correr. *por ejemplo:*

```java
public class Activity3Bucles {

    static Scanner sc = new Scanner(System.in);

    public static void main() {

        //isMultiplo();

        // calFactorial();

//        maxMinYearsOld();

        calcSumStudents(); // Descomentado para el uso del programa

        //aleatorioGame();

        //calculadora();

        //algoritmosMDCMCM();
    }
    
    //.....
}
```

### Modo clase

Luego pensé en que deberia organizarlo mejor para poder mantener x funcion dentro de otra funcion, por lo que lo coloque dentro de sub clases, ya que recorde cuando estube programando java para android, que podia colocar una clase dentro de otra clase para poder crear ciertos widgets que las interfaces pedia.

Esto aplica apartir de la *Activity5*
```java
public class Activity5Functions {

    static Scanner sc = new Scanner(System.in);

    public static void main() {
        //ActivityTwo.run();

        ActivityThree.run(); //Descomentar para usar
    }
    
    /**
     * Crea un procedimiento para calcular el área y volumen
     * de un cilindro (2*PI*(altura+radio), PI*radio2*altura
     */
    static class ActivityTwo {
        static void run() {

        }
        
        // sub funciones
    }
    
    // otras clases
}
```

Cada una de estas nuevas clases tiene la clase estatica ``.run()`` que es lo que hace que el programa corra