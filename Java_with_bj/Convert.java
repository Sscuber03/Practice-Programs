class Convert
{ //Starting class
    public static void main(String args[])
    { //Starting main method
        int a=(int)(Math.random()*(200-100))+100;//Generating a random number
        int c=0,c1,c2,c3,d=0,e=0,f=0;
        c1=c2=c3=a;//Initializing variables with user inputed values
        long x=0;//variable for Binary value
        int y=0;//variable for Octal value
        String z="";//variable for Hexadecimal value
        while(c1>0)//loop to convert Decimal to Binary
        {
            d=c1%2;
            c1/=2;
            x+=Math.pow(10,c)*d;
            c++;
        }
        c=0;
        while(c2>0)//loop to convert Decimal to Octal
        {
            e=c2%8;
            c2/=8;
            y+=Math.pow(10,c)*e;
            c++;
        }
        while(c3>0)//loop to convert Decimal to Hexadecimal
        {
            f=c3%16;
            c3/=16;
            if(f<10)
                z=Integer.toString(f)+z;
            else
                z=(char)(f+55)+z;
        }
        System.out.println("Generated number :"+a);//Printing out
        System.out.println("Equivalent Binary form :"+x);
        System.out.println("Equivalent Octal form :"+y);
        System.out.println("Equivalent Hexadecimal form :"+z);
    }//End of main
}//End of class

            