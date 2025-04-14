# Implementing Non-Static Nested Classes

Now that we've reviewed the main differences between non-static
nested and static nested classes, let's break down how to 
implement the use of a non-static nested class. For
more clarity, from here on, we may refer to the non-static
nested class as the inner class and the class that is 
encapsulated within as the outer class.

To declare a non-static nested class within an outer class,
you may use the following code:

```java
class Outer {
    String outer;
    // Assign values using constructor
    public Outer(String name){
        this.outer = name;
    }
    
    // private method
    private String getName() {
        return this.outer;
    }
    
    // Non static nested class
    class Inner {
        String inner;
        String outer;
    }
}
```

Notice how the `inner` class doesn't have the keyword `static`
preceding it. It is also important that we review what the 
keyword `this` means in Java code. `this` is a keyword 
that a class uses to reference itself.

To instantiate a non-static nested class that can access other
members of the outer class, first we need to instantiate an 
object of the outer class.

```java
Outer outer = new Outer();
```

Next, we instantiate an inner class object:
```java
Outer.inner inner = outer.new Inner();
```

Note that we use the `outer` object along with the `new`
keyword to create an instance of the inner class.

This step shows us an example of how a non-static class
can access other static and non-static classes from the
outer class. In the code below, take a look at a modified
version of the inner class from our previous example: 
```java
// Non static nested class
class Inner {
    String inner;
    String outer;
    public String getOuter() {
        outer = Outer.this.getName();
    }
}
```