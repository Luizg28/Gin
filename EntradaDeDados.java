package ativi;
import javax.swing.JOptionPane;

public class EntradaDeDados {
    DAO dao = new DAO();
    public void entrada(int op){
        Pessoa pessoa = new Pessoa();
        String td = JOptionPane.showInputDialog("Entre com RA: ");
        pessoa.setRa(Integer.parseInt(td));
        td = JOptionPane.showInputDialog("Entre com Nome: ");
        pessoa.setNome(td);
        td = JOptionPane.showInputDialog("Entre com CPF: ");
        pessoa.setCpf(Integer.parseInt(td));
        td = JOptionPane.showInputDialog("Entre com Idade: ");
        pessoa.setIdade(Integer.parseInt(td));
        td = JOptionPane.showInputDialog("Entre com Siape: ");
        pessoa.setSiape(Integer.parseInt(td));
        td = JOptionPane.showInputDialog("Entre com Sexo: ");
        pessoa.setSexo(td);
        if(op == 1) {
        	pessoa.setProfessor(false);
        }
        else {
        	pessoa.setProfessor(true);
        }
        
        dao.salvar(pessoa);
    }
    public void busca() {
    	dao.buscar();
    }
    public void remover(int op) {
    	dao.remove(op);
    }
}
