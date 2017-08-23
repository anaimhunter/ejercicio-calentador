
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

    /**
     * Constructor for objects of class Calentador
     */
    public Calentador()
    {
        // initialise instance variables
        temperatura=15;
    }
    
   public void calienta()
   {
       temperatura= temperatura + 5;
   }
   
   public void enfria()
   {
       temperatura= temperatura - 5;
   }
   
   public int temperatura()
   {
       return temperatura;
   }
  
}
