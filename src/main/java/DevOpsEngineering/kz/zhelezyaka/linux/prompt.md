This file is intended for storing basic administration commands
___________________
#####backup
// we make backup mbr
+ dd if=/dev/sda of=/root/backup.mbr bs=512 count=1