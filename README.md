Call Scala from Java 
===================

Demonstrate calling from Java code a method written in Scala
</p>
This is useful for investigating conversion of argument types to parameter types.  
The problem that inspired this research was that the following Java code create a NullPointerException:

```
scalaMethod(1 == 0? 0L: new
``` 

