from selenium import webdriver
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.common.by import By
from selenium.webdriver.support.wait import WebDriverWait


def test_verifyTitleoffirstinfobox():
    # setup Firefoxdriver with WebDriverManager
    service = FirefoxService(GeckoDriverManager().install())

    # start the driver
    with webdriver.Firefox(service=service) as driver:
        # Access the URL
        driver.get("https://alchemy.hguy.co/lms")
        # print header of the page
        print("Title of the home page is : ", driver.title)
        # Get the First Box Title
        firstbox = driver.find_element(By.XPATH,"//h3[contains(text(),'Actionable Training')]")
        # xpath://h3[contains(text()," Actionable Training ")]
        #//h3[@class=\"uagb-ifb-title\"])[1]
        currentFirstBoxTitle = firstbox.text
        #verify the title
        assert currentFirstBoxTitle,"Actionable Training"
        print("First Box Title is " , currentFirstBoxTitle)

