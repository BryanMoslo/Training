import java.util.Scanner;

public class FormaDeL{

  public static void main(String args[]){
    
    Scanner scanner = new Scanner( System.in );
    System.out.println("Digite La Altura");
    
    Integer altura = scanner.nextInt();
    
    System.out.println("Digite El Ancho");
    Integer ancho = scanner.nextInt();
  
    for(int alturaIndex=0;alturaIndex<altura-1;alturaIndex++){
      
      System.out.println("*");
    }
    String lineaHorizontal="";
    for(int anchoIndex=0;anchoIndex<ancho;anchoIndex++){
    
      lineaHorizontal+="*";
      
    }
  
    System.out.println(lineaHorizontal);  
  } 



}






