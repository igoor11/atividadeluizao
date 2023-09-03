package uniderp.poo.escola.dominio;

import java.time.LocalDate;

public class Funcionario extends BasePessoa{
    private String contaCorrente;
    private String cracha;
    public String getContaCorrente() {
        return contaCorrente;
    }
    public void setContaCorrente(String contaCorrente) {
        this.contaCorrente = contaCorrente;
    }
    public String getCracha() {
        return cracha;
    }
    public void setCracha(String cracha) {
        this.cracha = cracha;
    }
    public Funcionario(int codigo, String usuario, String senha, String telefone, String email, String registro,
            String nome, LocalDate dataNascimento, String contaCorrente, String cracha) {
        super(codigo, usuario, senha, telefone, email, registro, nome, dataNascimento);
        this.contaCorrente = contaCorrente;
        this.cracha = cracha;
    }
    
}
