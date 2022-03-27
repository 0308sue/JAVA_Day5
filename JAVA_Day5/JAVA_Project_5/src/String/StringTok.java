package String;

import java.util.StringTokenizer;

public class StringTok {

	public static void main(String[] args) {
	 StringTokenizer st= new StringTokenizer("홍길동,장화/홍련/팥쥐/주인공",",/");
	 System.out.println(st.countTokens());
	 
	   //홍길동 장화 홍련 팥쥐 주인공
//	 int len = st.countTokens();
//	 for(int i=0; i<len; i++) {
//		// System.out.println("count : " + st.countTokens());
//		 System.out.println(st.nextToken());
//	 }
	 System.out.println();
	 System.out.println(st.hasMoreTokens());
	 while(st.hasMoreTokens()) {
		 System.out.println("count : " + st.countTokens());
 		  System.out.println(st.nextToken());
	 }
	 
		String tmp="1 0 15 23 6 21 17 10 11 12 13 14";
		//StringTokenizer 이용해서 공백으로 구분
				//16, 8, 2진수로 변환하여 출력
		StringTokenizer stk = new StringTokenizer(tmp);
		String hex ="";
		String oct="";
		String bin="";
		while(stk.hasMoreTokens()) {
			String str = stk.nextToken(); //1  str-->int
			int v = Integer.parseInt(str); // int 1
			hex += Integer.toHexString(v)+"  ";
			oct += Integer.toOctalString(v)+" ";
			bin += Integer.toBinaryString(v)+" ";
		}
		System.out.println("16진수 : " + hex);
		System.out.println("8진수 : " + oct);
		System.out.println("2진수 : " + bin);
		
	 
	}


}
