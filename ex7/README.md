This implementation shows a simple example of 
[Data Race](https://docs.oracle.com/cd/E19205-01/820-0619/geojs/index.html) problem
and how to resolve it using **volatile**.

To check the unexpected behavior you can remove the **volatile**
keyword from the variables in _SharedClass.java_.