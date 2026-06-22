//NUNCA ESQUEÇA: CLASSE COMEÇA COM LETRA MAIUSCULA!! NÃO ERRE DA PRÓXIMA VEZ
public class funcionario {
private String nomeFuncionario;
private int cpf;
private int idadeFuncionario;
private int numTelefone;

//construtor vazio
public funcionario() {
}

//getters e setters
public String getNomeFuncionario() {
    return nomeFuncionario;
}
public void setNomeFuncionario(String nomeFuncionario) {
    this.nomeFuncionario = nomeFuncionario;
}
public int getCpf() {
    return cpf;
}
public void setCpf(int cpf) {
    this.cpf = cpf;
}
public int getIdadeFuncionario() {
    return idadeFuncionario;
}
public void setIdadeFuncionario(int idadeFuncionario) {
    this.idadeFuncionario = idadeFuncionario;
}
public int getNumTelefone() {
    return numTelefone;
}
public void setNumTelefone(int numTelefone) {
    this.numTelefone = numTelefone;
}


}
