set projectLocation=D:\SeleniumWS\AutomationFW
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
cmd /k