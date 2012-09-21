import java.util.Scanner;

public class FormaDeI{

  public static void main(String args[]){
    
    Scanner scanner = new Scanner( System.in );
    System.out.println("Digite La Altura");
    
    Integer altura = scanner.nextInt();
    
    System.out.println("Digite El Ancho");
    Integer ancho = scanner.nextInt();
  
       
      
    for(int anchoIndex=0;anchoIndex<ancho;anchoIndex++){
      System.out.print("*");
    }
    System.out.println("");      
    
    int mitad = (int)Math.ceil(ancho / 2);
    
    for(int alturaIndex=0;alturaIndex<altura-2;alturaIndex++){
      for(int spacesIndex = 0; spacesIndex < mitad ; spacesIndex ++){ 
        System.out.print( " " );
      }
      System.out.println("*");      
    }

    for(int anchoIndex = 0; anchoIndex < ancho ; anchoIndex++){
    
      System.out.print("*");
    
    
    }

    System.out.println("");
 
 
  }
}
