package String;

import java.util.StringTokenizer;

public class StringTok02 {

	public static void main(String[] args) {
		String tmp="1 0 15 23 6 21 17 10 11 12 13 14";
		
		StringTokenizer stk = new StringTokenizer(tmp);
        StringBuilder hex = new StringBuilder();
        StringBuilder oct = new StringBuilder();
        StringBuilder bin = new StringBuilder();
        while(stk.hasMoreTokens()) {
        	int tok = Integer.parseInt(stk.nextToken());
        	hex.append(Integer.toHexString(tok)+"  ");
        	oct.append(Integer.toOctalString(tok)+"  ");
        	bin.append(Integer.toBinaryString(tok)+"  ");
        }
		System.out.println("16진수 : " + hex);
		System.out.println("8진수 : " + oct);
		System.out.println("2진수 : " + bin);
	}

}

