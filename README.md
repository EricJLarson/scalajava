Call Scala from Java 
===================

Demonstrate calling from Java code a method written in Scala
</p>
This is useful for investigating conversion of argument types to parameter types.  
</p>
The problem that inspired this research was that the following Java code create a NullPointerException:

```
new ScalaClass(0 == 1 ? 66 : 0 == 1 ? new Integer(123) : null);
```

But the same code, except with 66 passed as an object, did not cause an exception:  
```
new ScalaClass(0 == 1 ? new Integer(66) : 0 == 1 ? new Integer(123): null);
``` 

The curious part is that neither the primitive nor the object form of 66 would ever be sent to the 
called method because it is in the "then" clause of an impossible case, so should not have any impact
on whether the other clauses send in a null.

