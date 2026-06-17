package m02_class_and_objects;
interface  WebDriver{
    void openBrowser(String url);
}
class FirefoxDriver implements  WebDriver{

    @Override
    public void openBrowser(String url) {
        System.out.println("Opening firefox browser");
    }

    public void closeBrowser(){
        System.out.println("Closing browser");
    }
}
public class _09_Interface {
    public static void main(String[] args) {
        FirefoxDriver driver = new FirefoxDriver();
        driver.openBrowser("www.google.com");
    }
}
