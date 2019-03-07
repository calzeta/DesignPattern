/**
 * The client is talking to a ConcreteSubject instance
 * through a proxy method.
 */
public class ProxyPatternExample {
    public static void main(String[] args) {
          System.out.println("***Proxy Pattern Demo***\n");
          Proxy px = new Proxy();
          px.doSomeWork();
    }
}