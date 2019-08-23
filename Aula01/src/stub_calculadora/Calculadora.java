package stub_calculadora;

public class Calculadora implements CalculadoraCaracteristica {	
	@override
	public int subtrair(int a, int b) {
		if(a == 20 && b == 10)	return 10;
		if(a == 10 && b == 1)	return 9;
		if(a == 15 && b == 8)	return 7;
		if(a == 10 && b == 5)	return 5;
		else return 0;
	}
}
