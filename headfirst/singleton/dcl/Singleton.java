
package headfirst.singleton.dcl;

//
// Danger!  This implementation of Singleton not
// guaranteed to work prior to Java 5
//

public class Singleton {
    private volatile static Singleton uniqueInstance;
    private static int numCalled=0;
 
    private Singleton() {}

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        System.out.println("numCalled: "+numCalled++);
        return uniqueInstance;
    }
}




In [ ]:



# %load ./src/headfirst/singleton/dcl/SingletonClient.java
package headfirst.singleton.dcl;

public class SingletonClient {
    public static void main(String[] args) {
            Singleton singleton1 = Singleton.getInstance();
            Singleton singleton2 = Singleton.getInstance();
    }
}




In [19]:



!javac -d classes/ -sourcepath src/ src/headfirst/singleton/dcl/*.java
!java -cp classes/ headfirst.singleton.dcl.SingletonClient

