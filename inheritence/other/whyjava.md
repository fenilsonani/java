<!-- why java deoent suppoer multiple inhetitence -->

# Why Java doesn't support multiple inheritance?

In Java, a class can only extend one superclass. This is because of the diamond problem. If a class inherits from two classes that have a common superclass, then which superclass should the class inherit from? This is the diamond problem.

In the following example, class C inherits from class A and class

B. Both class A and class B inherit from class X. So, which class

should class C inherit from?

```java
class X {
    // ...
}

class A extends X {
    // ...
}

class B extends X {
    // ...
}

class C extends A, B {
    // ...
}
```


The answer is that class C should inherit from class X. This is

because class A and class B are siblings and they both inherit from

class X. So, class C should inherit from class X.