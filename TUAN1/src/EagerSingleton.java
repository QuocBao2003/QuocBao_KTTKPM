public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();
    public static EagerSingleton getInstance(){
        return instance;
    }
}
