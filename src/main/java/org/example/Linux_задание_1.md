
Первую часть по Linux:
-------------------------------------------------------------------
Задание 1.
alex@alex-VirtualBox:~$ mkdir Игрушки\ для\ школьников
alex@alex-VirtualBox:~$ mkdir Игрушки\ для\ дошколят
-------------------------------------------------------------------
Задание 2.
alex@alex-VirtualBox:~$ cd Игрушки\ для\ школьников/
alex@alex-VirtualBox:~/Игрушки для школьников$ > Роботы
alex@alex-VirtualBox:~/Игрушки для школьников$ > Конструктор
alex@alex-VirtualBox:~/Игрушки для школьников$ > Настольные\ игры
-------------------------------------------------------------------
Задание 3.
alex@alex-VirtualBox:~/Игрушки для школьников$ cd
alex@alex-VirtualBox:~$ cd Игрушки\ для\ дошколят/
alex@alex-VirtualBox:~/Игрушки для дошколят$ > Мягкие\ игрушки
alex@alex-VirtualBox:~/Игрушки для дошколят$ > Куклы
alex@alex-VirtualBox:~/Игрушки для дошколят$ > Машинки
-------------------------------------------------------------------
Задание 4.
alex@alex-VirtualBox:~$ mkdir Имя\ игрушки
alex@alex-VirtualBox:~$ mv Игрушки\ для\ школьников/ Имя\ игрушки/
alex@alex-VirtualBox:~$ mv Игрушки\ для\ дошколят/ Имя\ игрушки/
-------------------------------------------------------------------
Задание 5.
alex@alex-VirtualBox:~$ mv Имя\ игрушки/ Игрушки
-------------------------------------------------------------------
Задание 6.
alex@alex-VirtualBox:~$ cd Игрушки/
alex@alex-VirtualBox:~/Игрушки$ ls
'Игрушки для дошколят'  'Игрушки для школьников'
alex@alex-VirtualBox:~/Игрушки$
-------------------------------------------------------------------
Задание 7.
alex@alex-VirtualBox:~$ sudo install gimp
alex@alex-VirtualBox:~$ sudo remove gimp
-------------------------------------------------------------------
Задание 8.
alex@alex-VirtualBox:~$ crontab -e
*/3 * * * * bash /home/alex/timeR.sh
alex@alex-VirtualBox:~$ cat timeR.sh
#!/bin/bash
mkdir /home/alex/dir_$(date +%M) && ls /home/alex/ >>ls.log && mv ls.log
/home/alex/dir_$(date +%M)
-------------------------------------------------------------------