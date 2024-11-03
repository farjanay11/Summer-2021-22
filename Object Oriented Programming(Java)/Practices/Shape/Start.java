public class Start{
	public static void main(String [] args){
		Shape sp =new Shape(5);
		sp.showDetails();
		
		Square sq=new Square (8);
		sq.showDetails();
	
	
	Rectangle re=new Rectangle(4,5);
	re.showDetails();
	Box bo=new Box(4,5,6);
	bo.showDetails();
	}
}