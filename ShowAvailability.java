public class ShowAvailability{

	private int lines;
	private int seats;
	private boolean[][] AvArray;

	public ShowAvailability(boolean[][] AvArray ,int lines,int seats){
		this.lines = lines;
		this.seats = seats;
		this.AvArray = AvArray;
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

	public void showAv(boolean[][] AvArray ,int lines,int seats){

		for(int i=0;i<lines;i++){
			System.out.print("Line " + i+1 + "   ");
			for(int j=0;j<seats;j++){
				if(AvArray[i][j] == true){
					System.out.println("X | ");
				}else{
					System.out.println("A | ");
				}
			}
		}

	}

}