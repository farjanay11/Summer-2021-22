package classes;
import interfaces.*;

public class Student implements HostelOperations 
{
	private String name;
	private int ID;
	private Hostel hostels[] = new Hostel[10];

	public void setName(String name) {
		this.name = name;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getName() {
		return name;
	}

	public  int getID() {
		return ID;
	}

	public void insertHostel(Hostel h) {
		int flag = 0;
		for (int i = 0; i < hostels.length; i++) {
			if (hostels[i] == null) {
				hostels[i] = h;
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("Room Inserted");
		} else {
			System.out.println("Can Not Insert");
		}
	}

	public void removeHostel(Hostel h) {
		int flag = 0;
		for (int i = 0; i < hostels.length; i++) {
			if (hostels[i] == h) {
				hostels[i] = null;
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("Room Removed");
		} else {
			System.out.println("Can Not Remove");
		}
	}

	public void showAllHostels() {
		for (Hostel h : hostels) {
			if (h != null) {
				h.showInfo();
			}
		}
	}

	public Hostel getroomNumber(int RoomNumber) {
		Hostel h = null;

		for (int i = 0; i < hostels.length; i++) {
			if (hostels[i] != null) {
				if (hostels[i].getRoomNumber() == RoomNumber) {
					h = hostels[i];
					break;
				}
			}
		}
		if (h != null) {
			System.out.println("Room Found");
		} else {
			System.out.println("Room Not Found");
		}
		return h;
	}

	public void showAllStudents() {
	}

	public static void main(String[] args) {

	}

    public void showAllAccounts() {
    }

	
}