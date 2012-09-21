import java.util.Scanner;

public class FormaCuadrada{

  public static void main(String args[]){
    
    Scanner scanner = new Scanner( System.in );
    System.out.println("Digite La Altura");
    
    Integer altura = scanner.nextInt();
    
    System.out.println("Digite El Ancho");
    Integer ancho = scanner.nextInt();
  
    for(int alturaIndex=0;alturaIndex<altura;alturaIndex++){
      for( int indiceAncho=0;indiceAncho<ancho;indiceAncho++ ) {
        System.out.print("*");  
      }  
      System.out.println("");
      
    }   

  }


}



