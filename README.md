## APPLICATION FOR TRACKING AND LOCATING VACCINATED PATIENTS 
##--------------------------------------------------------------------------------------------------
								BUILD INSTRUCTION USING SPRINGBOOTS
##--------------------------------------------------------------------------------------------------
.Its a sprint boot application .
.Get the application from my github repository called https://github.com/bushraafroz/DevOpsRepo.git 
.Create a project in eclipse and build it using Sprint suit tool in eclipse or run this in command prompt "mvn spring-boot:run"
.Add commit and push the application in github 
##--------------------------------------------------------------------------------------------------
								DEPLOY INSTRUCTIONS USING HEROKU  
##--------------------------------------------------------------------------------------------------
1.Login to your account in Heroku and create an App
2.In the Deployment method, click on Github
3.Find your project in github
4.Click on connect
5.After a successful connection, then click on Deploy Branch
6.Once done ,click on view button to open the application URL 

##--------------------------------------------------------------------------------------------------
								TEST INSTRUCTION
##---------------------------------------------------------------------------------------------------

This application will perform following operations:

1.It will add patient information like patient name ,zipcode and whether they have been vaccinated or not (See # 1)
2.It can list all the patients in the system (see #2)
3.Get patient details based on the id provided (See #3)
4.Get the list of all the patients residing in a specific zip code.(See #4)
5.Get the list of all the patients who have been vaccinated (See #5) 

Open Postman to test this application .

Application URL :http://tracking-vaccinated-patients.herokuapp.com/Tracking/


POST request:
1.Add Patient:
http://tracking-vaccinated-patients.herokuapp.com/Tracking/add
Add 1st patient:Pass it in the body as raw jason
{
    "name": "Tom",
    "zipcode" : "77564",
    "vaccinated" : "false"
}


Add 2nd patient:Pass it in the body as raw jason
{
    "name": "Joe",
    "zipcode" : "77555",
    "vaccinated" : "true"
}

Add 3rd patient:Pass it in the body as raw jason
{
    "name": "Tina",
    "zipcode" : "77564",
    "vaccinated" : "true"
}

Get Request:
2) List all the patients in the system
http://tracking-vaccinated-patients.herokuapp.com/Tracking/list

3) Get the details By id :
http://tracking-vaccinated-patients.herokuapp.com/Tracking/id/1

4) Get the details by Zipcode
http://tracking-vaccinated-patients.herokuapp.com/Tracking/byzipcode?code=77564

5)Get the details of all the patient who got vaccinated 
http://tracking-vaccinated-patients.herokuapp.com/Tracking/vaccinated?check=true

