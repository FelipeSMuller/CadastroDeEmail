package Strings;

import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {

		/*
		 * Validar E-mail: Implemente um programa que verifique se uma string contém um
		 * endereço de e-mail válido, seguindo as regras comuns de formatação de e-mail.
		 */

		boolean emailValido = false;
		String emailFornecido;

		do {
			emailFornecido = JOptionPane.showInputDialog(null,
					"Digite o seu email, o programa  irá verificar se é válido \nCaso esteja apto será cadastrado");

			emailFornecido = emailFornecido.toLowerCase();

			if (emailFornecido.contains("@") && emailFornecido.contains(".com")) {
				JOptionPane.showMessageDialog(null,
						"O seu email está dentro dos parametros, CADASTRO FEITO COM SUCESSO!!!");

				emailValido = true;
				
				break;
			} else {
				JOptionPane.showMessageDialog(null, "O seu email  não está dentro dos parametros, Insira outro");

			}

		} while (emailValido == false);

	}

}
