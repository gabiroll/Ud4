package ud4;

public class Ud5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaramos las variables
		int A = 1, B = 2, C = 3, D = 4, D1;
		
		//Realizamos las operaciones
        System.out.println("Valores iniciales");                                                                  
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);
        D1 = B;
        B = C;
        C = A;
        A = D;
        D = D1;
        System.out.println("Valores finales");
        System.out.println("B toma el valor de C -> B = " + B);
        System.out.println("C toma el valor de A -> C = " + C);
        System.out.println("A toma el valor de D -> A = " + A);
        System.out.println("D toma el valor de B -> D = " + D);                                                   
    }
}