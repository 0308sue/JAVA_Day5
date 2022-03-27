package shape;

public class Circle extends Shape{
	  
		private int r;
		public Circle(int x, int y, int r) {
			super(x, y);
			this.r = r;
		}
		@Override
			public void print() {
				super.print();
				System.out.println("반지름 : " + r);
			}
		@Override
		public String toString() {
			return "원";
		}
	}