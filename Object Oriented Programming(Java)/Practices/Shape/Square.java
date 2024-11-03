public class Square extends Shape{
	public Square () {
		System.out.println("E -Square");
	}
	public Square (float x){
		super (x);
		System.out.println("P- Sqaure");
	}
	public float getArea(){
		return super.getX()*super.getX();
	}
	public void showDetails(){
	System.out.println("Length: "+ super.getX());
	System.out.println("Area: "+ this.getArea());
	}
	
}