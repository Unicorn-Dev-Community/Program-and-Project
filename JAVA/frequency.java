public class frequency {
    public static void main(String aa[])
    {
        String s="malayalam";
        int i,j;
        int freq[]=new int[s.length()];
        char str[]=s.toCharArray(); 
        for(i=0;i<s.length();i++)
        {
            freq[i]=1;
            for(j=i+1;j<s.length();j++)
            {
                if(str[i]==str[j])
                {
                    freq[i]++;
                    str[j]=0;
                }
            }
        }
        for(i=0;i<s.length();i++)
        {
            System.out.println(str[i]+"-"+freq[i]);
        }
    }
}
