class Accenture_Practice_1 {
    public static void main(String[] args) {
        String s = "1C0C1C1A0B1";
        int res = s.charAt(0)- 0;
        for(int i =1;i<s.length();i++)
        {
            char prev = s.charAt(i);
            i++;
            if (prev == 'A')
            {
	         res = res & (s.charAt (i) - '0');
            }
	        else if (prev == 'B')
            {
	          res = res | (s.charAt (i) - '0');
            }
	        else
            {
	          res = res ^ (s.charAt (i) - '0');
            }
        }
        System.out.println(res);
    }
}
