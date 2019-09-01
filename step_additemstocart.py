import webbrowser
from getgauge.python import step
from selenium import webdriver


def getWebdriver():
    driver = webdriver.Chrome()
    # This action was causing Crash on Chrome and firefox hence the implentaton has not been added
    driver.set_window_size(1124, 850)
    driver.implicitly_wait(30)
    return driver


@step('Open the automation practise web browser')
def open_automation_browser():
    retval = webbrowser.open('http://automationpractice.com/index.php')
    # Assert of the retval is true
    assert retval == True

@step('Create customer account for <first_name> <last_name> with <email>')
def create_new_customer(firstname, lastname, email):
    # Call the webdriver api with this information 
    return True


@step('Login from app as user <email>')
def get_token_for_user(email):
    return True


@step('Create a cart from app as user <email> with <elem> elements')
def create_cart(email, elem):
    assert elem == "two"
    return True


@step("Place and submit order for user <abhishek.manipal@gmail.com> with firstname=<abhishek> lastname=<mishra> street=<Bungendore st> city=<sydney> region=<au> postcode=<2747> country=<Australia> telephone=<0451352580>")
def amtkby(arg1, abhishek, mishra, arg4, sydney, au, arg7, Australia, arg9):
    return True


@step('User <email> closes browser')
def close(email):
    return True
