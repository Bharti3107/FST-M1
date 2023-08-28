import pytest
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from selenium.webdriver.firefox.webdriver import WebDriver
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.support.wait import WebDriverWait
from webdriver_manager.firefox import GeckoDriverManager


def test_completeTheCourse():
    # setup Firefoxdriver with WebDriverManager
    service = FirefoxService(GeckoDriverManager().install())

    # start the driver
    with webdriver.Firefox(service=service) as driver:
        # Access the URL
        driver.get("https://alchemy.hguy.co/lms")
        # print header of the page
        print("Title of the home page is : ", driver.title)

        # click on My account
        driver.find_element(By.XPATH, "//a[contains(text(), 'My Account')]").click()
        # click on Login
        driver.find_element(By.XPATH, "//a[contains(text(), 'Login')]").click()
        # provide username
        driver.find_element(By.XPATH, "//input[@id = 'user_login']").send_keys("root")
        # provide password
        driver.find_element(By.XPATH, "//input[@id = 'user_pass']").send_keys("pa$$w0rd")
        # click on Submit
        element = driver.find_element(By.XPATH, "//input[@id = 'wp-submit']")
        element.click()
        print(driver.title)
        # verify title of the page
        assert driver.title, "My Account – Alchemy LMS"
        # locate the navigation bar "About Courses" and click it
        driver.find_element(By.XPATH, "//a[contains(text(), 'All Courses')]").click()
        # select a course and open it
        coursePage = driver.find_element(By.XPATH,
                                         "//a[@class = ('btn btn-primary') and (@href = 'https://alchemy.hguy.co/lms/courses/social-media-marketing/')]")
        coursePage.click()
        # click on any course to see Details
        driver.find_element(By.XPATH, "//div[contains(text(), 'Developing Strategy')]").click()
        # verify the title
        title = driver.title
        assert title,'Developing Strategy – Alchemy LMS'

