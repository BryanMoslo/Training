class ListaEnlazada{
  Nodo primero;

  public boolean estaVacia(){
    if(primero==null){
      return true;
    }else{
      return false;
    }
  }

  public void agregarNodo(int informacion){
    Nodo nuevo = new Nodo(informacion);
    if(estaVacia()){
      primero = nuevo;
    }else{
      Nodo ultimo = ultimo();
      ultimo.siguiente = nuevo;
    }
    
  } 
  public int cantidadDeNodos(){
    int contador=0;
    Nodo temporal=primero;
    while(temporal!=null){
      contador++;
      temporal=temporal.siguiente;
    }  
    return contador;
  }
  
  public Nodo primero(){
    return primero;
  
  } 
  
  public Nodo ultimo(){
    Nodo temporal=primero;
    if(temporal==null){
      return null;
    }else{
      while(temporal.siguiente!=null){
        temporal=temporal.siguiente;
      }
      return temporal;  
    }
  }

  public Nodo buscarNodo(int indice){
    int contador= 0;
    Nodo temporal = primero;
    Nodo resultado = null;
    while(temporal!=null){
      if(indice==contador){
        resultado = temporal;
      }
      temporal = temporal.siguiente;
      contador++;
    }  
    return resultado;
  }
  
  public Nodo nodoCentral(){
    Nodo resultado=null;
    if(cantidadDeNodos() == 0){
      return resultado;
    }else{
      if(cantidadDeNodos() % 2 == 0){
        
      }else{
        int cantidadDeNodos = cantidadDeNodos();
        Double mitad =  Math.ceil(cantidadDeNodos/2);         
        resultado = buscarNodo(mitad.intValue());
           
      }
    }
    return resultado;

  }

  public ListaEnlazada repetidos(){
    ListaEnlazada listaDeRepetidos = new ListaEnlazada();
    
    for(int i=0; i< cantidadDeNodos(); i++){
      int valorAComparar = buscarNodo(i).informacion;
      for(int j=0; j< cantidadDeNodos(); j++){    
        if(i != j && valorAComparar == buscarNodo(j).informacion ){
          listaDeRepetidos.agregarNodo(valorAComparar);
        }         
      }
    }
    return listaDeRepetidos; 
  }


  public int sumadorDeNodos(){
    int resultado = 0;
    Nodo temporal = primero;
    while(temporal!=null){
      resultado+= temporal.informacion;
      temporal = temporal.siguiente;
    }
    return resultado;
  }

  
  public int indiceDeUnValor(int datoABuscar){
    int result = -1;
    for(int indice=0; indice< cantidadDeNodos(); indice++){
      if( datoABuscar == buscarNodo(indice).informacion){
        result = indice;
        break;
      }
    }
    
    return result;
  }
  
  public boolean contiene(int valorABuscar){
   boolean noEsta = indiceDeUnValor(valorABuscar) == -1;
   return !noEsta;
  }
  
  
  public ListaEnlazada invertirLista(){
    ListaEnlazada listaInvertida = new ListaEnlazada();
    for(int i=cantidadDeNodos()-1; i >= 0;i--){
      Nodo encontrado = buscarNodo(i);
      listaInvertida.agregarNodo(encontrado.informacion);
    }
    
    return listaInvertida;
  }
  
  
  public String toString(){
    Nodo temporal = primero;
    String result = "[";
    while( temporal != null){
      result += temporal.informacion;
      temporal = temporal.siguiente;
      if( temporal != null ){
        result += ", ";
      }
    }
    
    result += "]";
    return result;    
  }



}
  


class Nodo{
  
  int informacion;
  Nodo siguiente;
 
  public Nodo(int informacion){
    this.informacion = informacion;
  }    
}

public class PruebasDeLista{

  public static void main(String [] args){
    ListaEnlazada lista = new ListaEnlazada();

    lista.agregarNodo(1);
    if(lista.cantidadDeNodos()==1) System.out.println("Tamaño correcto");
    lista.agregarNodo(2);
    if(lista.cantidadDeNodos()==2) System.out.println("Tamaño correcto");
    
    
    lista.agregarNodo(3);
    System.out.println( lista.nodoCentral().informacion ); 
    if(lista.nodoCentral().informacion == 2 ) System.out.println("Central Correcto");
    lista.agregarNodo(4); 
    lista.agregarNodo(5); 
    if(lista.nodoCentral().informacion == 5 ) System.out.println("Central correcto");
    System.out.println(lista.sumadorDeNodos());
    System.out.println(lista);
    System.out.println(lista.invertirLista() );
    lista.agregarNodo(4);
    System.out.println(lista.repetidos() );
    System.out.println( lista.indiceDeUnValor(3));
    System.out.println( lista.contiene(6));
  
  }
  
}
