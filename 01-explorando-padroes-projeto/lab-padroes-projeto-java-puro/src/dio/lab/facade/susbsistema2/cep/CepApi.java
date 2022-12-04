package dio.lab.facade.susbsistema2.cep;

import dio.lab.singleton.SingletonEager;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "cidadeteste";
    }

    public String recuperarEstado(String cep){
        return "Piaui";
    }


}
