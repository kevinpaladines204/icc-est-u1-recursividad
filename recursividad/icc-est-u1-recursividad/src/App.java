public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        EjerciciosRecursivos e= new EjerciciosRecursivos(); 
    System.out.println();
    int fibo = e.fibonacci(5);
    System.out.println("el resultado de fibonacci es :" + fibo);
    System.out.println();

    int suma = e.sumaConsecutivos(fibo);
    System.out.println("el resultado de la suma de los numero de n es :"+ suma);
    System.out.println();
    }
}
