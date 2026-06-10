package m02_class_and_objects;
class DBConnection{
    String connectionURL;

    public DBConnection(String connectionURL) {
        this.connectionURL = connectionURL;
        System.out.println("Creating Instance "+this.connectionURL);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Deleting Instance "+this.connectionURL);
    }
}
public class _05_GarbageCollector {
    public static void main(String[] args) {
        DBConnection connection = null;
        for(int i=0;i<1000000;i++){
            connection = new DBConnection(String.valueOf(i));
            connection = null;
            System.gc();
        }
    }
}
