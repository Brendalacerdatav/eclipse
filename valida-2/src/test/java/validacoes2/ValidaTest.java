package validacoes2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ValidaTest {

	private WebDriver driver;

	@Before
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();

	}

	@After
	public void tearDown() {
		// driver.quit();
	}

	@Test
	public void teste2() {
		try {
			driver.get("https://www.soc.com.br/blog-de-sst/");
			WebDriverWait wait = new WebDriverWait(driver, 20);
			driver.manage().window().setSize(new Dimension(1050, 708));
			driver.findElement(By.linkText("Funcionalidades")).click();
			driver.findElement(By.linkText("Rede SOCNET")).click();
			driver.findElement(By.cssSelector(".elementor-animation-grow .elementor-button-text")).click();

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alteracao")));

			driver.findElement(By.cssSelector(".alteracao")).click();
			driver.findElement(By.id("btn-distancia-10")).click();
			driver.findElement(By.id("ipt-busca-credenciado-2")).click();
			driver.findElement(
					By.cssSelector("#div-filtro-conveniencias .elemento-filtro:nth-child(4) .cbx-estilizado")).click();
			driver.findElement(By.cssSelector("#div-filtro-servicos .elemento-filtro:nth-child(3) .cbx-estilizado"))
					.click();
			driver.findElement(By.cssSelector(".btn-limpo-estilizado")).click();

			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.cssSelector("div:nth-child(1) > .estrutura-resultados-mapa .dados-empresa")));

			driver.findElement(By.cssSelector("div:nth-child(1) > .estrutura-resultados-mapa .dados-empresa")).click();
			driver.findElement(By.cssSelector(".active img")).click();
			driver.findElement(By.cssSelector(".btn-alinhado")).click();
			// driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

