package JAVA_05;

public class Main {
	public static void main(String[] args) {
		Father f = new Father();
		f.fatherMethod();
		f.method();
		
		System.out.println("======");
		Child c = new Child();
		c.childMethod();
		c.fatherMethod();  //상속관계
		c.grandFatherMethod();
		c.method();
		System.out.println(c.value);
		
		System.out.println("======");
		GrandFather gf = new GrandFather();
		gf.grandFatherMethod();
	
		System.out.println("======");
		
		Father f1;  //선언
		Child c2 = new Child(); 
		f1 = c2 ; // f1 Father 형,Father  = Child  
		
		f1.fatherMethod();
	//	f1.childMethod(); 오류발생
		f1.grandFatherMethod();
		
		Father f2 = new Child(); //f2 Father형 Child의 오버라이딩 된 메소드 접근 가능
 		f2.method();
	}
  
}
