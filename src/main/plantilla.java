package main;

public class plantilla {

	public static void main(String[] args) {
		//p1();
		//p2();
		//p3();
		//p4();
		//p5();
		//p6();
		//p7();
		//p8();
		//p9();
		//p10();
		//skipped p11();
		//p12();
		//p13();
		//p14();
	}

	public static void p1() {
		Boolean x = true;
		Boolean y = false;
		System.out.println(x || y); 
		System.out.println(x && y);
	}
	public static void p2() {
		int x= 7;
		System.out.println(x == 25);
	}
	public static void p3() {
		int x = 25;
		int y = 77;
		System.out.print(x!=y);
	}
	public static void p4() {
		int a=4, b=5, c=6, d=7, e=8, f=9;
		System.out.print(( a + b - c * ( d / e )) * f  );
	}
	public static void p5() {
		float x = 23.5f;
		//int y = x;
	}
	public static void p6() {
		float x = 23.5f;
		int y = (int)x;
	}
	public static void p7() {
		int x = 23;
		float y = x;
	}
	public static void p8() {
		int x = 23 ;
		float y = (float)x;
	}
	public static void p9() {
		double x = 23.5f;
	}
	public static void p10() {
		
		//a
		int a,b;
		a=10; b=15;
		a=b+3+5*b;
		b=a-b*2;
		a=a+b;
		System.out.println(a+" "+b);
		
		//b
		a=10; b=11;
		a=b/4%3;
		b=2+a*3/2+1;
		System.out.println(a+" "+b);
		
		//c
		int c;
		a=5; b=6;
		a=2+b-a*2/4;
		b=a+2*b+1;
		c=a%b+b%a+a/b+b/a;
		System.out.println(c);
		
		//d
		double aa,bb;
		aa=30.0; bb=10.5;
		aa=aa+10.0/3 + (bb-1/2.0);
		bb=-bb;
		System.out.println(aa+" "+bb);
		
		//e
		aa=30.0; bb=10.5;
		aa=aa+10/3+(bb-1/2);
		bb=-bb;
		System.out.println(aa+" "+bb);
		
		//f
		int e,f;
		e =-1+2*3/4%5;
		f=-(1+(2*(3/(4%5))));
		System.out.println(e+" "+f);
		
		//g
		boolean m,n;
		m= true && false || true && !false;
		n= m && true && (false||true) && !(true || false);
		m= !n || !m && !(m&&!n);
		n= true || m && !(false && n);
		System.out.println(m+" "+n);
		
		//h
		e= -(12+4/3*5);
		f= -(12+4/(3*5));
		e= e+10*4-3/2;
		f=(e+10)*(4-3)/2;
		System.out.println(e+" "+f);
		
		//i
		a=12+7/3;
		b=13-7%3;
		m=a-b<b-a;
		n=a+2> b-2;
		m=a+b!=25+4%3;
		n=(a<4 || b<19)& !m;
		System.out.println(m+" "+n);
		
		//j
		char cc='a';
		a=12;
		boolean res;
		res = c!='c' && 'b'>=c; 
		res=res==!true||a%5>=a%4;
		System.out.println(res);
		
		//k
		char car1, car2, car3; boolean bu;
		car1='b'; car2='3'; car3='F';
		bu = (car1>car2) && (car3 !=car1);
		bu= bu && !(car3<=car2);
		System.out.println(bu);		
	}
	public static void p11() {
		//skip
	}
	public static void p12() {
		int i1,i2; double d1,d2; char c1,c2; boolean b1,b2;
		i1= 1-2+23/4%3*3;
		i2= 2*7%5/8+1*3;
		d1= 3.0 + 2.5+5.0/2.0;
		d2= i1/2+12/2.0 +1;
		c1='A';
		c2='Z';
		b1= c1==c2|| c1> 'T' && c2<='K';
		b2=false|| true&&false!=false&&true;
		System.out.println(i1+" "+i2);
		System.out.println(d1+" "+d2);
		System.out.println(b1+" "+b2);
}
	public static void p13() {
		int prEnt, sgEnt; double prDoub, sgDoub; boolean prBool, sgBool; char ch;
		prEnt= 17;
		sgEnt= prEnt % 9/3;
		prEnt = sgEnt + sgEnt * prEnt/3;
		
		prDoub =24/6*2+1;
		sgDoub =(prDoub -1.0)/16;
		
		ch='A';
		prBool=ch!='A'==ch<'Z';
		sgBool=(prBool &&true) || (prBool==true || !prBool);
		System.out.println(prEnt+" "+sgEnt);
		System.out.println(prDoub+" "+sgDoub);
		System.out.println(prBool+" "+sgBool);
		
			
	}
	public static void p14() {
		int i,j; char c; double d; boolean b1,b2;
		i=10+3/2;
		j=i%2*4;
		c='a';
		d= 10.0/j-1;
		b1= c<'c' && i<j != true;
		b2= !b1 || false || !true || b1==false;
		System.out.println("i= "+i);
		System.out.println("j= "+j);
		System.out.println("d= "+d);
		System.out.println("b1= "+b1);
		System.out.println("b2= "+b2);
	}
}
