## Lab 19 - SortingApples
 
For your final practical project and for many instances in the future, you will need to make a `compareTo()` method to compare the values of objects you make. For example, today you will work with an Apple class, which has three variables associated with it: `size`, `type`, and `color`. The compiler has no idea how to sort the Apple objects, so you will need to tell it how to compare them. You will write three different `compareTo()` methods that will compare the Apples by `size`, `type`, and `color`, respectively. The [javadoc](https://csu-compsci-cs163-4.github.io/Lab19SortingApples/package-summary.html) has what methods were already written for you and where your code will go. 

## Step 1: Getting Started
Take a look at the [javadoc](https://csu-compsci-cs163-4.github.io/Lab19SortingApples/package-summary.html) and the code provided to you. The following [website](https://www.baeldung.com/java-compareto) has some good information on the basics of the `compareTo()` method. 

## Step 2: Implementation
Go to the `compareTo()` method in `Apple`. When `main()` is run, `Collections.sort(apples)` will call this method. Do your work for each `compareTo()` in here, then copy it over to `compareTo1()`, `compareTo2()`, or `compareTo3()`. 

For `compareTo()`, if the objects are the same (based on whatever arbitrary criteria the designer decides makes the two objects the same), return 0. If the left-hand side (commonly abrreviated as lhs) Apple is less than the right-hand side (rhs) Apple, return -1. If the lhs Apple is greater than the rhs Apple, return 1.

For `compareTo1()`, you will sort by size:
- If the Apples' types are the same, return 0. 
- If the lhs Apple (which you can simply call getSize() to get) size is less than rhsApple, return -1.
- If the lhs Apple size is greater than rhsApple, return 1.
- Run `main()`, the sorted list should be ordered by size from least to greatest.

For `compareTo2()`, you will sort by type:
- Exploit the pre-written `String` `compareTo()` method here. It already works, simply return the result of your getType().compareTo(rhsApple.getType).
- Run `main()`, the sorted list should be ordered by type in alphabetical order.

For `compareTo3()`, you will sort by color:
- Here is a good example of the necessary process of writing out what defines a comparison. Since we are comparing enums that we defined, the compiler will have no idea what is less than or greater than the other. So, we have to clearly lay out our comparisons. 
- If the Apples' colors are the same, return 0. 
- If the lhs Apple (which you can simply call getColor() to get) color is less than rhsApple, return -1. This is true when lhsColor is green OR rhsColor is yellow OR (lhsColor is red AND && rhsColor is redyellow).
- If the lhs Apple size is greater than rhsApple, (else) return 1.
- Run `main()`, the sorted list should be ordered by color, where green < red < redyellow < yellow.


## Step 3: Finishing up
To turn in your assignment, click through the link on Canvas, upload your files to Zybooks and click submit for grading. Note you can do this more than once.

