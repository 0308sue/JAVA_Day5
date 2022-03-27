package JAVA_05;

public class Father extends GrandFather {
	  public Father() {
		  super();
		  System.out.println("Father  생성자");
	  }
	  public void fatherMethod() {
		  System.out.println("fatherMethod");
	  }
	  //오버라이딩
	  @Override
	  public void method() {
		  System.out.println("father 이 method 수정함 ");
	  }
	}

