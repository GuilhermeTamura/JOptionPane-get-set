package view;

import javax.swing.JOptionPane;

import model.Aluno;

public class Cadastro {
	
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setNome(JOptionPane.showInputDialog("Digite o seu nome"));
		aluno.setEndereco(JOptionPane.showInputDialog("Digite o seu endereço"));
		aluno.setBairro(JOptionPane.showInputDialog("Digite o seu bairro"));
		aluno.setCep(Long.parseLong(JOptionPane.showInputDialog("Digite o seu Cep")));
		aluno.setCidade(JOptionPane.showInputDialog("Digite o seu cidade"));
		aluno.setEstado(JOptionPane.showInputDialog("Digite o seu estado"));
		
		System.out.println("Nome " + aluno.getNome());
		System.out.println("Endereço " + aluno.getEndereco());
		System.out.println("Bairro " + aluno.getBairro());
		System.out.println("CEP " + aluno.getCep());
		System.out.println("Cidade " + aluno.getCidade());
		System.out.println("Estado " +aluno.getEstado());
		

	}
}
