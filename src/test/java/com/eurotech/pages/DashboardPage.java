package com.eurotech.pages;

import com.eurotech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DashboardPage extends BasePage{
    @FindBy(id = "dashboard-h1")
    public WebElement dashboardText;

    @FindBy(xpath = "//p[contains(text(),'Welcome')]")
    public WebElement welcomeMessage;

    @FindBy(css = ".btn.btn-light")
    public List<WebElement> dashboardList;

    @FindBy(xpath = "//a[text()='Edit Profile']")
    public WebElement editProfile;

    @FindBy(xpath = "//tr[@id='dashboard-education-item-raw']/td[1]")
    public WebElement school;

    @FindBy(xpath = "(//tr[@id='dashboard-experince-item-raw'])[1]/td[1]")
    public WebElement companyName;

    @FindBy(xpath = "//ul[@id='navbar-menu-list2']/li")
    public List<WebElement> menuList;


    public String getTitle(String companyName){
        return Driver.get().findElement(By.xpath("//td[text()='"+companyName+"']/../td[2]")).getText();

    }

    public void navigateMenu(String menuName){
        Driver.get().findElement(By.xpath("//*[text()='"+menuName+"']")).click();

    }

    public String getHeader(String headerName){
        return   Driver.get().findElement(By.xpath("//section[@class='container']/*[text()='"+headerName+"']")).getText();
    }
}