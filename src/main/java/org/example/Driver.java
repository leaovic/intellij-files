package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.instagram.com/");

        WebDriverWait wait = new WebDriverWait(driver, 1);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#loginForm > div > div:nth-child(1) > div > label > input")));

        WebElement campoUsuario = driver.findElement(By.cssSelector("#loginForm > div > div:nth-child(1) > div > label > input"));
        campoUsuario.sendKeys("victorleaoreal");

        WebElement campoSenha = driver.findElement(By.cssSelector("#loginForm > div > div:nth-child(2) > div > label > input"));
        campoSenha.sendKeys("marinha010");

        WebElement botaoEntrar = driver.findElement(By.cssSelector("#loginForm > div > div:nth-child(3) > button > div"));
        botaoEntrar.click();

        WebDriverWait wait2 = new WebDriverWait(driver, 1);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#react-root > section > nav > div._8MQSO.Cx7Bp > div > div > div._7Nzh3 > a > div > div > img")));


        WebElement botaoHome = driver.findElement(By.cssSelector("#react-root > section > nav > div._8MQSO.Cx7Bp > div > div > div._7Nzh3 > a > div > div > img"));
        botaoHome.click();

        WebDriverWait wait3 = new WebDriverWait(driver, 1);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#mount_0_0_Ik > div > div:nth-child(1) > div > div:nth-child(4) > div > div > div.rq0escxv.l9j0dhe7.du4w35lb > div > div.iqfcb0g7.tojvnm2t.a6sixzi8.k5wvi7nf.q3lfd5jv.pk4s997a.bipmatt0.cebpdrjk.qowsmv63.owwhemhu.dp1hu0rb.dhp61c6y.l9j0dhe7.iyyx5f41.a8s20v7p > div > div > div > div > div > div > div > div._a9-z > button._a9--._a9_1")));


        WebElement botaoAgoraNao = driver.findElement(By.cssSelector("#mount_0_0_Ik > div > div:nth-child(1) > div > div:nth-child(4) > div > div > div.rq0escxv.l9j0dhe7.du4w35lb > div > div.iqfcb0g7.tojvnm2t.a6sixzi8.k5wvi7nf.q3lfd5jv.pk4s997a.bipmatt0.cebpdrjk.qowsmv63.owwhemhu.dp1hu0rb.dhp61c6y.l9j0dhe7.iyyx5f41.a8s20v7p > div > div > div > div > div > div > div > div._a9-z > button._a9--._a9_1"));
        botaoAgoraNao.click();

    }
}