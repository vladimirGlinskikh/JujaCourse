1) В первую очередь выполняются статические переменные и статические инициализаторы. Они срабатывают по порядку.<br>
Соответсвенно будет выведено: <br>
StringTwo<br>
StringFive<br>
StringSix<br>
2) Далее в методе main мы создаем объект класса One. 
Перед тем, как сработает конструктор One, срабатывают нестатические блоки инициализации по порядку. Важно отметить, что не только срабатывают
нестатические блоки инициализации, но и инициализируются нестатические переменные. Все это срабатывает по порядку.
Соответсвенно будет выведено:<br>
StringThree<br>
StringFour<br>
StringSeven<br>
3) И самый последний срабатывает конструктор One и выведет в консоль StringOne.

4) В итоге в консоли мы увидим такой аутпут:
StringTwo<br>
StringFive<br>
StringSix<br>
StringThree<br>
StringFour<br>
StringSeven<br>
StringOne