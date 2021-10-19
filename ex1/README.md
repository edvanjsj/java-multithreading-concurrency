In this code we have a simple example of multithreading and concurrency.

Basically we have a vault that contains a password and its password is a numeric value up to 9999. 

There are two hackers _(AscendingHackerThread and DescendingHackerThread)_ who are trying concurrently to guess the password. The first one try to guess the password by 
trial and error increasing the value in ascending order and the second one decreasing the value in descending order.

The hackers have 10 seconds to guess the password, otherwise the Police _(PoliceThread)_ will stop the application 
and they don't be able to guess the password anymore.