public class JAVA {
	public static void main(String[] args) {

		pompom3(2,3);
		pompom5(3,2);
		
//		pompom3(2,3); + pompom5(3,2);
		
		int hoge = pompom3(2,3);
		System.out.println(hoge);
		
		int hoge2 = pompom5(3,4);
		System.out.println(hoge2);
		
		System.out.println(hoge + hoge2);
		
		System.out.println(pompom3(2,3) + pompom5(3,2));
		

		System.out.println (p1("musashi","tae","sho"));
		
		System.out.println (5 == 5);
		System.out.println (5 == 4);
		
		int pop = pop(1,2,true);
		System.out.println(pop);
		
		int popy = pop;
		System.out.println(popy);
		
		System.out.println(popy * 9);
		
		int x = popy * 9;
		int y =3;
		System.out.println(pompom3(x,y));
		
		System.out.println (pooop(true,"musashi","taeko"));
		String pp = pooop(true,"musashi","taeko");
		System.out.println(pp);
	
		System.out.println (xx("musashi"));
		String taeko = xx("musashi");
		System.out.println(taeko);
		
		
	}
	
	public static String p1(String p2, String p3, String p4) {
		return (p2 + p3 + p4);
	}
	
//	public static void pompom2(int pom2) {
//		if (5 >= pom2) {
//			System.out.println(pom2 * 100);
//		}	else { 
//			System.out.println("0");
//		}
//	}
	
	public static int pompom3(int pom2, int pom3 ) {
			return (pom2 * pom3);
	}
	
	public static int pompom5(int pom2, int pom3 ) {
		int hoge = pom2 - pom3;
		return hoge;
		
}
	public static int pop(int first, int second, boolean isPlus) {
		if (isPlus) { return (first + second);} 
		return (first - second);
	}
	
	
	public static String pooop(boolean isFirst, String first, String second) {
		if (isFirst = true) {
			return first;
		}
		else {
			return second;
		}
	} 

		
	public static String xx(String a) {
		return (a + musashi());
	} 
	
    public static String musashi() {
		return "musashi";
	} 
	
	
	
	
		
}
class User {
	String name = "Me!";	
	void sayHi() {
		System.out.print("hi!");
	}
}

