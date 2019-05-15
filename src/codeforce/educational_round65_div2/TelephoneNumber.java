package codeforce.educational_round65_div2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//¼º°ø
public class TelephoneNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int tc = Integer.parseInt(reader.readLine());
		while(tc-->0) {
			int n = Integer.parseInt(reader.readLine());
			String s = reader.readLine();
			StringBuilder b = new StringBuilder(s);
			
			boolean isOk = false;
			int index = 0;
			for(int i=0; i<b.length(); i++) {
				if(b.charAt(i)=='8') {
					isOk = true;
					index = i;
					break;
				}
			}
			if(!isOk)
				writer.write("NO\n");
			else {
				if(b.length()-index >= 11)
					writer.write("YES\n");
				else
					writer.write("NO\n");
			}
		}
		writer.flush();
	}

}
