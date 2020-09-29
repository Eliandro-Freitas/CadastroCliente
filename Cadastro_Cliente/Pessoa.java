
package Cadastro_Cliente;

public class Pessoa {
    // Atributos da classe PESSOA
    private int id;
    private String nome;
    private String cpf;
    private String endereco;
    private String sexo;
    private String cidade;
    private String estado;
 // Ao criar um novo OBJETO tipo PESSOA, Obrigatoriamente tem que passar todos os atributos

    public Pessoa(int id, String nome, String cpf, String endereco, String sexo, String cidade, String estado) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.sexo = sexo;
        this.cidade = cidade;
        this.estado = estado;
    }
    

    public int getId() {
        return id;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    
}
