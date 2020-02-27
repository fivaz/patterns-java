import java.util.Date;

class Singleton {

    private static Singleton instance = null;
    private int nbInstances = 0;
    private Date creationDate;

    private Singleton() {
        nbInstances += 1;
        creationDate = new Date();
    }

    public int getNbInstances() {
        return nbInstances;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
}
