import java.util.Scanner;

public class Cinema{

	static Scanner input = new Scanner(System.in);

	public static void main (String[] args){

		System.out.println("������������ ��� ������ ���");

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
			System.out.println("�������������� 1 �� ������ �� ����� �� ������������� ���� �������� ��� 2 �� ������ �� ������ ������� ����������.");
			answer = input.nextInt();
			if(answer == 1){
				System.out.println("�������������� 1 �� ������ �� ����� �� ������������� ��� ������������� �������� ��� ��������� �� �������: " + AfmovienameH1 + "," + AfmovienameH2 +
				" ��� 2 �� ������ �� ����� �� ������������� ��� �������� �������� ��� ��������� �� �������: " + NmovienameH1 + "," + NmovienameH2 + ".");
				ans = input.nextInt();
				if(ans == 1){
					System.out.println("�������������� 1 �� ������ �� ����� �� ������������� ��� ������������� �������� ��� �������� 1 ��� ������ ��� ������: " + AfmovienameH1 +
					" ��� 2 �� ������ �� ����� �� ������������� ��� ������������� �������� ��� �������� 1 ��� ������ ��� ������: " + AfmovienameH2 + ".");
					a = input.nextInt();
					if(a == 1){
						hall1.showAv(AfAvArrayH1,linesH1,seatsH1);
					}else{
						hall2.showAv(AfAvArrayH2,linesH2,seatsH2);
					}
				}else{
					System.out.println("�������������� 1 �� ������ �� ����� �� ������������� ��� �������� �������� ��� �������� 1 ��� ������ ��� ������: " + NmovienameH1 +
					" ��� 2 �� ������ �� ����� �� ������������� ��� �������� �������� ��� �������� 1 ��� ������ ��� ������: " + NmovienameH2 + ".");
					a = input.nextInt();
					if(a == 1){
						hall1.showAv(�AvArrayH1,linesH1,seatsH1);
					}else{
						hall2.showAv(�AvArrayH2,linesH2,seatsH2);
					}
				}
			}else{
				System.out.println("�������������� 1 �� ������ �� ������ ������� ���� ������������ ������� ��� 2 �� ������ �� ������ ������� ��� ������� �������. ");
				ans = input.nextInt();
				if(ans == 1){
					System.out.println("�������������� 1 �� ������ �� ������ ������� ���� ������� 1, � ����� ����� " + typeH1 + " ��� ������ ��� ������: " + AfmovienameH1 +
					" ��� 2 �� ������ �� ������ ������� ���� ������� 2, � ����� ����� " + typeH2 + " ��� ������ ��� ������: " + AfmovienameH2 + ".");
				 	a = input.nextInt();
					if(a == 1){
						hall1.Book(AfAvArrayH1,linesH1,seatsH1,AfmoviecodeH1,priceH1,"1",AfmovienameH1,"������������ �������");
					}else{
						hall2.Book(AfAvArrayH2,linesH2,seatsH2,AfmoviecodeH2,priceH1,"2",AfmovienameH2,"������������ �������");
					}
				}else{
					System.out.println("�������������� 1 �� ������ �� ������ ������� ���� ������� 1, � ����� ����� " + typeH1 + " ��� ������ ��� ������: " + NmovienameH1 +
					" ��� 2 �� ������ �� ������ ������� ���� ������� 2, � ����� ����� " + typeH2 + " ��� ������ ��� ������: " + NmovienameH2 + ".");
					a = input.nextInt();
					if(a == 1){
						hall1.Book(NAvArrayH1,linesH1,seatsH1,NmoviecodeH1,priceH2,"1",NmovienameH1,"������� �������");
					}else{
						hall2.Book(NfAvArrayH2,linesH2,seatsH2,NmoviecodeH2,priceH2,"2",NmovienameH2,"������� �������");
					}
				}
			}
		}
		System.out.prinln("������ �� ���������� �� ��������������� ��� ��������;���/���");
		String option = input.nextLine();
		if(option == "���"){
			flag = true;
		}
	}
}
