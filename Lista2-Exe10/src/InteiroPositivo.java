
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
    	return this.fatorial(this.getValor());
    }

    private long fatorial(int numero) {
        long fatorial = 1;
        for(int i = numero; i > 1; i--) {
            fatorial *= i;
        }
        return fatorial;
    }
    
    public String divisoresInteiros(){
        String str = "Os divisores s�o ";
        int qtde = 0;
        for(int i = 1; i <= this.getValor()/2;i++){
            if(this.x%i == 0){
                str += i + ", ";
                qtde++;
            }
        }
        str += this.x+" e a quantidade de divisores � "+(qtde+1);
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
    
    public double valorH(){
    	double h = 0;
    	for (int d=1; d<= this.x; d++) {
    		h = h + 1.0/d;   //double/int -> double
    	}
    	return h; 
    }
    
    public double valorI() {
    	double i = 0;
    	for (double num=1, den=this.x; num <= this.x; num++, den--) {
    		i = i + num/den;
    	}
    	return i;
    }
    
    public double valorP() {
    	double p = 0;
    	double den;
    	boolean somar = true;
    	for (int num = 1; num <= this.x; num++) {
    		den = this.fatorial(num*2);
    		if (somar) {
    			p = p + num/den;
    		}
    		else {
    			p = p - num/den;    			
    		}
    		somar = !somar;
    	}
    	return p;
    }
    
}
