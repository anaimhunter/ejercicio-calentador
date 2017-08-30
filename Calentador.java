
/**
 * La clase calentador representa un objeto que tiene temperatura
 */
public class Calentador
{
    // instance variables 
    private int temperatura;
    private int incremento;
    private int min;
    private int max;

    /**
     * Constructor de clase calentador
     * @param maxI Parametro que representa la temperatura maxima 
     * @param minI Parametro que representa la tempratura minima
     */
    public Calentador(int maxI, int minI)
    {
        // initialise instance variables
        temperatura=15;
        incremento=3;
        max=maxI;
        min=minI;
    }
    
    /**
     * Eleva la temperatura del calentador 
     */
   public void calienta()
   {
       if((temperatura+incremento)<max)
       {
           temperatura= temperatura + incremento;
       }
   }
   
   /**
    * Disminuye la temperatura
    */
   public void enfria()
   {
       if((temperatura-incremento)>min)
       {
           temperatura= temperatura - incremento;
       }
   }
   
   /**
    * Da la temperatura
    * @return Regresa la temperatura del calentador
    */
   public int temperatura()
   {
       return temperatura;
   }
   
   /**
    * Modifica el incremento
    * @param nuevoIncremento Parametro que representa el nuevo incremento
    */
   public void modificarIncremento(int nuevoIncremento)
   {
       if(nuevoIncremento<0)
       {
           incremento=Math.abs(nuevoIncremento);
       }
       else
       {
           incremento=nuevoIncremento;
       }
   }
  
}
