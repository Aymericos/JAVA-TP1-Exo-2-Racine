/*
Rendu TP1 exercie 2 
Aymeric FROHLICHER
04/02/19
*/
package exercice.pkg2.racine;
public class Exercice2Racine {
    public static void main(String[] args) {
        Racine extracteur = new Racine(0.01);
        //Vérifier les exceptions quand le nombre est négatif
        try
        {
            double operande= (Double.valueOf(args[0])).doubleValue();
            if(operande < 0)
            {
                throw new NegativeException(operande);
            }
            double valeurRacine;
            valeurRacine=extracteur.racine(operande);
            System.out.println(valeurRacine);
            System.out.println("precision "+extracteur.getPrecision() + " , erreur =" +
            (valeurRacine-Math.sqrt(operande)));
            extracteur.setPrecision(0.00001);
            valeurRacine=extracteur.racine(operande);
            System.out.println(valeurRacine);
            System.out.println("precision "+extracteur.getPrecision() + " , erreur =" +
            (valeurRacine-Math.sqrt(operande)));
        }
        catch(NegativeException e)
        {
            System.out.println("Valeur negative");
        }
        

    }
    
}
