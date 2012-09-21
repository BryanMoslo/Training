class ListaEnlazada{
  Nodo primero;

  public boolean estaVacia(){
    if(primero==null){
      return true;
    }else{
      return false;
    }
  }

  public int cantidadDeNodos(){
    int contador=0;
    Nodo temporal=primero;
    while(temporal!=null){
      contador++;
      temporal=primero.siguiente;
    }  
  return contador;
  }
}

class Nodo{
  
  String informacion;
  Nodo siguiente;    
}

public class PruebasDeLista{

  public static void main(String [] args){
    ListaEnlazada lista = new ListaEnlazada();
    System.out.println(lista.estaVacia());
        
  }
}
