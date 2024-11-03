package classes;
public abstract class Hostel {
	protected int RoomNumber;
	protected double balance;

	public void setAccountNumber(int RoomNumber) {
		this.RoomNumber = RoomNumber;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getRoomNumber() {
		return RoomNumber;
	}

	public double getBalance() {
		return balance;
	}

	public abstract void showInfo();

}