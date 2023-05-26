package step7_01.objectArray;

// 생성자(Consturctor)
class Client {
	
	String id;
	String passwd;
	String name;
	String birth;
	int age;
	String contact;
	String address;
	
	void setData(String id, 
			     String passwd,
			     String name,
			     String birth,
			     int age,
			     String contact,
			     String address) {
		this.id = id; // 파라메터로 전달되 데이터를 필드에 대입
		this.passwd = passwd; // clientList[1], 
		this.name = name;
		this.birth = birth;
		this.age = age;
		this.contact = contact;
		this.address = address;		
	}
	
	void printData() {
		System.out.println(this.id + "/" + this.passwd + " / " + this.name + "/" + this.birth + " / " + this.age + " / " + this.contact + " / " + this.address);
	}
}

public class ObjectArrayEx05_문제 {

	public static void main(String[] args) {
		
		Client[] clientList = new Client[3];
		for (int i = 0; i < clientList.length; i++) {
			clientList[i] = new Client(); // 생성자 문법			
		}
		
		// 생성자 사용 전, this 
		clientList[0].id = "user1";
		clientList[0].passwd = "1111";
		clientList[0].name = "사용자1";
		clientList[0].birth = "1990-01-01";
		clientList[0].age = 34;
		clientList[0].contact = "010-1111-2222";
		clientList[0].address = "서울";
		
		// 생성자 사용 후
		clientList[1].setData("user2", "2222", "홍길동", "2000-01-01", 23, "010-8822-2727", "서울시"); 
		clientList[2].setData("user3", "2222", "김길동", "2002-01-01", 21, "010-8822-2728", "경기도");
		
		// test
		clientList[0].printData(); // user1/1111 / 사용자1/1990-01-01 / 34 / 010-1111-2222 / 서울
		clientList[1].printData();

	}

}
