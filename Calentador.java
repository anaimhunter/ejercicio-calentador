
/**
 * Write a description of class Calentador here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calentador
{
    // instance variables 
    private int temperatura;
    private int incremento;
    private int min;
    private int max;

    /**
     * Constructor for objects of class Calentador
     */
    public Calentador(int maxI, int minI)
    {
        // initialise instance variables
        temperatura=15;
        incremento=3;
        max=maxI;
        min=minI;
    }
    
   public void calienta()
   {
       if((temperatura+incremento)<max)
       {
           temperatura= temperatura + incremento;
       }
   }
   
   public void enfria()
   {
       if((temperatura-incremento)>min)
       {
           temperatura= temperatura - incremento;
       }
   }
   
   public int temperatura()
   {
       return temperatura;
   }
   
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
