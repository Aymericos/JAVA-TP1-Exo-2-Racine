package exercice.pkg2.racine;
//c'est une classe d'exception qui gère quand les nombres sont négatifs
public class NegativeException extends Exception{
    public NegativeException ()
    {
        super ("error : negative number");
    }
    
    public NegativeException (double number)
    {
        super ("error : negative number" + number);
    }
}
