package JAVA_05;

public class GrandFather {
	 protected String value="접근 제어자";
	public GrandFather() {
		System.out.println("GrandFather 생성자");
	}
	public void grandFatherMethod() {
		System.out.println("grandFatherMethod");
	}
	public void method() {
		System.out.println("method");
	}

}
