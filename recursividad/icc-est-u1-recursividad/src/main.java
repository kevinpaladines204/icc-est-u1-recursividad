public class main {
    public static void main(String[] args) {
    int n=5;
    int resultadoFinal= factorial(n);
    System.out.println("resultado: "+ resultadoFinal);
    }
    public static int factorial(int n){
        if( n == 0 ){
            System.out.println("Alcanze el caso base");
            return 1;
        } 
        int resultado= n * factorial(n-1);
        System.out.println("Calculando factorial de: " + n + " * factorias("+ (n - 1)+")"+"=" + resultado);

        return resultado;
    }
}
