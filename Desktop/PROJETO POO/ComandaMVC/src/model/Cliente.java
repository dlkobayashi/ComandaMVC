
package model;

/**
 *
 * @author Kobayashi
 */
public class Cliente {
    
    private String documento;
    private String nome;
    private String dtNascimento;
    private String telefone;
    private String email;
    private String sexo;
    private int idade;


    
    public Cliente(String documento, String nome, String dtNascimento, String telefone, String email, String sexo, int idade) {
        this.documento = documento;
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.telefone = telefone;
        this.email = email;
        this.sexo = sexo;
        this.idade = idade;
    }
    
    public Cliente() {
        
    }


    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    
    
    
}
