package ativi;

public class Pessoa {
	private int ra;
	private String nome;
	private int cpf;
    private int idade;
    private int siape;
    private String sexo;
    private boolean professor;
        
	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
        public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
    public int getSiape() {
		return siape;
	}
	public void setSiape(int siape) {
		this.siape = siape;
	}
    public boolean getProfessor() {
		return professor;
	}
	public void setProfessor(boolean professor) {
		this.professor = professor;
	}
}
