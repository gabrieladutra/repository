## Basic Review  ##
Version Contol, Git and GitHub

# Scenes #
==Local version control 
==Centralized Version Control **CVSs** 
==Distribuited  Version Control **DVCs - Git**
== Local X  Remote

# Review #

Local version Control is a way to control the changes in a file with *patches*.  
First you need a copy of source file,  so you do all modifications and use a diff or patch command to extract only modifications and share only the patch.
-> Diff : algorithm that compare two files and extract the diferences

>Advantages : You only share the patches, don't need to maintain many files with changes.
> Disadvantages : You dont garantee the integrity of versions, you can overwrite your file and so on.

CVS is a way to control the versions using a central server
Advantages : Used in small projects with delimited tasks and people know all project
> Disadvantages :  You can overwrtite things, block acess ,you cant garantee the integrity of versions

DVS is a way to control the versions with a central master version and people who are participate of project can get a copy, do the changes and merge the changes with a master version 
> Advantages : Everybody can colaborate with the code, and there are a integrity of versions 
> Disadvantages :  I dont know


**** How does git work ? ****
There are three states of a version in git
1- *Modified*: In this state file is modified
2- *Staged* : After you gave a command `git add ` the files with modificatins are ready to be commited 
3 - Commited : With the command`git commit ` the changes will be encapsulated in a object with metadata(header) and have a address (encriptaded with SHA-1 -> 40 hexadecimal characteres HASH)

-> The commit is a dot in timeline,
-> Branch master is a timeline , and other branches are a shortcuts of master
-> Merge : Combine changes into master 

**** GitHUB
Remote repository, is a visual way to lead with git 
You can have a local repository (copy) in a remote with github

