
/**
 * Escreva a descrição da classe InteiroPositivo aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class InteiroPositivo
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int x;

    public void setValor(int valor){
        if (valor >= 0){
            this.x = valor;
        }
    }

    public int multiplica(InteiroPositivo outro){
        return this.x * outro.getValor();
    }
    
    public int getValor(){
        return this.x;
    }
    
    public long fatorial(){
        // calcular o fatorial do x
        return 0;
    }
}
