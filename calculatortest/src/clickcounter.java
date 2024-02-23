import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickcounter {
    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qaclickcounter.ccbp.tech/");
        WebElement clickbutton= driver.findElement(By.xpath("//button[contains(text(),ClickMe!"));
        WebElement counter= driver.findElement(By.xpath("//span[contains(@class,'counter')]"));
        for(int i=1;i<=100;i++){
            clickbutton.click();
            String countstr=counter.getText();
            int count=Integer.parseInt(countstr);
            if(count!=i){
                System.out.println("count mismatch");
                break;
            }
            if(i==100){
                System.out.println("click counter APP:working as expected");
            }
        }
        driver.quit();
    }
}
