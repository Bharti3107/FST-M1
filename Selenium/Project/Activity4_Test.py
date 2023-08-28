from selenium import webdriver
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.common.by import By

def test_verifyTitleofSecondpopularCourse():
    # setup Firefoxdriver with WebDriverManager
    service = FirefoxService(GeckoDriverManager().install())

    # start the driver
    with webdriver.Firefox(service=service) as driver:
        # Access the URL
        driver.get("https://alchemy.hguy.co/lms")
        # print header of the page
        print("Title of the home page is : ", driver.title)
        #Finding the Top Course
        secondTopCourse=driver.find_element(By.XPATH,"//h3[contains(text(),'Email Marketing Strategies')]")
        secondPopularCourse= secondTopCourse.text
        #assert the title
        assert secondPopularCourse,"Email Marketing Strategies"
        print("Second Popular Course was: ",secondPopularCourse)
