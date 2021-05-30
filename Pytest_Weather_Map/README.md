Step 1:Create virtual env

python3 -m venv

Step 2: Install the requirements.txt(Assuming you have pip or pip3 installed)

Pip3 install -r requirements.txt

Step 3: Run the gauge specs file 

gauge run specs/

Report 
gauge run specs/
You are using pip version 19.0.3, however version 19.2.3 is available.
You should consider upgrading via the 'pip install --upgrade pip' command.
# smoke test suite for the automation practise
  ## Open the web browser for http://automationpractice.com/index.php   
 ✔
  ## I want to be able to add 2 items to the cart and place an 
 ✔ ✔ ✔ ✔
  ## Email closes the browser   
 ✔ ✔

# A happy holiday maker
  ## Holiday place is Sydney Ok!        
 ✔
  ## Holiday day is Thursday Ok!        
 ✔
  ## Weather API get request fetches 200 Ok!    
200
 ✔
  ## Holiday temperature check is less than 10 degrees ok!      
Weather Forecast
===========================================================================================
Min Temp        Max Temp        Description                     Wind Speed      Pressure
12.78000000000003               16.110000000000014              scattered clouds                2.6             1018
============================================================================================
 ✔

Successfully generated html-report to => /Users/amish/gauge_framework/gauge/CodingX/reports/html-report/index.html
Specifications: 2 executed      2 passed        0 failed        0 skipped
Scenarios:      7 executed      7 passed        0 failed        0 skipped


