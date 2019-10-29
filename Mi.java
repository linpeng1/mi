
public class Mi {
	public static void main(String[] args) {
		char[] s1 = getResult("ammimiib","mi");
		System.out.println(s1);
	}
	
	public static char[] getResult(String str,String delSubStr){
		char[] s1 = str.toCharArray();
		char[] s2 = delSubStr.toCharArray();
		int i = 0;
		int j = 0;
		int count = 0;
		while (i < s1.length) {
			if (count >= s2.length && count > 0) {
				j = i - count;
				while (i < s1.length) {
					s1[j++] = s1[i++];
				}
				while(j< s1.length){
					s1[j++] = 0;
				}
				i = 0;
				count = 0;
				continue;
			}
			if (s1[i] == s2[count]) {
				count++;
			} else if (s1[i] == s2[0]) {
				count = 1;
			} else {
				count = 0;
			}
			i++;
		}
		if (count >= s2.length && count > 0) {
			s1[i - count] = 0;
		}
		System.out.println(1);
		return s1;
	}

}
