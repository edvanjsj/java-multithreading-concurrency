In this code we have the implementation of the factorial calculation that can be performed concurrently on different threads.

Through this example it is possible to learn two concepts of using threads: _**Thread.join()**_ and _**Daemon threads**_.

### Thread.join()

Using the _Thread.join()_ method it is possible to wait for the thread to finish.

For very time-consuming operations, such as the factorial calculation of large numbers, you can define a timeout using 
_Thread.join(int milliseconds)_.

### Daemon threads

They are threads that don't prevent the JVM from exiting when the program finishes but the thread is still running. 
If a thread is not a daemon, even if the main thread has finished its operations it will only die when the non-daemon 
threads also finish their operations. This may explain the fact that some applications never terminate.

Some important points:
* By default main threads are not daemon;
* When a new thread is created it inherits the daemon status of its parent.
* To specify a Daemon thread you can use _Thread.setDaemon(true)_. After starting the thread you cannot
    change this property.
* When all non-daemon threads finish, the JVM halts, and any remaining daemon threads are abandoned. Consequently:
    * Finally blocks are not executed;
    * Stacks are not unwound - the JVM just exits.

See more at:

[Link 1](https://stackoverflow.com/questions/2213340/what-is-a-daemon-thread-in-java)

[Link 2](https://www.baeldung.com/java-daemon-thread)

[Link 3](https://www.linuxtopia.org/online_books/programming_books/thinking_in_java/TIJ315_005.htm)
