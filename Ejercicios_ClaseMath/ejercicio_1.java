package ClaseMath;

import java.io.IOException;
import java.util.Scanner;

public class ejercicio_1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
            //double num = Math.sqrt(129);
          
		 System.out.println("Elige una opcion\n1.raizcuadra\n2.potencia\n3.redondear\n");
            Scanner op = new Scanner(System.in);
            
            int num = op.nextInt();
            
            
            while(num <4) {
            	  System.out.println("Dijita un numero : ");
            	  
            	  Scanner numero = new Scanner(System.in);
            	  double numero_t = numero.nextFloat();
            	 
            	 switch(num) {
            	 case 1:
            		   System.out.println("La raiz cuadrada es : " +Math.sqrt(numero_t));
            		   
            		 break;
            		 
            	 case 2:
            		 System.out.println("Ingresa el numero de la potencia : ");
            		 Scanner poten = new Scanner(System.in);
            		 int potencia = poten.nextInt();
            		 
          		   System.out.println("La potencia   es : " +Math.pow(potencia,numero_t));
          		  
          		  break;
          		  
            	 case 3:
          		   System.out.println("el numero  redondeado es : " +Math.round(numero_t));
          		 
          		 break;
            	 }
            }
            
            
            
            //System.out.println(Math.round(num));
	}

}
