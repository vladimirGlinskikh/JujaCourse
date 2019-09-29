##### This file is intended for storing basic administration commands
___________________
##### backup
   // we make backup mbr
 
  * dd if=/dev/sda of=/root/backup.mbr bs=512 count=1

##### make the file executable
   chmod u+x some file name or script name
 
##### APT
 
  * apt-get: for download and install packages
  * apt-cache: for search packages
  * aptitude: full package management with pseudo-graphics option
 
   /etc/apt/source.list - list of repositories
   
##### edit text
    cat       pr
    cut       sed
    expand    sort
    fmt       split
    head      tail
    join      tr
    less      unexpand
    nl        uniq
    od        wc
    paste
##### FHS    
    /bin   - basic command binaries
    /boot  - bootloader files
    /dev   - devices
    /etc   - configuration for computer
    /home  - home files
    /lib   - libraries and kernel modules
    /proc  - information about working system
    /media - media mounting
    /mnt   - mounting media
    /opt   - additional software
    /root  - home files admin
    /sbin  - basic system program settings
    /srv   - data for system services
    /tmp   - temp files
    /usr   - binaries user files
    /var   - variables
 + commands
 
    Grep    - утилита поиска по содержимому
 
    Find    - утилита поиска файлов по свойствам
 
    Locate  - быстрый поиск файлов
 
    Which   - поиск команды
 
    Type    - вывод точной команды
 
    Whereis - поиск команды, исходников и мануала
##### Работа с процессами в Linux
 * Fg (foreground) and bg (background)
 * Nohup (no hang up) 
 
 * Ps     - информация об активных процессах
 * Pstree - дерево процессов
 * Pgrep  - поиск процессов
 * Pkill  - завершение процессов
 * Top    - диспетчер задач
 * Free   - загрузка оперативки
 * Uptime - время и полнота загрузки
 * Screen - управление сессиями   
##### Regex

   \<text - слова начинающиеся с text;
   
   text\> - слова заканчивающиеся на text;
   
   ^      - начало строки;
   
   $ - конец строки;
   
   [a-z] - диапазон от a до z;
   
   [^t] - не буква t;
   
   \[ - воспринимать символ [буквально;
   
   . - любой символ;
   
   a|z - a или z;
   
   grep - утилита поиска по выражению
   
   egrep - расширенный grep
   
   fgrep - быстрый grep
   
   rgrep - рекурсивный grep
   
   sed - потоковый текстовый редактор
##### Vi

   e b - конец и начало слова
   
   ( ) - конец и начало предложения
   
   { } - конец и начало абзаца
   
   ^ $ - конец и начало строки
   
   1G G - конец и начало файла
   
   yy - скопировать строку
   
   yw - скопировать слово
   
   yl - скопировать символ
   
   dd - вырезать строку
   
   dw - вырезать слово
   
   dl - вырезать символ
   
   p - вставить
   
   / - начать поиск ниже
   
   ? - начать поиск выше
   
   N u n - продолжить поиск
   
   :e - отменить изменения
   
   :w - записать изменения
   
   :q - выйти из файла
   
   :q! or ZQ - выйти не сохраняя
   
   :wq or ZZ - выйти и сохранить
##### Права доступа к файлам и папкам

   chown - установка владельца
   
   chgrp - установка группы владельцев
   
   chmod - установка прав доступа
   
      |--------|---------------------|---------|
      | Число  |     Разрешение      | Символ  |
      |--------|---------------------|---------|
      |   0    | Нет прав            | ---     |
      |   1    | Execute             | --x     |
      |   2    | Write               | -w-     |
      |   3    | Write, execute      | -wx-    |
      |   4    | Read                | r--     |
      |   5    | Read, Execute       | r-x     |
      |   6    | Read, Write         | rw-     |
      |   7    | Read, Write, Execute| rwx     |
      |--------|---------------------|---------|
      
  ##### Маски
      umask - маска создания файлов и папок
      
      suid - бит запуска от имени владельца
      
      sgid - бит запуска от имени группы владельцев
      
      sticky - бит защиты содержимого
  ##### Перемненные
      Переменные работают в пределах текущей оболочки
      
      Переменные среды - работают так же во всех дочерних процессах
      
  * Команды
  
      set - вывод всех переменных и функций
      
      unset - удаление переменных
      
      export - превращает переменную в переменную среды
      
      env - выводит переменные среды
      
      PATH - переменная содержащая путь к исполняемым файлам
  ##### Test
   
   -x исполняемый файл
   
   -е файл существует
   
   -eq значения равны
   
   -ne значения не равны
   
   -z существует ли значение
   
   du -hs - смотрим размер файла, заходим в директорию и набираем команду
   
   cp -R  путькпапке  путькновомуместу - копируем 
   
      
      








          
   
   
   
 