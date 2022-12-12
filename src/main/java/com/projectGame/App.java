package com.projectGame;
import java.io.IOException;
import java.util.Scanner;

public class App {
	
	public static void clearConsole() {
	    try {
	        if (System.getProperty("os.name").contains("Windows")) {
	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	        }
	        else {
	            System.out.print("\033\143");
	        }
	    } catch (IOException | InterruptedException ex) {}
	}
	
    public static void main( String[] args ) {
    	
        Scanner userInput = new Scanner(System.in);
        
        //Creazione del costruttore per le variabili di gioco.
        inizioGioco in = new inizioGioco();
        
        clearConsole();
        
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
        		System.exit(0);
        	break;
        }
        
        clearConsole();
        
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
        System.out.println("4) Ritirati.");
        
        st1.setSceltaSelezionata(userInput.nextInt());
        
        switch(st1.getSceltaSelezionata()) {
        	case 1:
        		st1.setSceltaSelezionata(1);
        		System.out.println("Mi dispiace, sei stato cotto a puntino dal drago.\n Game over!!!");
        		System.exit(0);
        	break;
        	case 2:
        		st1.setSceltaSelezionata(2);
        		System.out.println("Sei riuscito a scappare!!");
        	break;
        	case 3:
        		st1.setSceltaSelezionata(3);
        		System.out.println("Che sfortuna, il drago (senza volerlo), ti ha bruciato!");
        		System.exit(0);
        	break;
        	case 4:
        		st1.setSceltaSelezionata(4);
        		System.out.println("Ti sei ritirato, che delusione...");
        		System.exit(0);
        }   
        
        clearConsole();
        
        stage2 st2 = new stage2();
        st2.setSceltaUno(1);
        st2.setSceltaDue(2);
        st2.setSceltaTre(3);
        st2.setSceltaQuattro(4);
        
        System.out.println("ti sei rifugiato in una caverna, sei rimasto senza cibo. \n Che fai? ");
        System.out.println("1) Ti crei una lancia con le pietre della caverna e bastoni di alberi e vai a caccia.");
        System.out.println("2) Mangi dei frutti trovati su una pianta selvatica.");
        System.out.println("3) Esci dalla caverna e cerchi qualcuno che può aiutarti.");
        System.out.println("4) Ritirati.");
        
        st2.setSceltaSelezionata(userInput.nextInt());
        
        switch(st2.getSceltaSelezionata()) {
        case 1:
        	st2.setSceltaSelezionata(1);
        	System.out.println("Sei a costruire una lancia e a procurarti del cibo.");
        break;
        case 2:
        	st2.setSceltaSelezionata(2);
        	System.out.println("Mangiando uno dei frutti vieni avvelenato.");
        	System.exit(0);
        break;
        case 3:
        	st2.setSceltaSelezionata(3);
        	System.out.println("Uscendo disarmato trovi sulla strada un mostro che ti divora.");
        	System.exit(0);
        break;
        case 4:
        	System.out.println("Ti sei ritirato, potevi giocare di più...");
        	System.exit(0);
        }
        
        Stage3 st3 = new Stage3();
        st3.setSceltaUno(1);
        st3.setSceltaDue(2);
        st3.setSceltaTre(3);
        st3.setSceltaQuattro(4);
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        st3.setSceltaSelezionata(userInput.nextInt());
    }
}
