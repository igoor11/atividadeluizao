package uniderp.poo.escola.dominio;

import java.time.LocalDate;

public class BasePessoa extends BaseCadastro{
    protected String nome;
    protected LocalDate dataNascimento;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public BasePessoa(int codigo, String usuario, String senha, String telefone, String email, String registro,
            String nome, LocalDate dataNascimento) {
        super(codigo, usuario, senha, telefone, email, registro);
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
    
    
}
