class test
{
    public static void main()
    {
        String s;
        s="jU5t_a_sna_3lpm16g346_u_4_mer349";
        char a[]=new char[32];
        int i;
        for (i=0; i<8; i++) {
            a[i] = s.charAt(i);
        }
        for (; i<16; i++) {
            a[i] = s.charAt(23-i);
        }
        for (; i<32; i+=2) {
            a[i] = s.charAt(46-i);
        }
        for (i=31; i>=17; i-=2) {
            a[i] = s.charAt(i);
        }
        for(int j=0;j<32;j++)
        {
            System.out.print(a[j]);
        }
    }
}

