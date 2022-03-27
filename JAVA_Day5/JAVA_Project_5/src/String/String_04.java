package String;

public class String_04 {
	public static void main(String[] args) {
		String msg = "This/is/a/Java";
		//split() 을 이용해서 Java a is This  로 출력
		String[] arr = msg.split("/"); // This is a Java
		for(int i=arr.length-1; i>=0;i--) {
			System.out.print( arr[i] +"\t");
		}
		System.out.println();
		//              "This is a Java";
		for(int i=arr.length-1; i>=0;i--) {  // i =Java                    a      is      This
			for(int j=arr[i].length()-1; j>=0;j--) {  //j = a v a J     a      s i     sihT
				System.out.print(arr[i].charAt(j));
			}
			System.out.print(" ");
		}
		System.out.println();
		System.out.println((char)('A'+2));  // A =65
		
		String str = "Hi.. Glad to meet you!!!!";  //Jk00"Incf"vq"oggv"{qw####
		for(int i=0; i<str.length();i++) {
			System.out.print((char)(str.charAt(i)+2));
		}
		System.out.println();
		//str에서 meet 만 추출
		System.out.println(str.substring(0, 3));
		System.out.println(str.substring(str.indexOf("m"), str.indexOf("m")+4));
		System.out.println(str.substring(str.indexOf("m")));
		System.out.println(str.indexOf("t"));
		System.out.println(str.lastIndexOf("t"));
		
	}
}
