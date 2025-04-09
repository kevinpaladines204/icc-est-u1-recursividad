public class EjerciciosRecursivos {
    
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
}
