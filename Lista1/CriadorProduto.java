
/**
 * Escreva a descrição da classe CriadorProduto aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class CriadorProduto
{
    public void criarProdutos(){
        Produto produto1 = new Produto("Caderno", "Caderno em espiral tamanho médio",
                                        4.5F , 15);
        Produto produto2 = new Produto("Caneta ESF", "Caneta esferográfica 5mm",(float)1.2, 2);

        Produto produto3 = new Produto();
        produto3.setNome("Esquadro");
        produto3.setDescricao("Esquadro de acrílico 20 cm");
        produto3.setPreco(2.35f);
        produto3.setDesconto(10);
    }
}
