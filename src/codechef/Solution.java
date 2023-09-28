package codechef;
import java.util.*;
import java.io.*;

class Solution
{
    final static int MOD = (int)1e9+7;
    static class Swaraj
    {
        BufferedReader br;
        StringTokenizer st;

        Swaraj()
        {
            br=new BufferedReader(new InputStreamReader(System.in));
        }

        String next()
        {
            while(st==null || !st.hasMoreElements())
            {
                try
                {
                    st=new StringTokenizer(br.readLine());
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        String nextLine()
        {
            String s = new String();
            try
            {
                s=br.readLine();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
            return s;
        }

        int ni()
        {
            return Integer.parseInt(next());
        }
        long nl()
        {
            return Long.parseLong(next());
        }
        float nf()
        {
            return Float.parseFloat(next());
        }
        double nd()
        {
            return Double.parseDouble(next());
        }
        char nc()
        {
            return next().charAt(0);
        }
    }

    public static void main(String args[])throws IOException
    {
        Swaraj br = new Swaraj();
        StringBuilder ans = new StringBuilder();
        //int t = 1;
        int t = br.ni();
        while(t-- > 0)
        {
            int n = br.ni();
            String s = br.next();
            int c = 1;
            for(int i=0;i<n/2;i++)
                if(s.charAt(i)!=s.charAt(i+n/2))
                {
                    c = 0;
                    break;
                }
            ans.append(c==1? "YES\n": "NO\n");
        }
        System.out.println(ans);
    }
}