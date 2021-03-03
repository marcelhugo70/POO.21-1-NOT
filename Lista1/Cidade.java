
/**
 * Escreva a descrição da classe Cidade aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Cidade{

    private String nome;
    private boolean calculado;
    private String uf;
    private int populacaoMasculina;
    private int populacaoFeminina;

    public Cidade(String nome, int populacaoMasculina, int populacaoFeminina){
        this.setNome(nome);
        this.setPopulacaoMasculina(populacaoMasculina);
        this.setPopulacaoFeminina(populacaoFeminina);
    }


    public Cidade(){

    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setCalculado(boolean calculado){
        this.calculado = calculado;
    }

    public boolean getCalculado(){
        return this.calculado;
    }

    public void setUf(String mf){
        this.uf = uf;
    } 

    public String getUf(){
        return this.uf;
    } 

    public void setPopulacaoMasculina(int populacaoMasculina){ 
        this.populacaoMasculina = populacaoMasculina;
    } 

    public int getPopulacaoMasculina(){ 
        return this.populacaoMasculina;
    } 

    public void setPopulacaoFeminina(int populacaoFeminina){ 
        this.populacaoFeminina = populacaoFeminina;
    } 
} 
