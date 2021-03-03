
/**
 * Escreva a descrição da classe Pessoa aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Pessoa
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome;
    private char sexo;
    private String dataNascimento;
    private String estadoCivil = "Solteiro";  // 1a forma de inicializar

    /**
     * COnstrutor para objetos da classe Pessoa
     */
    public Pessoa(String nome, char sexo, String data)
    {
        // inicializa variáveis de instância
        this.setNome(nome);
        this.setSexo(sexo);
        this.setDataNascimento(data);
        this.setEstadoCivil("Solteiro");  // 2a forma de inicializar
    }

    public String getNome(){
        return this.nome;
    }
    
    public char getSexo(){
        return this.sexo;
    }
    
    public String getDataNascimento(){
        return this.dataNascimento;
    }
    
    public String getEstadoCivil(){
        return this.estadoCivil;
    }
    
    public void setNome(String nome){
        if (nome != null && !nome.isEmpty()){
            this.nome = nome;
        }
    }
    
    public void setSexo(char sexo){
        if (sexo == 'M' || sexo == 'F' || sexo == 'X'){
            this.sexo = sexo;
        }
    }
    
    public void setDataNascimento(String data){
        this.dataNascimento = data;
    }
    
    public void setEstadoCivil(String estadoCivil){
        this.estadoCivil = estadoCivil;
    }
}
