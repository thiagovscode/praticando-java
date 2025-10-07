package variaveisetipos;

public class ExercicioViagem {

    private double consumoMedio; // O carro faz 12,5 km por litro
    private double capacidadeTanque; // O tanque tem capacidade para 50 litros
    private double combustivelAtual; // Há 20 litros disponíveis
    private double distanciaViagem; // A viagem planejada tem 200 km



    public double getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public double getCombustivelAtual() {
        return combustivelAtual;
    }

    public void setCombustivelAtual(double combustivelAtual) {
        this.combustivelAtual = combustivelAtual;
    }

    public double getDistanciaViagem() {
        return distanciaViagem;
    }

    public void setDistanciaViagem(double distanciaViagem) {
        this.distanciaViagem = distanciaViagem;
    }


    private double capacidadeMaxima(){

         return consumoMedio * capacidadeTanque;

    }

    private double capacidadeAtual(){

        return consumoMedio * combustivelAtual;

    }

    private String verificaViagem(){
       double valor;
        valor = capacidadeAtual();

        return (valor >= distanciaViagem) ? "Você conseguirá completar a viagem sem precisar abastecer. "
                : "Você  precisara abastecer para completar a viagem.";

    }

    
     public void resumoImprimir(){

         System.out.println("Autonomia máxima do veículo: " + capacidadeMaxima());
         System.out.println("Autonomia atual: " + capacidadeAtual());
         System.out.println(verificaViagem());


     }


}
