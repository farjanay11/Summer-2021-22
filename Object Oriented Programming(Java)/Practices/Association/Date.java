class Date{
	private int day;
	private int month;
	private int year;
	
	Date(int day,int month,int year){
		this.day = day;
		this.month = month;
		this.year = year;
		System.out.println("The Date is Set.");
	}
	public void setDay(int day){this.day = day;}
	public void setMonth(int month){this.month = month;}
	public void setYear(int year){this.year = year;}
	public int getDay(){ return day;}
	public int getMonth(){ return month;}
	public int getYear(){ return year;}
	
	public String getDate(){
		return day+"."+month+"."+year;
	}
	public void showDate(){
		System.out.println(day+"."+month+"."+year);
	}
}