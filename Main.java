package ativi;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
    	JOptionPane.showMessageDialog(null,"Menu principal");
        String opt = JOptionPane.showInputDialog("1- Salvar\n2- Exibir todos\n3-Remover\n0-Parar");
        int op=Integer.parseInt(opt);
        EntradaDeDados ent = new EntradaDeDados();
        
        while(op!=0) {
        	if(opt.equals("1")){
        		opt = JOptionPane.showInputDialog("1- Aluno\n2- Professor");
                op=Integer.parseInt(opt);
                ent.entrada(op); 
            }
            else if(opt.equals("2")){
            	ent.busca();
            }
            else {
            	opt = JOptionPane.showInputDialog("Qual deseja remover ?");
            	op=Integer.parseInt(opt);
            	ent.remover(op);
            }
        	opt = JOptionPane.showInputDialog("1- Salvar\n2- Exibir todos\n3-Remover\n0-Parar");
            op=Integer.parseInt(opt);
        }
    }
    
}
