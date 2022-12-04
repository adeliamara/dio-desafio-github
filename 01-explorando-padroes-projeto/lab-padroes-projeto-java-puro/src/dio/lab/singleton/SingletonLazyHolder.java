package dio.lab.singleton;


/**
 * Singleton "Lazy Holder" é o singleton com encapsulamento da instancia.
 *
 * @see <a href="https://stackoverflow.com/a/a24018148">Referencia</a>
 */
public class SingletonLazyHolder {
    //INNER CLASS para encapsultar a instancia
    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instancia;
    }
}

