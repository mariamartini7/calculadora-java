public class App {
    public static void main(String[] args) throws Exception {
        Calculadora calculadora = new Calculadora();

        //Força peso
        float peso = 10f;

        float massa = 10f;

        float resultado = calculadora.forcaPeso(peso, massa);

        //Velocidade média
        float distanciaFinal = 300;
        float distanciaInicial = 0f;
        short tempoFinal = 12;
        short tempoInicial = 7;
            resultado = calculadora.velocidadeMedia(distanciaFinal, distanciaInicial, tempoFinal, tempoInicial);

        //Impulso
        float forca = 20f;
        tempoFinal = 8;
        tempoInicial = 4;
            resultado = calculadora.Impulso(forca, tempoFinal, tempoInicial);

        //Mruv
        float Velocidade = 20;
        float intervaloTempo = 30;
        float aceleracao = 50;
        float posicaoInicial = 55;
            resultado = calculadora.mruv(posicaoInicial, Velocidade, intervaloTempo, aceleracao);

        //Forca centripeta
        massa = 800;
        float raio - 100;
        Velocidade = 20;
            resultado = calculadora.forcatripeta(massa, raio, Velocidade);

        //MU
        distanciaFinal = 2;
        distanciaInicial = 0;
        Velocidade= 340;
        double tempo = 2.5;
            resultado = calculadora.mu(distanciaFinal, distanciaInicial, Velocidade, tempo);

        //Forca elastica
        float deformacaoMola = 40;
        float constanteElasticaMola = 30;
            resultado = calculadora.ForcaElastica(constanteElasticaMola, deformacaoMola);

        System.out.println(resultado);
    }
}