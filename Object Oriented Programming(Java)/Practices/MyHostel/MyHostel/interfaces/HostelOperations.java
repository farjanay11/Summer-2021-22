package interfaces;
import classes.*;

public interface HostelOperations {
	void insertHostel(Hostel h);

	void removeHostel(Hostel h);

	 Hostel getroomNumber(int RoomNumber);

	void showAllHostels();
}