public class EjerciciosRecursivos {
    //EJERCICIO 1- SUMA DE NUMEROS ENTRE CONSECUTIVOS

    public  int fibonacci (int n){
        if(n == 0){
            return 0;
        }else if (n == 1){
            return 1;
        }
        return fibonacci(n-1)+ fibonacci(n- 2);
    }

    // metodo que devuelve la suma de los numeros que contiene n
    //n = 5,  5+4+3+2+1=15
    public int sumaConsecutivos(int n){

        //if (n == 1)return 1;
        // return n+ sumaConsecutivos(n-1);
        if(n == 1){
            return 1;
        }
        int resultadoParcial = sumaConsecutivos(n-1);
        int resultado = n+ resultadoParcial;
        return resultado;
    }

    // EJERCICIO 2- POTENCIA DE UN NUMERO

    //escribe una funcion recursiva que calcule la potencia de un numero base
    //elevado a un exponente entero exponente.por ejemplo , si base = 2 
    //y exponente = 3, la funcion debe devolver 8
    public int getPotencias(int base, int exponente){
        if(exponente == 0){
            return 1;
        }
        if(exponente > 0){
            return base * getPotencias(base, exponente - 1);
        }else{
            return 1/ base * getPotencias(base, -exponente);
        }

    }

    // EJERCICIO 3- SUMA DE DIGITOS DE UN NUMERO
    
    //si el numero es menor que 10, lo cual significa que solo tiene un digito,
    //se devuelve el mismo numero. en caso contrario, se extrae el ultimo digito
    //utilizando el operador modulo % y se calcula los digitos menos el ultimo
    //utilizando la division entera /10, luego se realiza una llamada recursiva 
    //a sumaDigitos con el resto y se suma el ultimo digito.
    
    public int sumaDigitos(int numero){
        if(numero < 10){
            return numero;
        }else{
            int ultimodigito = numero % 10;
            int resto = numero / 10;
            return ultimodigito + sumaDigitos(resto);
        }
    }

    // EJERCICIO 4

    //escribe un metodo recursivo que imprima los numeros desde n hasta 1 
    //de forma descendente, separados por espacios}
    
    public void imprimirDescendente(int n) {
        if (n < 1) {
            return;
        }
        System.out.print(n + " ");
        imprimirDescendente(n - 1);
    }
    
    // EJERCICIO 5

    // crea una funcion recursiva llamada reverso que reciba un numero entero
    //positivo n y devuelva su numero invertido.Ejemplo:
    // si recibe 1234 la funcion debe devolver 4321

    public int reverso(int n, int resultado) {
        if (n == 0) {
            return resultado;
        }else{
            int digito = n % 10;
            resultado = resultado * 10 + digito;
            return reverso(n/10, resultado);
        }
    }
}

