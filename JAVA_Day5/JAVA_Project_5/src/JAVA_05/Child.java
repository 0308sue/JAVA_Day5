package JAVA_05;

public class Child extends Father{
	public Child() {
		super();
		System.out.println("Child  생성자");
	}
	public void childMethod () {
		System.out.println("childMethod");
	}
	  //오버라이딩
	 @Override
	public void method() {
		  System.out.println("child 가 method 수정함 ");
	}

}
