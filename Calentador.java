
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

    /**
     * Constructor for objects of class Calentador
     */
    public Calentador()
    {
        // initialise instance variables
        temperatura=15;
        incremento=3;
    }
    
   public void calienta()
   {
       if(temperatura<=27)
       {
           temperatura= temperatura + incremento;
       }
   }
   
   public void enfria()
   {
       if(temperatura>=-9)
       {
           temperatura= temperatura - incremento;
       }
   }
   
   public int temperatura()
   {
       return temperatura;
   }
  
}
