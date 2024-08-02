package Wednesday19624;

public class Test2 {
	String name;
	int age;
	void show(String N,int A) {
		name=N;
		age=A;
		System.out.println(name+""+age);
	}

	public static void main(String[] args) {
		Test2 t1=new Test2();
		t1.show("sam", 20);
		t1.show("chinmay", 21);
		t1.show("tanuj", 22);
		t1.show("durga", 23);
		t1.show("immaneul", 24);
		t1.show("shashank", 25);

	}

}
