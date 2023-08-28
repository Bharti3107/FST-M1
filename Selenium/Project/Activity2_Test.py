from selenium import webdriver
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.common.by import By
from selenium.webdriver.support.wait import WebDriverWait


def test_verifyWebsiteHeading():
    # setup Firefoxdriver with WebDriverManager
    service = FirefoxService(GeckoDriverManager().install())

    # start the driver
    with webdriver.Firefox(service=service) as driver:
        # Access the URL
        driver.get("https://alchemy.hguy.co/lms")
        # print header of the page
        print("Title of the home page is : ", driver.title)
        # Finding Header Element
        headerElement = driver.find_element(By.XPATH, "//h1[contains(text(),' Learn from Industry Experts ')]")
        currentHeader = headerElement.text
        # assert the title
        assert currentHeader, "Learn from Industry Experts"
        print("The Title of the Page is: " , currentHeader)
