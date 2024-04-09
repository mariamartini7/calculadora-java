public class Calculadora {

    public float forcaPeso(float peso, float massa){
        return peso * massa;
    }

    public float velocidadeMedia(float distanciaFinal, float distanciaInicial, short tempoFinal, short tempoInicial) {
        return (distanciaFinal - distanciaInicial) / (tempoFinal - tempoInicial);
    }

    public float Impulso(float forca, short tempoFinal, short tempoInicial){
        return forca * (tempoFinal - tempoInicial);
    }

    public forcatripeta(float massa, float raio, float Velocidade){
        return massa * (Velocidade * Velocidade) / raio;
    }

    public float mu(float distanciaFinal, float distanciaInicial, float Velocidade, short tempoFinal, short tempoInicial){
        return distanciaFinal * (distanciaInicial + Velocidade * (tempoFinal - tempoInicial));
    }

    public float mruv(float posicaoInicial, float Velocidade, float intervaloTempo, float aceleracao){
        return posicaoInicial + velocidade * (intervaloTempo + aceleracao * (intervaloTempo * intervaloTempo) / 2);
    }

    public float ForcaElastica(float constanteElasticaMola, float deformacaoMola){
        return constanteElasticaMola * deformacaoMola;
    }

    public float mu(float distanciaFinal, float distanciaInicial, float velocidade, double tempo){
        return 0;
    }
}