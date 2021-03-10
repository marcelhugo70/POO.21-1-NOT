
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

    public long fatorial() {
        long fatorial = 1;
        for(int i = this.getValor(); i > 1; i--) {
            fatorial *= i;
        }
        return fatorial;
    }

    public String divisoresInteiros(){
        String str = "Os divisores são "+this.x+", ";
        int qtde = 1;
        for(int i = this.getValor()/2; i > 1;i--){
            if(this.x%i == 0){
                str += i + ", ";
                qtde++;
            }
        }
        str += "1 e a quantidade é "+(qtde+1);
        return str;
    }

    public int[] fibonacci(){
        int[] vetor = new int[this.x]; // x elementos
        if (this.x > 0){
            vetor[0] = 1;
            if (this.x > 1) {
                vetor[1] = 1;
            }
        }
        for (int i=2; i < this.x; i++){
            vetor[i] = vetor[i-1] + vetor[i-2];
        }

        return vetor;
    }
}
