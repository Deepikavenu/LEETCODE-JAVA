public class Solution {
    public boolean isIsomorphic(String s, String t) {
       int a[]=new int[256];
       int b[]=new int[256];
       if(s.length()!=t.length())
        return false;
       for(int i=0;i<s.length();i++)
       {
        char ch=s.charAt(i);
        char th=t.charAt(i);
        if(a[ch]==0&&b[th]==0)
        {
            a[ch]=th;
            b[th]=ch;
        }
        else if(a[ch]!=th)
        {
        return false;
        }

       }
      return true;
    }
}