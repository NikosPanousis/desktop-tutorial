import java.time.LocalTime;
import java.util.Scanner ;

public class BookTicket{

	static Scanner input = new Scanner(System.in);

	private int lines;
	private int seats;
	private boolean[][] AvArray;
	private String moviecode;
	private String moviename;
	private String time;
	private double price;

	public BookTicket(boolean[][] AvArray,int lines,int seats,String moviecode,double price,String hall,String moviename,String time){
		this.lines = lines;
		this.seats = seats;
		this.AvArray = AvArray;
		this.moviecode = moviecode;
		this.price = price;
		this.moviename = moviename;
		this.time = time;
	}

	//---------------------------------------------------------------------------------------------------------

	public int getLines(){
		return lines;
	}

	//---------------------------------------------------------------------------------------------------------

	public int getSeats(){
		return seats;
	}

	//---------------------------------------------------------------------------------------------------------

	public boolean [][]getAvArray(){
		return AvArray;
	}

	//---------------------------------------------------------------------------------------------------------

	  public LocalTime Time() {
	    LocalTime myObj = LocalTime.now();
	    return myObj;
	  }

	//---------------------------------------------------------------------------------------------------------


	public void Book(boolean[][] AvArray,int lines,int seats,String moviecode,double price,String hall,String moviename,LocalTime time){

		boolean flag = false;
		while(flag == false){
			System.out.println("Ðëçêôñïëïãßóôå ôïí áñéèìü ôçò óåéñÜò ðïõ èÝëåôå.");
			int ln = input.nextInt();
			System.out.println("Ðëçêôñïëïãßóôå ôïí áñéèìü ôçò èÝóçò ðïõ èÝëåôå.");
			int st = input.nextInt();
			if(AvArray[ln][st] == true){
				System.out.println("Ç èÝóç åßíáé äåóìåõìÝíç");
			}else{
				System.out.println("Äåóìåýóáôå ôçí èÝóç ìå åðéôõ÷ßá");
				System.out.println("Ðñáãìáôïðïéåßôáé Ýêäïóç åéóéôçñßïõ...");
				time = Time();
				System.out.println("Tict [id=" + moviecode + ", price=" + price + ", movie=" + moviename +
				", time=" + time + ", line=" + ln + ", seat=" + st );


			}
			System.out.println("ÈÝëåôå íá êëåßóåôå Üëëç èÝóç;Íáé/¼÷é");
			String option = input.nextLine();
			if(option == "¼÷é"){
				flag = true;
			}
		}
	}

}
