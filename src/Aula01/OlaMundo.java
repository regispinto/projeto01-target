package Aula01;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class OlaMundo {

	public static void main(String[] args) {
		/*
		Double wrapper = 2.0;
		double primitivo = 2.0;
				
		minhaString1 = minhaString1.substring(8);
				
		byte b = 1;
		
		wrapper = (double) b;

		System.out.println("Ol� Mundo");
		
		System.out.println(wrapper);
		System.out.println(primitivo);
		
		//System.out.println(minhaString1.substring(2));
		//System.out.println(minhaString1.concat(" Trust"));
		
		String minhaString1 = "Target\fTrust";
		
		Boolean meuBoleano = false;
		
	    Integer minhaIdade = 18;   
		
		int codigoPedigree = 122322;
		float pesoAnimal = 50.5f;
		double precoAnimal = 1800.50d;
		short alturaAnimal = 95;
		long comprimentoAnimal = 120;
		byte idadeAnibal = 127;
		boolean temDono = true;
		char letraInicialAnimal = 'D';
				
		System.out.println(codigoPedigree);
		System.out.println(pesoAnimal);
		System.out.println(precoAnimal);
		System.out.println(alturaAnimal);
		System.out.println(comprimentoAnimal);
		System.out.println(idadeAnibal);
		System.out.println(temDono);
		System.out.println(letraInicialAnimal);		
		
		BigDecimal valorCheio = new BigDecimal("150.97");
		
		BigDecimal dezPorcentDoValor = valorCheio.multiply(new BigDecimal("0.1"));
		
		System.out.println(dezPorcentDoValor.setScale(2, RoundingMode.HALF_EVEN));
		
		System.out.println(meuBoleano);
		
		System.out.println(!meuBoleano);
		
		System.out.println(Double.valueOf(minhaIdade));
		
		System.out.println(minhaString1);
		
		System.out.println("Teste de commit 123"   );
		*/
		OlaMundo om = new OlaMundo();

		double r = om.Soma(10d, 10d);
		
		System.out.println(r);
	}
	
	public Double Soma(Double N1, Double N2) {
		return N1 + N2;
		
	}
}
