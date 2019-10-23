package baekjoon.implementation;

import java.util.*;
import java.io.*;

//starman
public class Q12791 {
	static String RDBMS = "1967 DavidBowie\r\n" + 
			"1969 SpaceOddity\r\n" + 
			"1970 TheManWhoSoldTheWorld\r\n" + 
			"1971 HunkyDory\r\n" + 
			"1972 TheRiseAndFallOfZiggyStardustAndTheSpidersFromMars\r\n" + 
			"1973 AladdinSane\r\n" + 
			"1973 PinUps\r\n" + 
			"1974 DiamondDogs\r\n" + 
			"1975 YoungAmericans\r\n" + 
			"1976 StationToStation\r\n" + 
			"1977 Low\r\n" + 
			"1977 Heroes\r\n" + 
			"1979 Lodger\r\n" + 
			"1980 ScaryMonstersAndSuperCreeps\r\n" + 
			"1983 LetsDance\r\n" + 
			"1984 Tonight\r\n" + 
			"1987 NeverLetMeDown\r\n" + 
			"1993 BlackTieWhiteNoise\r\n" + 
			"1995 1.Outside\r\n" + 
			"1997 Earthling\r\n" + 
			"1999 Hours\r\n" + 
			"2002 Heathen\r\n" + 
			"2003 Reality\r\n" + 
			"2013 TheNextDay\r\n" + 
			"2016 BlackStar";
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder ans = new StringBuilder();
		String[] splitRDBMS = RDBMS.split("\r\n");
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int cnt = 0;
			StringBuilder sb = new StringBuilder();
			for(int j=0; j<splitRDBMS.length; j++) {
				String[] temp = splitRDBMS[j].split(" ");
				int year = Integer.parseInt(temp[0]);
				if(year >= start && year <= end ) {
					cnt++;
					sb.append(splitRDBMS[j]+"\n");
				}
			}
			ans.append(cnt+"\n"+sb);
		}
		System.out.print(ans.toString());
	}
}
