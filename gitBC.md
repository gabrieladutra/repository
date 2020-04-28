## GIT E GITHUB
Local and Remote Repository

# SCENES
Version Control 

## Basic Commmands
-To start a local repository (.git)
`git init`

-To configure a user name and user email
`git config --global user.name "userName" `
`git config --global user.email "userEmail" `
`git config credential.helper store`

-To add changes ready to commit
`git add filename` A specic file
`git add .` all files in the same commit

-To commit changes
`git commit -m "Commit message"`

-To show the changes 
`git show`

-To show the commit timeline 
`git log`

-To create a new branch 
`git branch branchName`
**Does not work with empty repository**

-To switch branches
`git checkout branchName` `git checkout master`

-To merge the changes into master 
`git merge branchname`

**Always create a empty remote repository**

-To add remote repository on local
`git remote add origin https://github.com/gabrieladutra/gitTest.git`

To add local repository in a remote master 
`git push -u origin master`
**Pay attetion: This command will put everytrhing on a remote repository**


echo "# repository" >> README.md
git init
git add README.md
git commit -m "first commit"
git remote add origin https://github.com/gabrieladutra/repository.git
git push -u origin master