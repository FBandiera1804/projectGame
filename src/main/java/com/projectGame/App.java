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
        
        //Menu inizio gioco.
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
        		System.exit(0);
        	break;
        	case 3:
        		System.out.println("Hai riavviato il gioco.");
        	break;
        }
        
        clearConsole();
        
        //Inizia lo stage 1
        Stage1 st1 = new Stage1();
        st1.setSceltaUno(1);
        st1.setSceltaDue(2);
        st1.setSceltaTre(3);
        st1.setSceltaQuattro(4);
        
        System.out.println("Ti sei risvegliato in una foresta buia. Hai perso i sensi e sei disorientato in piena notte."
        		+ "\nVicino trovi un trovi un drago ostile coperto da alberi. Non hai alcun mezzo per combatterlo e ti senti impaurito.\n"
        		+ "Cosa scegli di fare per sopravvivere? (Fai la tua scelta digitando il numero di quest'ultima.)\n");
        
        System.out.println("1) Prendi il coraggio e provi ad attaccarlo a mani nude.");
        System.out.println("2) Scappi attraverso la foresta sperando di non essere visto");
        System.out.println("3) Ti nascondi dietro un albero fino a quando il drago non se ne va");
        System.out.println("4) Ritirati");
        
        st1.setSceltaSelezionata(userInput.nextInt());
        
        switch(st1.getSceltaSelezionata()) {
        	case 1:
        		st1.setSceltaSelezionata(1);
        		System.out.println("Hai perso. Sei stato bruciato vivo con un soffio.");
        		System.exit(0);
        	break;
        	case 2:
        		st1.setSceltaSelezionata(2);
        		System.out.println("\nSei riuscito a scappare! Hai superato il livello. \n");
        	break;
        	case 3:
        		st1.setSceltaSelezionata(3);
        		System.out.println("Hai perso. Il drago ti ha trovato, e ti attacca dallo spavento. Vieni mangiato vivo.");
        		System.exit(0);
        	break;
        	case 4:
        		st1.setSceltaSelezionata(4);
           		System.out.println("Ti sei ritirato, Hai perso.");
           		System.exit(0);
        	break;
        }
        
        //Scelta continua gioco, riavvio o fine gioco.
        System.out.println("Vuoi continuare? \n");
        System.out.println("1) Passa al prossimo livello.");
        System.out.println("2) Riavvia il gioco.");
        System.out.println("3) Ritirati.");
        
        st1.setSceltaSelezionata(userInput.nextInt());
        
        switch(st1.getSceltaSelezionata()) {
        case 1:
        	System.out.println();
        break;
        case 2:
        	System.exit(0);
        break;
        case 3:
        	System.exit(0);
        break;
        }
        
        
        clearConsole();
        
        //Stage 2
        stage2 st2 = new stage2();
        st2.setSceltaUno(1);
        st2.setSceltaDue(2);
        st2.setSceltaTre(3);
        st2.setSceltaQuattro(4);
        
        System.out.println("Mentre camminavi nella foresta, tutto d'un tratto inizia a piovere, cerchi riparo e trovi una caverna. "
        		+ "Non hai cibo e stai morendo di fame. Quindi a quel punto cerchi qualcosa per creare una lancia."
        		+ "Mentre sei a cercare cibo davanti a te vedi passare tre animali: un maiale, una pecora e un cervo."
        		+ "Che fai?");
        System.out.println("1) Uccidi il maiale.");
        System.out.println("2) Uccidi la pecora.");
        System.out.println("3) Uccidi il cervo.");
        System.out.println("4) Ritirati.");
        
        st2.setSceltaSelezionata(userInput.nextInt());
        
        switch(st2.getSceltaSelezionata()) {
        case 1:
        	st2.setSceltaSelezionata(1);
        	System.out.println("Hai ucciso il maiale e prendi la sua carne. \n Hai vinto.\n ");
        break;
        case 2:
        	st2.setSceltaSelezionata(2);
        	System.out.println("Uccidi la pecora scopri che è maledetta ed inizi a sentirti male.");
        	System.exit(0);
        break;
        case 3:
        	st2.setSceltaSelezionata(3);
        	System.out.println("Il cervo ti vede e scappa via. Inizi ad inseguirlo ma nel durante cadi e muori di fame e sete. Hai perso.");
        	System.exit(0);
        break;
        case 4:
        	System.out.println("Ti sei ritirato, hai perso.");
        	System.exit(0);
        }
        
        //Scelta continua gioco, riavvio o fine gioco.
        System.out.println("Vuoi continuare?");
        System.out.println("1) Passa al prossimo livello.");
        System.out.println("2) Riavvia il gioco.");
        System.out.println("3) Ritirati.");
        
        st2.setSceltaSelezionata(userInput.nextInt());
        
        switch(st2.getSceltaSelezionata()) {
        case 1:
        	System.out.println();
        break;
        case 2:
        	System.exit(0);
        break;
        case 3:
        	System.exit(0);
        break;
        }
        clearConsole();
        
        //Stage 3
        Stage3 st3 = new Stage3();
        st3.setSceltaUno(1);
        st3.setSceltaDue(2);
        st3.setSceltaTre(3);
        st3.setSceltaQuattro(4);
        
        System.out.println("Durante la caccia incontri una strega. \n Notando non avevi nulla da mangiare e non avendo un posto per riposare ti invita a casa sua. \n Che fai?");
        System.out.println("1) Accetti l'invito");
        System.out.println("2) Rifiuti L'invito");
        System.out.println("3) Ritirati");
        System.out.println("4) Riavvia gioco");
        
        st3.setSceltaSelezionata(userInput.nextInt());
        
        switch(st3.getSceltaSelezionata()) {
        case 1:
        	st3.setSceltaUno(1);
        	System.out.println("Hai accettato l'invito e la strega ti guida verso la sua casa. \n Hai superato il  livello.\n ");
        break;
        case 2:
        	st3.setSceltaDue(2);
        	System.out.println("Hai continuato per la tua strada, ma durante l'esplorazione cadi da un burrone e muori");
        	System.exit(0);
        break;
        case 3:
        	st3.setSceltaTre(3);
        	System.out.println("Ti sei ritirato, hai perso.");
        	System.exit(0);
        break;
        case 4: 
        	st3.setSceltaQuattro(4);
        	System.out.println("Hai riavviato il gioco");
        	System.exit(0);
        break;
        }
        
        //Scelta continua gioco, riavvio o fine gioco.
        System.out.println("Vuoi continuare?");
        System.out.println("1) Passa al prossimo livello.");
        System.out.println("2) Riavvia il gioco.");
        System.out.println("3) Ritirati.");
        
        st3.setSceltaSelezionata(userInput.nextInt());
        
        switch(st3.getSceltaSelezionata()) {
        case 1:
        	System.out.println();
        break;
        case 2:
        	System.exit(0);
        break;
        case 3:
        	System.exit(0);
        break;
        }
        
        clearConsole();
        
        //Stage 4
        Stage4 st4 = new Stage4();
        System.out.println("Sei arrivato alla casa della strega. Appena entrati dentro, la casa si trasforma in un'arena e vieni sfidato dalla strega.\n Accetti?");
        System.out.println("1) Si, accetti");
        System.out.println("2) No, rifiuti");
        System.out.println("3) Ritirati");
        System.out.println("4) Riavvia gioco");
        
        st4.setSceltaSelezionata(userInput.nextInt());
        
        switch(st4.getSceltaSelezionata()) {
        case 1:
        	st4.setSceltaUno(1);
        	System.out.println("Durante lo scontro riesci a rompere lo scettro della strega usando la lancia e la sconfiggi.\nHai superato il livello");
        break;
        case 2:
        	st4.setSceltaDue(2);
        	System.out.println("La strega, sentendosi presa in giro, ti coglie di sopresa mentre cerchi di uscire dalla casa e muori.\nHai perso");
        	System.exit(0);
        break;
        case 3:
        	st4.setSceltaTre(3);
        	System.out.println("Ti sei ritirato, che peccato.");
        	System.exit(0);
        break;
        case 4: 
        	st4.setSceltaQuattro(4);
        	System.out.println("Hai riavviato il gioco");
        	System.exit(0);
        break;
        }
        
        //Scelta continua gioco, riavvio o fine gioco.
        System.out.println("Vuoi continuare?");
        System.out.println("1) Passa al prossimo livello.");
        System.out.println("2) Riavvia il gioco.");
        System.out.println("3) Ritirati.");
        
        st4.setSceltaSelezionata(userInput.nextInt());
        
        switch(st4.getSceltaSelezionata()) {
        case 1:
        	System.out.println();
        break;
        case 2:
        	System.exit(0);
        break;
        case 3:
        	System.exit(0);
        break;
        }
        
        clearConsole();
        
        //Stage 5
        Stage5 st5 = new Stage5();
        System.out.println("La strega ormai non può più contrattaccare. \n Cosa vuoi fare?");
        System.out.println("1) Finiscila");
        System.out.println("2) Risparmiala");
        System.out.println("3) Ritirati");
        System.out.println("4) Riavvia gioco");
        
        st5.setSceltaSelezionata(userInput.nextInt());
        
        switch(st5.getSceltaSelezionata()) {
        case 1:
        	st5.setSceltaUno(1);
        	System.out.println("Hai ucciso la strega, ma rimarrai chiuso in quella casa fino alla morte. \n Hai perso");
        break;
        case 2:
        	st5.setSceltaDue(2);
        	System.out.println("Lasci in vita la strega, lei si scusa e ti riporta a casa. \n Hai vinto!");
        	System.exit(0);
        break;
        case 3:
        	st5.setSceltaTre(3);
        	System.out.println("Ti sei ritirato, hai perso.");
        	System.exit(0);
        break;
        case 4: 
        	st5.setSceltaQuattro(4);
        	System.out.println("Hai riavviato il gioco");
        	System.exit(0);
        break;
        }
        
        clearConsole();
        System.out.println("Hai fatto questo.");
        System.out.println("Hai vinto il gioco. Congratulazioni!");
    }
}
