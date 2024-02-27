package controller;

public class VetorController {
	public VetorController() {
		// TODO Auto-generated constructor stub
	}
	
	public int qtdPares(int[] vetor, int tamanho) {
		
		if(tamanho<=0)
			return 0;
		
		if(vetor[tamanho-1] % 2 == 0)
			return 1 + qtdPares(vetor, --tamanho);
		
		return qtdPares(vetor, --tamanho);

	}
	
	//retorna true caso não tenha 0 e numeros negativos
	public boolean validarNaturais(int[] vetor, int tamanho) {
		
		if(tamanho==0)
			return true;
		
		if(vetor[tamanho-1] <= 0)
			return false;
		
		return validarNaturais(vetor, --tamanho);

	}
}
