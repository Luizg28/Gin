package ativi;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;


public class DAO {
     List<Pessoa> listaDePessoas = new ArrayList<>();
    public void salvar(Pessoa pessoa){
        
        listaDePessoas.add(pessoa);
    }
    public void buscar() {
    	for(int i=0;i<listaDePessoas.size();i++){
    		if(listaDePessoas.get(i).getProfessor() == true) {
    			JOptionPane.showMessageDialog(null, "Professor: "+"\n"+listaDePessoas.get(i).getRa()+"\n"+listaDePessoas.get(i).getNome()+"\n"+listaDePessoas.get(i).getCpf()+"\n"+listaDePessoas.get(i).getIdade()+"\n"+listaDePessoas.get(i).getSiape()+"\n"+listaDePessoas.get(i).getSexo());   
    		} 
    		else {
    			JOptionPane.showMessageDialog(null, "Aluno: "+"\n"+listaDePessoas.get(i).getRa()+"\n"+listaDePessoas.get(i).getNome()+"\n"+listaDePessoas.get(i).getCpf()+"\n"+listaDePessoas.get(i).getIdade()+"\n"+listaDePessoas.get(i).getSiape()+"\n"+listaDePessoas.get(i).getSexo());
    		}
    	}
    }
	public void remove(int op) {
		 listaDePessoas.remove(op);
	}
}
