public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
    System.out.println();
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
    int digito= 125;
    System.out.println("El resultado de la suma de los digitos del numero "+digito+" es: " + s.sumaDigitos(digito) );
    System.out.println();


    System.out.println("----- EJERCICIO 4 -----");
    int n = 9;
    System.out.print("Números descendentes desde " + n + ": ");
    e.imprimirDescendente(n);
    System.out.println();

    System.out.println();
    System.out.println("----- EJERCICIO 5 -----");
    EjerciciosRecursivos r= new EjerciciosRecursivos();
    int numero = 1234;
    int resultadoRevertible= r.reverso(numero, 0);
    System.out.println("el reverso de :"+ numero + " es "+ resultadoRevertible);
    }
}




