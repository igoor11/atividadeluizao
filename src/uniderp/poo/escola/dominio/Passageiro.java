package uniderp.poo.escola.dominio;

import java.time.LocalDate;

public class Passageiro extends BasePessoa{
    private String numeroCartao;
    private String documento;
    public String getNumeroCartao() {
        return numeroCartao;
    }
    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public Passageiro(int codigo, String usuario, String senha, String telefone, String email, String registro,
            String nome, LocalDate dataNascimento, String numeroCartao, String documento) {
        super(codigo, usuario, senha, telefone, email, registro, nome, dataNascimento);
        this.numeroCartao = numeroCartao;
        this.documento = documento;
    }
    
}
