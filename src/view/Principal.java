package view;

import controller.VetorController;

public class Principal {

	public static void main(String[] args) {

		VetorController vController = new VetorController();
		int[] vetor = {6, 1, 2, 3, 4, 5};
		int tam = vetor.length;
		
		int res = vController.validarNaturais(vetor, tam) ? vController.qtdPares(vetor, tam) : -1;
		
		System.out.println(res);
	}

}
