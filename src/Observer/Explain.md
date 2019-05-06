![alt text](https://i.imgur.com/TAC0dwP.png "UML")

Observer mode. Usually have observer and subject. Concrete observer will define
one or many concrete subject and then let this subject add as subscribe observers.


Java also implemented this mode in Java.util.Observable. However, observable is class
and not ideal for scaling.