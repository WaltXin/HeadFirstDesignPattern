![alt text](https://i.imgur.com/TAC0dwP.png "UML")

In observer mode, concrete subject, concrete observers will always change,
however, with this mode, we don't need change the those concrete observer
that rely on subject and don't needs to change subject itself.

Observer mode. Usually have observer and subject. Concrete observer will define
one or many concrete subject and then let this subject add as subscribe observers.


Java also implemented this mode in Java.util.Observable. However, observable is class
and not ideal for scaling.

