   
   ![alt-текст](images/3.png)

* В строке 14 создается объект Two, на который ссылается переменная two.
 Two two = new Two();

далее<br>
System.out.println(two.a);

Тут compile time binding. Будет вызываться переменная a, которая относится к переменной two. Переменная two какого типа? Типа Two, значит будет вызвана переменная из класса Two, которая равна 20. В консоли мы увидим число 20.
________________________________________
* System.out.println(((One) two).a);

Тут выводим в консоль переменную а, но говорим, что типа пускай переменная two чувствует себя, как объект One. Мы кастим переменную two до One. Мы же можем кастить в данном случае? Можем конечно. Потому, что two это всегда One так, как видим extends (class Two extends One). В данном случае вызывается переменная а, класса One и в консоли мы видим 10.
________________________________________
* two.abc();

Тут runtime binding. Происходит проверка. Переменная two на что ссылается? На объект класса Two. (Two two = new Two();), значит вызываем метод abc(); у класса Two и на консоль выводим "child non-static".
________________________________________
* ((One) two).abc();

Тут хоть кастинг происходит и two чувствует себя, как объект класса One, но вызов метода abc(); происходит runtime и компилятор спрашивает типа, переменная two, которая чувствует себя как One на самом деле ссылается на какой объект? И мы типа такие говорим, что на самом деле переменная two ссылается на объект класса Two. И компилятор говорит, ну если two ссылается на объект Two, то я и буду вызывать метод abc(); класса Two и в консоли мы снова видим "child non-static".
________________________________________
* two.abc2();

Тут compile time binding. two какого класса? two относится к классу Two и вызывается соответсвенно метод abc2(); в классе Two. В консоли мы видим "child static".
_________________________________________
* ((One) two).abc2();

Тут тоже самое, что и в предыдущем примере, но только переменная two чувствует себя, как One. Соответственно вызывается метод abc2(); у класса One и в консоли мы видим "base static".
__________________________________________
Итого, в консоли будет такой аутпут:<br>
20<br>
10<br>
child non-static<br>
child non-static<br>
child static<br>
base static