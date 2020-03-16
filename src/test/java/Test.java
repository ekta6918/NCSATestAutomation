import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    public static void main(String args[]){

        System.setProperty("","");

        WebDriver driver = new ChromeDriver();
        driver.get("https://github.com/rails");



    }


    public void getRepositories(){

    }

}
