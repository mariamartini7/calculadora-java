import java.lang.math;

public class ContaFisica {
    //Atributos

    public float forcaPeso(float peso, float massa){
        return peso * massa;
    }

    public float velocidadeMedia(float distanciaFinal, float distanciaInicial, short tempoFinal, short tempoInicial){
        return distanciaFinal - distanciaInicial / tempoFinal - tempoInicial;
    }

    public float Impulso(float forca, short tempoFinal, short tempoInicial){
        return forca * (tempoFinal - tempoInicial);
    }

    public float mru(float velocidade, float aceleracao, float tempo){
        return velocidade * tempo + aceleracao * tempo * tempo / 2;
    }

    public float forcatripeta(float massa, float Velocidade, float raio){
        return massa * (Velocidade * Velocidade) / raio;
    }

    public float mruv(float posicaoInicial, float velocidade, float intervaloTempo, float aceleracao){
        return posicaoInicial + velocidade * (intervaloTempo + aceleracao * (intervaloTempo * intervaloTempo) / 2);
    }

    public float ForcaElastica(float constanteElasticaMola, float deformacaoMola){
        return constanteElasticaMola * deformacaoMola;
    }
}