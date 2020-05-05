## Basic Commands on Terminal
-To change directory 
`cd directory`
`cd ..` one directory above 
`cd . ` this directory 
`-la` hidden directories 
-l long
cd $HOME
cd ~/Documents  Tilde Expression

> .folder (hidden file)

-To create a new file 
`touch filename.txt` 

-To create a new folder
`mkdir foldername`

-To remove a file 
`rm filename.txt`

-To remove a empty folder
`rmdir foldername`

-To remove a folder with contents
`sudo rm -r foldername`
> -r // remove the directory and contents recursively

-To change owenership
`chown user file.txt`

-To print working directory
`pwd`

-To input strings in a file 
`echo "blablabla" >> a.txt`

-To concatenete and get small file content
`cat filename`

-To change file permissions
`chmod +x file`
>700: only owner has full acess 
> 755 : other user can list 
> 777 : No restrictions 
> rwx - read , write exexecute
> -file d directory

----Advanced|old commands---------
`ps` - Bash process  `ps aux` all system process

ag - silverseacher 

`ps aux | ag  bash | awk '{ print $2 }' ` == 
| connect Sout to Sinput

-To create a file system link
`ln -s originfile destinationfile` `ln -s a.txt b.txt`
> the same comand for directories

### Main Directories ###

/root : root's Home
/var :  variable data  -> pids (process Id)
/proc : process
/tmp : temporary 
/boot : *vmlixux... (lixux Kernel -> SO,drivers -> First to init) (inittdr.... Ram disk Second to init)*
> Slink  shortcut -> vmlixux and inittdr has a slink on /
/opt : outside programs 
/sbin : system binaries (so) 
/bin : system binaries **bash, mkdir, echo , ping , su**
/usr : Unix System Resources -> user applications 