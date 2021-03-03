
/**
 * Escreva a descrição da classe Produto aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Produto
{
// variáveis de instância - substitua o exemplo abaixo pelo seu próprio
private String nome;
private String desc;
private float preco;
private int desconto;



/**
* COnstrutor para objetos da classe Produto
*/
public Produto(String nome, String desc, float preco, int desconto)
{
// inicializa variáveis de instância
this.setNome(nome);
this.setDescricao(desc);
this.setPreco(preco);
this.setDesconto(desconto);
}

public Produto(){
}

public String getNome() {
return this.nome;
}
public String getDescricao() {
return this.desc;
}
public float getPreco() {
return this.preco;
}
public int getDesconto() {
return this.desconto;
}

public void setNome(String nome) {
this.nome = nome;
}
public void setDescricao(String desc) {
this.desc = desc;
}
public void setPreco(float preco) {
this.preco = preco;
}
public void setDesconto(int desconto) {
this.desconto = desconto;
}
}
