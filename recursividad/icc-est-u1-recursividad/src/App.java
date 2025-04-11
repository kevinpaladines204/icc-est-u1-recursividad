public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
    EjerciciosRecursivos e= new EjerciciosRecursivos();
    System.out.println("----- EJERCICIO 1 -----");
    int fibo = e.fibonacci(5);
    System.out.println("el resultado de fibonacci es :" + fibo);
    int suma = e.sumaConsecutivos(fibo);
    System.out.println("el resultado de la suma de los numero de n es :"+ suma);
    System.out.println();

    System.out.println("----- EJERCICIO 2 -----");
    EjerciciosRecursivos p = new EjerciciosRecursivos();
    int base = 2;
    int exponente = 3;
    System.out.println(base + " elevado a " + exponente + " es: " + p.getPotencias(base, exponente));
    System.out.println();


    System.out.println("----- EJERCICIO 3 -----");
    EjerciciosRecursivos s= new EjerciciosRecursivos();
    int numero= 125;
    System.out.println("Resultado de la suma de los digitos:" + s.sumaDigitos(numero) );
    System.out.println();


    }
}




