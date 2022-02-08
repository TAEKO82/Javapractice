package sample;
public class MyTools {
	
	double myBmi = MyTools.bmi(62.3,1.71);
	
	public static double bmi(double weight, double height) {
		double value = weight / Math.pow(weight, 2);
		return value;
	} System.out.println(bmi.value);
//	
//	定義：int calconv(String nengo, int wareki)
//	機能：年号と和暦年から西暦年を計算して返す。
//	引数：nengo（年号：S,H,R）、wareki（和暦年）
//	戻り値：西暦年。年号の指定間違いでは、和暦をそのまま返す。
	
	
	public static int calconv(String nengo, int wareki) {
		int seireki = switch(nengo) {
		case "S","s"-> wareki +1925;
		case "H","h"-> wareki +1988;
		case "R","r"-> wareki +2018;
		default -> wareki;
		};
		return seireki;
	}
	
}