class Solution {
    public String reverseWords(String s) {
        String str[] = s.trim().split("\\s+");
        String ans[] = new String[str.length];
        int i=0;
        for(int j=str.length-1;j>=0;j--)
        {
            ans[i++]=str[j];
        }
    return String.join(" ",ans);
    //return String.join(" ", ans);
    }
}
