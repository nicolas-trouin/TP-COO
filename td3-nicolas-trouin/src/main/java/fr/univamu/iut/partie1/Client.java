package fr.univamu.iut.partie1;

public class Client {
    public static void main(String[] args) {
        Expression expression = new NoeudInterne('+', new NoeudInterne('*',new Nombre(2), new Nombre(3)), new Nombre(5));
        System.out.println(expression.calculerValeur());

        Traducteur traducteur = new Traducteur("fr", expression);

        System.out.println(traducteur.getTraduction());
    }
}
