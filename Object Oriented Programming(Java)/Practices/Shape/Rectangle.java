public class Rectangle extends Shape{
	private float y;
	
	public Rectangle(){System.out.println("E - Rec");}
	public Rectangle(float x,float y ){
		super(x);
		this.y=y;
		System.out.println("P - Rec");
	}
	public void setY(float y){this.y=y;}
	public float getY(){return this.y;}
	
	public float getArea(){
		return super.getX()*this.getY();
	}
	public void showRectangle(){
		System.out.println("Length: "+super.getX());
		System.out.println("Width: "+this.getY());
		System.out.println("Area: "+this.getArea());
	}
}