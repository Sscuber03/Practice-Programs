import java.util.*;
class Complex
{
    double real,imag;
    Complex(double real,double imag)
    {
        this.real=real;
        this.imag=imag;
    }

    public void display()
    {
        System.out.println(real+" "+imag+"i");
    }

    Complex add(Complex n1, Complex n2)
    {
        Complex t=new Complex(0.0,0.0);
        t.real=n1.real+n2.real;
        t.imag=n1.imag+n2.imag;
        return t;
    }

    public static void main()
    {
        Complex n1=new Complex(2.3,4.5);
        Complex n2=new Complex(3.4,5.0);
        Complex temp=new Complex(0.0,0.0);
        temp=temp.add(n1,n2);
        temp.display();
    }
}
