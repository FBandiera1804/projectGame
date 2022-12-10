package com.projectGame;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner userInput = new Scanner(System.in);
        
        //Creazione del costruttore per le variabili di gioco.
        inizioGioco in = new inizioGioco();
        
        System.out.println("Vuoi iniziare quest'avventura? \n");
        System.out.println("1) Gioca! \n 2) Riavvia gioco. \n 3) Ritirati.");
        in.setSceltaN1(1);
        in.setSceltaN2(2);
        in.setSceltaN3(3);
        in.setSceltaSelezionata(userInput.nextInt());
        
        switch(in.getSceltaSelezionata()) {
        	case 1:
        		System.out.println();
        	break;
        	case 2:
        		System.out.println("Hai riavviato il gioco.");
        	break;
        	case 3:
        		System.out.println("bruh.");
        	break;
        }
        
        
        Stage1 st1 = new Stage1();
        st1.setSceltaUno(1);
        st1.setSceltaDue(2);
        st1.setSceltaTre(3);
        st1.setSceltaQuattro(4);
        
        System.out.println("Ti sei risvegliato in una foresta buia. \n In lontananza trovi un drago ostile molto pericoloso. \n");
        System.out.println("Cosa scegli di fare?");
        System.out.println("1) Combatti il drago a mani nude, tanto cosa potrà mai andare storto?");
        System.out.println("2) Scappi attraverso la foresta sperando di non essere visto");
        System.out.println("3) Provi a nasconderti dietro gli alberi");
        
        st1.setSceltaSelezionata(userInput.nextInt());
        
        switch(st1.getSceltaSelezionata()) {
        	case 1:
        		st1.setSceltaSelezionata(1);
        		System.out.println("Mi dispiace, sei stato cotto a puntino dal drago.\n Game over!!!");
        	break;
        	case 2:
        		st1.setSceltaSelezionata(2);
        		System.out.println("Sei riuscito a scappare!!");
        	break;
        	case 3:
        		st1.setSceltaSelezionata(3);
        		System.out.println("Che sfortuna, il drago (senza volerlo), ti ha bruciato!");
        	break;
        }
    }
}
