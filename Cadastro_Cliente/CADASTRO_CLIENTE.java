
package Cadastro_Cliente;

public class CADASTRO_CLIENTE {

    public static void main(String[] args) {
        new UISplash().setVisible(true);
        UICadastro_Cliente FormularioCadastro = new UICadastro_Cliente();
        Pessoa cliente = new Pessoa(1, FormularioCadastro.nome, FormularioCadastro.cpf, FormularioCadastro.endereco, "Masculino",
        FormularioCadastro.cidade, FormularioCadastro.estado);
          
    }
    
}
