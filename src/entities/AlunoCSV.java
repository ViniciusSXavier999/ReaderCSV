package entities;

public class AlunoCSV {
	
	private String nome;
	private Integer idade;
	private String sexo;
	
	public AlunoCSV() {
		
	}

	public AlunoCSV(String nome, Integer idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	
	// Vai ser utilizado para imprimir os dados na tela 
	@Override
	public String toString() {
		return "ALUNO -> [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}
	
	
	
	
	

}
