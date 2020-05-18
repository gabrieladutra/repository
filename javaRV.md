# Java Review #

Java is a static-typed, object oriented programming language , plataform idependent

### Data types ###

-> Primitives:
<Integer> short,byte, int and long
<Floating-point> float double
<character> char
<logical> boolean (**true or false**)

-> Objec/Reference : 
<String> Instance of class -> object that are a sequence of characters 
<null> Absence of value
<Object> Reference to class


### Declaring Variables ####
 Type Indentifier;
 `int number;`
 Assingment operator to initialize variables during declaration;
 `Integer value = 10;` ->declaration initializing 

 >Variables can be initialized with functions calls because return of this functios can be useful or the same type of variable
 Eg. int imc = getImc(height, weight);
 > Instance of objejects`productRepository repository = ProductRepository.getInstance();`

### Array ##
-> Is a reference type that can store a collection of values of specific type 
 <Type[] identifier = new Type[lenght]>
 <int[] numbers = new int[5]>
 <numbers[0] = 10>
 <numbers[1] = 20>

 >Index is a position of array[]
 >Lenght : Size of array -- array.lenght

### Classes ###

>toString() is a method to get String representation of class
-> classes in Java are child (*directly or indirectly*) of Object class that contains toString method.  

*Default toString*

public toString(){
    return getClass().getName() + "@" + Integer.toHexString(hashCode());
}
-----Output-----
Product@id12324;




