
public class OperatorTest {

	public static void main(String[] args) {
		
		int a=56,b=35,c=76,x=10;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b); 
		System.out.println(a%b);    //Modulas operator
		
		System.out.println(a>b && b>c);  //And operotor
		System.out.println(a>b   ||  b>c);    //Or 
		System.out.println(a!=b);              // not equal operotor
		System.out.println(a==b);      //  Equality operator
		
		
		a+=5; // a=a+5;
		System.out.println(a);
		a-=5;//a=a-5;
		System.out.println(a);
		a*=2;//a=a*2;
		System.out.println(a);
		a/=4;//a=a/4;
		System.out.println(a);
		
		System.out.println(a & b); // bitwise and operotor
		System.out.println(a | b); // bitwise and operotor
		System.out.println(a>> b); // right shift   operotor
		System.out.println(a << b); // bitwise and operotor
		
		
		System.out.println(--x + --x + --x); // 9+8+7=24
		System.out.println(x-- + x-- + x--);    //10+9+8=27
		System.out.println(--x);
		System.out.println(++x);
		
		int  y=(20>30)?20:30;
		System.out.println(y);
		
		String s=(20<30)?"java":"c++";
		System.out.println(s);
	
	int	g=10,f=17;
		System.out.println(++g + --f  - f-- + ++g *  f--);
		
		
		
		
		
		
	}

}
