from getgauge.python import step, before_scenario
import requests

@before_scenario()
def set_url_openweather():
    #Todo add an precondition for test

@step("I like to holiday in <City>")
# Check Actual City and expected city is same
def CheckTravelCity(ActualCity, ExpectedCity = "sydney"):
    assert_msg = "Actual City for Holiday is {ActualCity} while Expected city:{ExpectedCity}"
    assert ActualCity == ExpectedCity, assert_msg

@step("I only like to Holiday on <Day>")
# Check if the day for holiday is 'Thursday'
def CheckActualTravelDay(ActualDay, ExpectedDay="Thursday"):
    assert_msg = "Actual Day for Travel is {ActualDay} while Expected day:{ExpectedDay}"
    assert ActualDay == ExpectedDay, assert_msg

@step("Return code from get request is <response_code>")
def CheckResponseCode(response_code):
    # Assume city is sydney and country is au
    response = send_request_url()
    print(response.status_code)
    assert response.status_code == int(response_code), "Non " + response_code + " Error in Request"

@step("Temperature is warmer than <temp> degrees")
# Assume the minimum temperature 
def CheckHolidayTemperature(temp):
    response = send_request_url()
    json_obj = response.json()
    # Convert temperature in kelvin to degree centigrate
    temp_min = float(json_obj["main"]["temp_min"] - 273.15)
    temp_max = float(json_obj["main"]["temp_max"] - 273.15)
    weather_description = json_obj["weather"][0]["description"]
    wind_speed = float(json_obj["wind"]["speed"])
    pressure = int(json_obj["main"]["pressure"])
    assert temp_min < int(temp), "Exiting since temperature should be more then {temp}  degrees"
    print("\n")
    print("             Weather Forecast                        ")
    print("===========================================================================================")
    print("Min Temp\tMax Temp\tDescription\t\t\tWind Speed\tPressure")
    cmd = "\t\t".join([str(temp_min), str(temp_max), str(weather_description), str(wind_speed), str(pressure)])
    print(cmd)
    print("============================================================================================")

def send_request_url():
    # Assume city is sydney and country is au
    url='http://api.openweathermap.org'
    api_key="48bb89e113f9a204239ebeede53b4f81"
    city = "sydney"
    country_Code = "au"
    url_with_city_country = (
        url+"/data/2.5/weather?q=" + city + "," + country_Code + "&APPID=" + api_key
    )
    response = requests.get(url_with_city_country)
    return response 