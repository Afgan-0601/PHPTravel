cd\
cls\
cd "C:\Users\AFGAN\eclipse-workspaceClass\PhpTravel"
REM mvn clean test -Dtest=com.php.tests.PhpTravelsTest -X
mvn test -Dtest=phpSmokeTests -DbrowserV=chrome
pause