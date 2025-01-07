Java First Experience

An OOP
Everything is an object (ecerything is written in a class)
Different data types: int, double, char, boolean, String.
The first four are are primitive data types; they are not changeable.
String is not primitive.

We can make variables equal to other variables. 
We can add variables. We can subtract variables.

We can create a variable without giving it a value immediately. It's called declaration.
`int x;` // Declaration without initialization
You can't print an uninitialized var.

BODMAS applies  to java basic operations
3 + 2 * 3 will equal 9 not 15

Type casting
Without changing the type of a variable at the declaration level, you can inline change the type of a variable to be able to perform an operation. The original type is still retained afterwards.
Ex:
int y = 1; double x = 2; int z = (int)x * y;
Without type casting x into an int, you are likely going to have an error.

Modulus/Remainder
int x = 56 % 5;
System.out.println(x) gives 1.

Scanner and input
Scanner is basically a data type. And like everything in java, it's an object.
Import it from java.util.Scanner
Create the data type; it's an object;
Scanner var_name = new Scanner(System.in);
This Scanner scans for or is waiting for keyboard input.
There are different types of scanners that listens for several other events.
To print what is scanned, you have to use a String, or int or another data type like this
String scanned = sc.next();
You can now system dot out `scanned`.

Coditions, Comaprison and Boolean
> < == >= <= !=
ALl works on int
Only == and != works on STring; But this not a way to compare String; at least, not when you intend to comapre the string content.
Use str.equals(str_to_compare) or str.equalsIgnoreCase(str_to_compare) 



I am going through an article about data types (in java) and I'm trying to create a pattern regarding the data size
byte data type is 8 bit (that's 1 byte) and can represent values from -128 to 127
short is 16 bit (that's 2 byte) and can rep -32,768 to 32,767
int is 32 bit (that's 4 bytes) and has range of values from -2,147,483,648 to 2,147,483,647
long is 64 bit (that's 8 bytes) and has range of values from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.

I think there is a pattern here
I don't have to have the byte size off heart but I think there is a way I can get it






I figured it out already. It's simple raising the total number of charcters of the base type to the power of two to get the number of characters of the next type. You can simply share into two to get the - and +
Another efficient way is 2^bits to give you total number of rep values

For float and double, what's the difference?
Is it safe to say that float and int are nearly same, just that float handles decimals too and same applies to long and double?
Answer: No. They are not same. Float is diff from int so is double from long

Must you add 'f' to a float data type and  'L' to a long data type? Why? What if you don't?
Answer: Yes. Otherwise it throws an error as it's a double in that case

this write up says char is 2 byte. WHy? I thought it should be 1 byte since it represents just one character?

Can you add chars? How? WHy will you want to do that? Applications?
Answer. yes. It will add there ASCII number values and return an int


Back to boolean and conditions
&& - and
|| - or
What happens when you chain multiple conditions involving and and or?
ANswer: You first handle unit comparisons; then &&, and finally ||
The evaluation stops as soon as an AND condition fails or an OR condition passes.



if, else and else if
Syntax identical to javascript
(for loop is also identical with javascript)
syntax
shorthand: (condition) ? expression if true : expression if false


Switch statements
Syntax just like in javascript
switch (expression) {
  case a:
    action;
    break;
  case b:
    action;
    break;
  default:
    action;
}


While loop
Syntax identical to javascript
while (condition) {
  code block;
  condition change; // (optional)
}


Do/While loop
Identical to while loop
int i = 0;
do {
  System.out.println(i);
  i++;
}
while (i < 5);

for loop
Syntax identical to javascript
For loop is more suited for situations where you know how many times you want to code to run.
for (expression to execute before start of loop - one time, condition that must be true for loop to continue, executed every time after each loop) {
  code block;
}

Nested for loop
A for loop inside another for loop
Multidimensional

For each
Used in an array
for (String car : cars) {
  System.out.print(car);
}
Only use the for each loop when you have to
Traditional for loop is better as it has more flexibility and functions unlike the for each loop that has several limitations.
Plus, for each loop has a slower performance.


Break and Continue
You already know this bro
Break jumps out of a for loop or switch statement entirely
Continue discontinues the current iteration and starts the next

DO you know about labeled blocks in java
You can actually label a block like for loop block or switch block
The usual application of this in to make it easier for the programmer to the computer the block of code to break out of.
It's for identification
`
block1: for (int i = 1; i < 10; i++) {
			System.out.println("This is block1");
			System.out.println("i is " + i);
			block2: for (int j = 10; j < 200; j+=20) {
				System.out.println("This is block2");
				System.out.println("j is " + j);
				block3: for (int x = 3; x < 81; x+=3) {
					System.out.println("This is block3");
					System.out.println("x is " + x);
					if (x > 21) break block2;
				}
			}
		}
		`
		
Something like this... though this is a rough example


return keyword
Used to exit a method with or without a value
the return value must be of same type as function type
a void function has no return
a non-void function may have a void return


Difference between post-increment (i++) and pre-increment(++i)
Former uses the current value of i in the expression before incrementing it; later increments before use.


Method
Java Method is a block of code that performs a specific task.
All methods in Java must belong to a particular class.
Look at this line; `Methods are similar to functions and expose the behavior of objects.`
You see, actually Methods and Functions are not the same thing.
Oh. Yeah. True. They are different.
A method is a function that belongs to a class (or an object). A method can't be called alone. Rather, it is called in relation to the object it will act upon.
A function on the other hand is independent. It can be called on it's own and it will function on it's own and return a value (asides mostly void functions).

In java, everything is a method, cause technically, every function belongs to a class.
But there a static and instance methods.
Static methods are declared with the static keyword and belong to the parent class and not to any particular object. Cannot use the this keyword (because this refers to an object, and static methods are not tied to objects).



Arrays
type[] arrName; // declaration
Array methods: .length
Multidimentional arrays: int[][] numbers = {{1,2,3},{4,5,6,}};

