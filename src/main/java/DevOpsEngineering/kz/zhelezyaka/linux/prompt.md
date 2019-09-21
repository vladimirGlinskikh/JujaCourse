This file is intended for storing basic administration commands
___________________
  ##### backup
// we make backup mbr
 
dd if=/dev/sda of=/root/backup.mbr bs=512 count=1

   ##### make the file executable
 chmod u+x some file name or script name
 
   ##### APT
 
 * apt-get: for download and install packages
 * apt-cache: for search packages
 * aptitude: full package management with pseudo-graphics option
 
   /etc/apt/source.list - list of repositories