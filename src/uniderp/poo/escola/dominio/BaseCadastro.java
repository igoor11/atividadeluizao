package uniderp.poo.escola.dominio;

public class BaseCadastro extends BaseIdentificador{
    protected String usuario;
    protected String senha;
    protected String telefone;
    protected String email;
    protected String registro;
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
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
    public String getRegistro() {
        return registro;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public BaseCadastro(int codigo, String usuario, String senha, String telefone, String email, String registro) {
        super(codigo);
        this.usuario = usuario;
        this.senha = senha;
        this.telefone = telefone;
        this.email = email;
        this.registro = registro;
    }
    

    
}
