package kakao.T2019;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//¸ÅÄªÁ¡¼ö
class Page {
	int basic = 0;
	int out = 0;
	List<Integer> in = new ArrayList<>();
	String content;

}
public class Q6 {

	public static void main(String[] args) {
		String[] s = {"<html lang=\"ko\" xml:lang=\"ko\" xmlns=\"http://www.w3.org/1999/xhtml\">\n<head>\n <meta charset=\"utf-8\">\n <meta property=\"og:url\" content=\"https://careers.kakao.com/interview/list\"/>\n</head> \n<body>\n<a href=\"https://programmers.co.kr/learn/courses/4673\"></a>#!MuziMuzi!)jayg07con&&\n\n</body>\n</html>",
		"<html lang=\"ko\" xml:lang=\"ko\" xmlns=\"http://www.w3.org/1999/xhtml\">\n<head>\n <meta charset=\"utf-8\">\n <meta property=\"og:url\" content=\"https://www.kakaocorp.com\"/>\n</head> \n<body>\ncon%\tmuzI92apeach&2<a href=\"https://hashcode.co.kr/tos\"></a>\n\n\t^\n</body>\n</html>"};
		System.out.println(solution("Muzi" ,s));
	}
	public  static int solution(String word, String[] pages) {
		Page[]p = new Page[pages.length];
		Pattern pat1 = Pattern.compile("[^a-z]"+word.toLowerCase()+"[^a-z]");
		Pattern pat2 = Pattern.compile("<meta property=\"og:url\" content=\"https://(.+?)\">");;
		for(int i=0; i<pages.length; i++) {
			p[i] = new Page();
			String s = pages[i].toLowerCase();
			Matcher m = pat1.matcher(s);
			while(m.find()) {
				p[i].basic++;
			}
			m = pat2.matcher(s);
			while(m.find()) {
				p[i].content = m.group(1);
			}
		}
		Pattern pat = Pattern.compile("<a href=\"https://([.+?]+)\">");
		for(int i=0; i<pages.length; i++) {
			String s = pages[i].toLowerCase();
			Matcher m = pat.matcher(s);
			while(m.find()) {
					p[i].out++;
					for(int j=0; j<p.length; j++) {
						if(p[j].content.equals(m.group(1))) {
							p[j].in.add(i);
						}
					}
			}
		}
		double max = 0.0;
		int index = 0;
		for(int i=0; i<p.length; i++) {
			double score = 0.0;
			for(int j=0; j<p[i].in.size(); j++) {
				double v = (double)p[p[i].in.get(j)].out;
				if(v != 0.0) {
					score+=(double)p[p[i].in.get(j)].basic/v;
				}
			}
			score += p[i].basic;
			if(score > max) {
				max = score;
				index = i;
			}
		}
		return index;
	}
}

