class User {
	String name = "Me!";//フィールド
			
	void sayHi() {
		System.out.println("hi!");
	}
}

public class JAVA2 {
	public static void main(String[] args) {
	
	Dobutu taeko = new Dobutu();
	taeko.kougeki(5);
	System.out.println(taeko.kougeki);
	taeko.taijyu(58);
	System.out.println(taeko.taijyu);
	
	Dobutu musashi = new Dobutu();
	musashi.kougeki(100);
	System.out.println(musashi.kougeki);
	musashi.taijyu(4);
	System.out.println(musashi.taijyu);		

	
	
	}
}
class Dobutu{
	int asi = 0;
	int te = 0;
	int sipo =0;
	
	int taijyu =0;
	int shincho =0;
	int hayasa =0;
	int tairyoku =0;
	int kougeki =0;
	int tkougeki =0;
	int mkougeki =0;

	String ashiiro ="mu";
	String iroro ="nu";
	
	
	public void ashi(int h,String iro) {
		asi = h;
		ashiiro = "iro";
	}
	public int te(int m) {
		return te = m;
	}
	public void shippo(int k,String iroo) {
		sipo = k;
		iroro = "iroo";
	}
	public int taijyu(int t) {
		return taijyu = t;
	}
	public int shincho(int s){
		return shincho = s;
	}	
	public int hayasa(int y){
		return hayasa =y;
	}
	public int tairyoku(int r) {
		return tairyoku =r;
	}
	public int kougeki(int g) {
		return kougeki =g;
	}
	public int tkougeki(int tk) {
		return tkougeki=tk;
	}
	public int mkougeki(int mk) {
		return mkougeki=mk;
	}
}

class Nomimono{
	String aji = "mumi";
	int size =0;
	
	public String ajihen(String aji2) {
		//味変。ajiをaji2にする。
		return aji = aji2;
	}
	public int size(int s){
		//サイズを入力すると、サイズが出てくる。
		return size = s;
	} 
}

class Cup{

	int mizu = 0;
	int sokudo = 0;
	
	public void sosogu(int L) {
		//水をmizuにint L注ぐ。mizu+L
		mizu = mizu + L;
	}
	
	public int mazeru(int s) {
		return sokudo = s;
	}
	
	public void tomaru(String t) {
		//止まれと言われたら止まる。sokudoが０になる。
		//引数にtomareが入ると、sokudoが０になる。t = "tomare";
		if (t == "tomare") {
			sokudo = 0;
		}	
		
	}
	public void nomu(int L) {
		//水をL飲む。mizu-L
		mizu = mizu - L;
		
		
		
	}
	
}

	

