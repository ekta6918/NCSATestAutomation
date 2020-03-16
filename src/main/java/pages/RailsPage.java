package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sun.jvm.hotspot.debugger.Page;
import util.Browser;

import java.util.ArrayList;
import java.util.List;

public class RailsPage {


    @FindBy(id = "your-repos-filter")
    WebElement repositorySearchBox;

    @FindBy(xpath = "//a[contains(@itemprop,'codeRepository')]")
    List<WebElement> repositoryLinks;




    public RailsPage(){
        PageFactory.initElements(Browser.getDriver(),this);
    }

    public Boolean verifyPage(){
       return Browser.getTitle().contains("Rails");
    }


    public void searchRepository(String repositoryName) throws Exception{
        repositorySearchBox.sendKeys(repositoryName);
        repositorySearchBox.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }

    public ArrayList<String> getRepositoryNames(){

        ArrayList<String> repoNames = new ArrayList<String>();
        for(int i=0;i<repositoryLinks.size();i++){
            repoNames.add(repositoryLinks.get(i).getText());
        }

        return repoNames;
    }

    public void clickRepositoryName(String repoName){
        boolean found = false;
        for(int i=0;i<repositoryLinks.size();i++){
            if(repositoryLinks.get(i).getText().equalsIgnoreCase(repoName)){
                repositoryLinks.get(i).click();
                found = true;
                break;
            }
        }
        if(!found){
            throw new RuntimeException("Repository with the name "+repoName+" is not found");
        }

    }



}
