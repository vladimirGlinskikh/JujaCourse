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