package calculadora;

public class TesteCalculadora {
	
	public static void main(String[] args) {
		calculadora calc = new calculadora();
		
		//Teste rápidos
		calc.calc(2, 3,"+"); // esperado 05
		calc.calc(10, 4, "-"); // esperado 06
		calc.calc(3, 5, "*"); // esperado 15
		calc.calc(8, 2, "/"); // esperado 04
		calc.calc(8, 0, "/"); // divisão por zero
		calc.calc(5, 5, "*"); // operação invalida 
		
	}
}
