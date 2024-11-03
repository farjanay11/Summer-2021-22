public class Box extends Rectangle{
	private float z;
	
	public Box(){
		System.out.println("E - Box");
	}
	public Box(float x, float y, float z){
		super (x,y);
		this.z=z;
		System.out.println("P - Box");
	}
	public void setZ(float z) {
		this.z=z;
	}
	public float getZ(){
		return this.z;
	}
	public float getVolume(){
		return super.getX()*super.getY()*this.getZ();
	}
	public void showDetails(){
		System.out.println("Length: " + super.getX());
		System.out.println("Width: " + super.getY());
		System.out.println("Height: " + this.getZ());
		System.out.println("Volume: " + this.getVolume());
	}
}