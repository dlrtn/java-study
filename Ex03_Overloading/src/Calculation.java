
// 클래스에 같은 이름의 메서드가 여러 개 존재
class Calc {
	int add(int a, int b) {
		return a + b;
	}
	
	int add(int a) {
		return a + 1;
	}
	
	double add(double a, double b) {
		return a + b;
	}
}

public class Calculation {

	public static void main(String[] args) {
		Calc calc = new Calc();
		// 메서드 호출
		int nReturn1 = calc.add(3, 9);
		int nReturn2 = calc.add(3);
		double nReturn3 = calc.add(3.0, 9.0);
		
		System.out.println("Return1 : " + nReturn1);
		System.out.println("Return2 : " + nReturn2);
		System.out.println("Return3 : " + nReturn3);		
	}

}

//오버로딩이란 하나의 클래스 내에 인수의 갯수나 형이 다른
//동일한 이름의 메서드를 여러 개 정의하는 것
