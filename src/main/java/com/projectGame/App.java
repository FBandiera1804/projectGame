package com.projectGame;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner userInput = new Scanner(System.in);
        
        //Creazione del costruttore per le variabili di gioco.
        inizioGioco in = new inizioGioco();
        
        System.out.println("Inserisci il nome del tuo personaggio: ");
        in.setNomePersonaggio(userInput.nextLine());
        System.out.println("Quale arma vuoi che il tuo personaggio usi? ");
        in.setNomeArma(userInput.nextLine());
        
        
        
        System.out.println("Il nome del personaggio e'" + in.getNomePersonaggio());
        System.out.println("Hai scelto l'arma: " + in.getNomeArma() + "\n Vuoi iniziare quest'avventura? \n");
        
        System.out.println("1) Gioca! \n 2) Riavvia gioco. \n 3) Ritirati.");
        in.setSceltaN1(1);
        in.setSceltaN2(2);
        in.setSceltaN3(3);
        
        in.setSceltaSelezionata(userInput.nextInt());
    }
}
