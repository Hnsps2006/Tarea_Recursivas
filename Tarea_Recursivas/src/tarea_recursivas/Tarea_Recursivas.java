/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea_recursivas;

/**
 *
 * @author eliza
 */
public class Tarea_Recursivas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //primera función recursiva este código es una recursiva
        //hacemos un llamado del método potencia, el cual como su nombre lo dice es un código par saber la potencia de cualquier numero
        //le damos valores enduro 4 que es la base y 3 el exponente entonces quedaría algo como = 4^3.
        int resultado = potencia(4, 3);
        //como hicimos el llamado del método, ya lo podemos imprimir el resultado
        System.out.println("El resultado es: " + resultado);
        //salto de linea para diferenciar la recursiva número dos
        System.out.println("\n\n");
        //ingresar número de la serie de Fibonacci y llammamos el método en el main
        int Fibonacci2 = Fibonacci(4);
        //lo ejecutamos en consola el resultado
        System.out.println("El resultado es: "+Fibonacci2);
        //salto de linea
        System.out.println("\n\n");
        //llamado para la multiplicación entre 7 por 8
        int multiplicacion2 = multiplicacion(7,8);
        System.out.println(""+multiplicacion2);
        //salto de linea
        System.out.println("\n\n");
        //llamado de la calculadora dividiendo
        int calculadoradividiendo2 = calculadoradividiendo(6,2);
        //resultado final de la división
        System.out.println("El resultado de la división es: "+calculadoradividiendo2);
        //salto de linea
        System.out.println("\n\n");
        int[] lista = {1, 2, 3, 4, 5}; // Array de ejemplo
        //imprimimos los elementos de la lista y el índice donde deseamos iniciar
        imprimirElementos(lista, 0); 
        //salto de linea
        System.out.println("\n\n");
        // Llamada a la función sumarElementos con el índice inicial 0
        int[] lista2 = {1, 2, 3, 4, 5};
        //llamado del método sumarElementos
        int resultado2 = sumarElementos(lista2, 0); 
        //el resultado de la suma de los elementos del array
        System.out.println("La suma de los elementos del array es: " + resultado2);
        //salto de linea
        System.out.println("\n\n");
        //lista de numeros para verificar cual es el más grande
        int[] listanumeros = {11, 222, 9, 24, 5};
        //llamado del número mayor
        int Numeromayor2 = Numeromayor(listanumeros, 0);
        //ejecutamos el número mayor
        System.out.println(""+Numeromayor2);
        //salto de linea
        System.out.println("\n\n");
        //creamos una lista de matriz para poder generarla dentro de una recursiva y poder decir de donde comenzar o de donde terminar 
        //la lista
        int[][] listamatriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        //llamado y ejecución, de la lista de la matriz dentro comenzaremos desde fila 0 y columna 0
        tamañoyorden_matriz(listamatriz,0, 0);
        System.out.println("\n\n");
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int obtenerElemento2 = obtenerElemento(matriz,0,0);
        System.out.println(""+obtenerElemento2);
        
        int[][] matriz2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Llamar al método sumarNumerosPares y almacenar el resultado
        int resultado3 = sumarNumerosPares(matriz2, 0, 0);

        // Imprimir el resultado
        System.out.println("La suma de los números pares en la matriz es: " + resultado3);
    }
    
    //como parametros le asignamos la base y el exponente que desamos
    public static int potencia(int base, int exponente){ 
        //hacemos una condición de que si es 0 entonces le regresamos al usuario o el programa regresa 1 porque bueno esto es porque si hacemos 0^1 es igual a 1 no es igual a 0
        if (exponente == 0) 
          return 1;
        else //en caso de que el exponente no sea 0 entonces hacemos la fórmula
            //hacemos un return de la multiplicación de la base por la potencia que sería 4x4 tres veces porque 3 es el exponente
            //si nos fijamos nombramos otra vez, el método dentro del método eso es para la recursiva y restamos el exponente para que la recursiva
            //no se repita
          return base * potencia(base, exponente - 1);         
    }
    
    public static int Fibonacci(int indice_fibonacci){ 
        //Si indice_fibonacci es igual a 0 o 1, la función devuelve 1. Esto se debe a que los primeros dos términos de la Serie de Fibonacci son 1 y 1.
        if (indice_fibonacci == 0 || indice_fibonacci == 1) 
            //devuelve 1 si es 0 o 1, esto se debe que los dos primeros términos son 1 y1 
            return 1;
        else 
            //Si no se cumple la condición base, la función se llama a sí mismas dos veces.
            //una vez con el argumento indice_fibonacci -1 
            //otra vez con el argumento indice_fibonacci -2
            return Fibonacci(indice_fibonacci - 1) + Fibonacci(indice_fibonacci - 2);     
        /* indice ejemplo: 5
        Después de que se hayan resuelto todas las llamadas recursivas y se hayan alcanzado los casos base, se suman los resultados para obtener el resultado final:
        Fibonacci(2) = Fibonacci(1) + Fibonacci(0) = 1 + 1 = 2.
        Fibonacci(3) = Fibonacci(2) + Fibonacci(1) = 2 + 1 = 3.
        Fibonacci(4) = Fibonacci(3) + Fibonacci(2) = 3 + 2 = 5.
        */
    }
    
    //realizaremos una multiplicación por lo cual ocuparemos dos parámetros el numero multiplicado y las veces en este caso son 7 y 8
    public static int multiplicacion(int multiplicando, int veces){
        //entramos al método y vemos que hay una condición si es multiplicacion es igual a 1 entonces hacemos un return de veces pero vemos que multiplicacion es 7.
        if (multiplicando == 1) 
            //regresamos al main.
            return veces;  
        else
            //aquí comenzamos la recursiva las veces es 7 entonces el 7 se suma otra ve con el 7 pero cada vez que se suma el 8 es restado por 1
            //entonces el 7 se suma 8 veces 7+7+7+7+7+7+7+7 que es igual a 56 y multiplicación se vuelve cero por lo cual, no vuelve entrar a está condición
            return veces + multiplicacion(veces, multiplicando - 1);
    }
    
    //lo llamamos calculadoradividiendo porque es un código para dividir fracciones
    public static int calculadoradividiendo(int dividendo, int divisor){
        //la condición entrara solo si el dividendo es menor que el divisor el divisor es 2 entonces va entrar hasta que el 6 que es el dividendo se halla
        //dividido lo máximo possible.
        if (dividendo < divisor) { 
            //imprimiremos el dividendo
            System.out.println(dividendo);//aquí imprimira el residuo
            //retornaremos 0 porque cuando esta por completo divido se retorna 0
            return 0; 
        }else
            //recursiva retornaremos 1 y lo sumaremos hasta que ya no se pueda dividir más
            return 1 + calculadoradividiendo(dividendo - divisor, divisor);
        /*
            1 + 6-2,2
            2 + 4-2,2   
            3 + 2-2,2
            imprimira 3 y el residuo es 0
        */
    }
    
    //Imprimir elementos porque literalmente solo estamos imprimiendo lo que esta dentro del arreglo
    //array sería la lista y el indice que es 0 es de donde
    public static void imprimirElementos(int[] array, int indice) {
        //array es la lista completa de los elementos entonces usamos el ,length para medir el tamaño y ponemos el equals para saber cuando para
        //al ser equal nos damos cuenta que el tamaño índice que se sumo es igual al tamaño del array.
        if (indice == array.length - 1)
            //imprimimos la lista con el último índice, para imprimir lo último de la lista obtenida.
            System.out.println(array[indice]); 
        else {
            //imprimimos la lista en ciclo
            System.out.println(array[indice]);
            //hacemos la suma del índice que es 0 y lo sumamos para que el índice cambie de valor y además si hubieramos empezado 
            //por ejemplo en el índice 1 no hubiera salido la lista completa ya que empieza a contar desde 0
            imprimirElementos(array, indice + 1);
        }
    }
    
    //pr[acticamente solo suma lo que esta adentro del arraylist, similar a la anterior recursiva
    public static int sumarElementos(int[] lista2, int indice) { 
        //inicializamos nuevamente el índice en 0 para que sume todo lo de la lista del arraydeElementos, si cambiamos el índice cambiamos el orden de suma 
    //primera condición que se cumplira si y solo si indice es igual al tamaño de la array list
    if (indice == lista2.length - 1)
        //retornara la suma total del array
        return lista2[indice];
    else
        //aquí comienza la recursividad donde el acedera a cada posicion del array y se sumará hasta que ya no se cumple la condición 
        //ya que el índice es ' y se suma 1, es inevitable que el índice va llegar tener el mismo valor que el tamaño del array
        //y ahí acabará la recursiva.
        return lista2[indice] + sumarElementos(lista2, indice + 1);
    }
    
    //lo llamamos el método numero mayor porque lo que hace el código es recorrer la lista hasta encontrar el número mayor de la misma lista
    //la lista numeros es la lista de los número
    public static int Numeromayor(int [] listanumeros, int tamañorecorrido){
        //declaramos mayor como valor vacío para luego poder declarlo como el mayor.
        //declaramos para devolver el valor cuando ya se compleot la verificación por que el indice es igual al tamaño de la lista
        int mayor;if (tamañorecorrido == listanumeros.length -1) return listanumeros[tamañorecorrido];
        //este código primero declara al mayor como una posición adelatne que listanumeros[tamañorecorrido] en caso de que listanumeros[tamañorecorrido] sea mayor
        //que mayor entonces retornara el valor de esa listanumeros[tamañorecorrido] pero solo si es mayor entonces este código solo compara primera posición con segunda 
        //posición y así consecutivamente hasta que se acabe el tamaño del array y que sea igual al indice
        else { mayor = Numeromayor(listanumeros, tamañorecorrido+1) ; if (listanumeros[tamañorecorrido] > mayor) return listanumeros[tamañorecorrido];
        //validación de que si Numeromayor nunca llego a ser más grande que mayor entonces retorna mayor en ves de retornar listanumeros[tamañorecorrido].
        else return mayor; }
    }
    
    //tamaño porque podemos modificar tanto el tamaño como el orden gracias a que podemos elimianr y quitar filas o columnas
    public static void tamañoyorden_matriz(int listamatriz[][], int fila, int columna){ 
        //es igual a listamatriz[0].length - 1. Si es así, significa que estamos en la última fila y columna de la matriz.
        //En ese caso, imprime el elemento en la posición (fila, columna) y termina la recursión.
        if(fila == listamatriz.length - 1 && columna == listamatriz[0].length -1)            
            System.out.print(listamatriz[fila][columna] +"");
        //Si la condición anterior no se cumple pero columna es igual a listamatriz[0].length - 1, significa que estamos en la última columna de una fila.
        //Imprime el elemento en la posición (fila, columna) y luego realiza una llamada recursiva con fila + 1 (para pasar a la siguiente fila) y 0 como 
        //la nueva columna (para comenzar desde la primera columna de la siguiente fila).
        else { if (columna == listamatriz[0].length-1) { System.out.println(listamatriz[fila][columna]);
        tamañoyorden_matriz(listamatriz, fila + 1, 0); }
        //sino cumple todo lo contrario significa que estamos en una posición de la matriz que no es ni la última fila ni la última columna.
        //Imprime el elemento en la posición (fila, columna) con un espacio y luego realiza una llamada recursiva con los mismos índices de fila y columna,
       //se suma o aumenta columna +1
        else { System.out.print(listamatriz[fila][columna]+"  ");
        tamañoyorden_matriz(listamatriz, fila, columna+1); } } }
    
       public static int obtenerElemento(int[][] matriz, int fila, int columna) {
            if (fila == matriz.length - 1 && columna == matriz[0].length - 1) {
                // Si estamos en la última fila y columna, devolvemos el elemento en esa posición
                return matriz[fila][columna];
            } else if (columna == matriz[0].length - 1) {
                // Si estamos en la última columna de una fila, sumamos el elemento actual con el siguiente de la siguiente fila
                return matriz[fila][columna] + obtenerElemento(matriz, fila + 1, 0);
            } else {
                // Si no estamos en la última fila ni en la última columna, sumamos el elemento actual con el siguiente de la misma fila
                return matriz[fila][columna] + obtenerElemento(matriz, fila, columna + 1);
            }
        }

        public static int sumarNumerosPares(int[][] matriz2, int fila, int columna) {
            // Verifica si estamos en la última fila y columna
            if (fila == matriz2.length - 1 && columna == matriz2[0].length - 1) {
                // Devuelve el elemento en esa posición si es par, de lo contrario devuelve 0
                return matriz2[fila][columna] % 2 == 0 ? matriz2[fila][columna] : 0;
            } else {
                // Verifica si estamos en la última columna de una fila
                if (columna == matriz2[0].length - 1) {
                    // Suma el elemento actual si es par, de lo contrario suma 0, y llama recursivamente a la siguiente fila
                    return (matriz2[fila][columna] % 2 == 0 ? matriz2[fila][columna] : 0) + sumarNumerosPares(matriz2, fila + 1, 0);
                } else {
                    // Suma el elemento actual si es par, de lo contrario suma 0, y llama recursivamente a la siguiente columna
                    return (matriz2[fila][columna] % 2 == 0 ? matriz2[fila][columna] : 0) + sumarNumerosPares(matriz2, fila, columna + 1);
                }
            }
        }
}
