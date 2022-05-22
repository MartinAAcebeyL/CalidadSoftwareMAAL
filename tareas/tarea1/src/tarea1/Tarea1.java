package tarea1;

public class Tarea1 {

    static int fibonacci(int n) {
        if (n > 1) {
            return fibonacci(n - 1) + fibonacci(n - 2);  
        } else if (n == 1) {  
            return 1;
        } else if (n == 0) {  
            return 0;
        } else { //error
            System.out.println("Debes ingresar un tamaño mayor o igual a 1");
            return -1;
        }
    }


    public static void main(String[] args) {
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(7));
    }

}
