import java.util.Scanner;

public class Cinema{

	static Scanner input = new Scanner(System.in);

	public static void main (String[] args){

		System.out.println("Καλωσορίσατε στο σινεμά μας");

		CreateCinema hall1 = new CreateCinema(3,8,"2D","01","NEWS OF THE WORLD","01","The Conjuring","02");
		double priceH1 = hall1.getPrice();
		String AfmovienameH1 = hall1.getMoviename1();
		String AfmoviecodeH1 = hall1.getMoviecode1();
		String NmovienameH1 = hall1.getMoviename2();
		String NmoviecodeH1 = hall1.getMoviecode2();
		int linesH1 = hall1.getLines();
		int seatsH1 = hall1.getSeats();
		String typeH1 = hall1.getType();
		String idH1 = hall1.getId();
		boolean[][] AfAvArrayH1 = new boolean[linesH1][seatsH1];
		boolean[][] NAvArrayH1 = new boolean[linesH1][seatsH1];

		CreateCinema hall2 = new CreateCinema(2,6,"3D","02","THE MASK","03","The Platform","04");
		double priceH2= hall2.getPrice();
		String AfmovienameH2 = hall2.getMoviename1();
		String AfmoviecodeH2 = hall2.getMoviecode1();
		String NmovienameH2 = hall2.getMoviename2();
		String NmoviecodeH2 = hall2.getMoviecode2();
		int linesH2 = hall2.getLines();
		int seatsH2 = hall2.getSeats();
		String typeH2 = hall2.getType();
		String idH2 = hall2.getId();
		boolean[][] AfAvArrayH2 = new boolean[linesH2][seatsH2];
		boolean[][] NAvArrayH2 = new boolean[linesH2][seatsH2];

		int answer,ans,a;
		boolean flag = false;
		while(flag = false){
			System.out.println("Πληκτρολογίστε 1 αν θέλετε να δείτε τη διαθεσιμότητα κάθε προβολής και 2 αν θέλετε να κάνετε κράτηση εισιτηρίου.");
			answer = input.nextInt();
			if(answer == 1){
				System.out.println("Πληκτρολογίστε 1 αν θέλετε να δείτε τη διαθεσιμότητα της απογευματινής προβολής που παίζονται οι ταινίες: " + AfmovienameH1 + "," + AfmovienameH2 +
				" και 2 αν θέλετε να δείτε τη διαθεσιμότητα της βραδινής προβολής που παίζονται οι ταινίες: " + NmovienameH1 + "," + NmovienameH2 + ".");
				ans = input.nextInt();
				if(ans == 1){
					System.out.println("Πληκτρολογίστε 1 αν θέλετε να δείτε τη διαθεσιμότητα της απογευματινής προβολής της αίθουσας 1 που παίζει την ταινία: " + AfmovienameH1 +
					" και 2 αν θέλετε να δείτε τη διαθεσιμότητα της απογευματινής προβολής της αίθουσας 1 που παίζει την ταινία: " + AfmovienameH2 + ".");
					a = input.nextInt();
					if(a == 1){
						hall1.showAv(AfAvArrayH1,linesH1,seatsH1);
					}else{
						hall2.showAv(AfAvArrayH2,linesH2,seatsH2);
					}
				}else{
					System.out.println("Πληκτρολογίστε 1 αν θέλετε να δείτε τη διαθεσιμότητα της βραδινής προβολής της αίθουσας 1 που παίζει την ταινία: " + NmovienameH1 +
					" και 2 αν θέλετε να δείτε τη διαθεσιμότητα της βραδινής προβολής της αίθουσας 1 που παίζει την ταινία: " + NmovienameH2 + ".");
					a = input.nextInt();
					if(a == 1){
						hall1.showAv(ΝAvArrayH1,linesH1,seatsH1);
					}else{
						hall2.showAv(ΝAvArrayH2,linesH2,seatsH2);
					}
				}
			}else{
				System.out.println("Πληκτρολογίστε 1 αν θέλετε να κάνετε κράτηση στην απογευματινή προβολή και 2 αν θέλετε να κάνετε κράτηση στη βραδινή προβολή. ");
				ans = input.nextInt();
				if(ans == 1){
					System.out.println("Πληκτρολογίστε 1 αν θέλετε να κάνετε κράτηση στην αίθουσα 1, η οποία είναι " + typeH1 + " και παίζει την ταινία: " + AfmovienameH1 +
					" και 2 αν θέλετε να κάνετε κράτηση στην αίθουσα 2, η οποία είναι " + typeH2 + " και παίζει την ταινία: " + AfmovienameH2 + ".");
				 	a = input.nextInt();
					if(a == 1){
						hall1.Book(AfAvArrayH1,linesH1,seatsH1,AfmoviecodeH1,priceH1,"1",AfmovienameH1,"Απογευματινή Προβολή");
					}else{
						hall2.Book(AfAvArrayH2,linesH2,seatsH2,AfmoviecodeH2,priceH1,"2",AfmovienameH2,"Απογευματινή Προβολή");
					}
				}else{
					System.out.println("Πληκτρολογίστε 1 αν θέλετε να κάνετε κράτηση στην αίθουσα 1, η οποία είναι " + typeH1 + " και παίζει την ταινία: " + NmovienameH1 +
					" και 2 αν θέλετε να κάνετε κράτηση στην αίθουσα 2, η οποία είναι " + typeH2 + " και παίζει την ταινία: " + NmovienameH2 + ".");
					a = input.nextInt();
					if(a == 1){
						hall1.Book(NAvArrayH1,linesH1,seatsH1,NmoviecodeH1,priceH2,"1",NmovienameH1,"Βραδινή Προβολή");
					}else{
						hall2.Book(NfAvArrayH2,linesH2,seatsH2,NmoviecodeH2,priceH2,"2",NmovienameH2,"Βραδινή Προβολή");
					}
				}
			}
		}
		System.out.prinln("Θέλετε να συνεχίσετε να χρησιμοποιείται την εφαρμογή;Ναι/Όχι");
		String option = input.nextLine();
		if(option == "Όχι"){
			flag = true;
		}
	}
}
