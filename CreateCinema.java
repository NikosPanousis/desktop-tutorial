import java.util.Scanner;

public class CreateCinema{

	private int lines;
	private int seats;
	private double price;
	private String type;
	private String id;
	private String moviename1,moviename2;
	private String moviecode1,moviecode2;


	public CreateCinema(int lines,int seats,String type,String id,String moviename1,String moviecode1,String moviename2,String moviecode2){
		this.id = id;
		this.lines = lines;
		this.seats = seats;
		this.type = type;
		this.moviename1 = moviename1;
		this.moviecode1 = moviecode1;
		this.moviename2 = moviename2;
		this.moviecode2 = moviecode2;

		if(type == "2D"){
			this.price = 7.0;
		}else{
			this.price = 10.5;
		}
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

	public String getType(){
		return type;
	}

	//---------------------------------------------------------------------------------------------------------

	public String getId(){
		return id;
	}

	//---------------------------------------------------------------------------------------------------------

	public Double getPrice(){
			return price;
	}

	//---------------------------------------------------------------------------------------------------------

	 public String getMoviename1(){
		return moviename1;
	}

	//---------------------------------------------------------------------------------------------------------

	public String getMoviename2() {
		return moviename2;
	}

	//---------------------------------------------------------------------------------------------------------

	public String getMoviecode1() {
	  	return moviecode1;
	}

	//---------------------------------------------------------------------------------------------------------

	public String getMoviecode2() {
	  	return moviecode2;
	}

	//---------------------------------------------------------------------------------------------------------

}





















