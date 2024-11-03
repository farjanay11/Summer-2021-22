public class Shape{
	private float x;
	
	public Shape (){
		System.out.println("E -Shape");
	}
	public Shape (float x) {
		this.x=x;
		System.out.println("P - Shape");
	}
	public void setX(float x){this.x=x;}
	public float getX(){return this.x;}
	
	public void showDetails(){
		System.out.println("Not a Specific Shape");
	}
	
	
}
		