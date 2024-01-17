# Git and Github

## Introduction
1. `Git`- A version control system used to track changes
2. `Github`- Used tp track the changes and keep a note of it in a website


## Setup
+ Set a name- `git config --global user.name “sayanbose-0000”`
+ Set a email- `git config --global user.email “bosesayan0000@gmail.com”`
+ Check the name and email id- `git config --list`


## Git and Github Commands

### 1. Git basic commands (clone, add, commit, check status, push)
(First create a repo in github using gui and then using git)
+ Clone a repo- `git clone https://github.com/sayanbose-0000/hello-world.git` <br>
[Github Link](https://github.com/sayanbose-0000/hello-world.git)
(copy the https link from Github Repo > Code > Local > Https)
+ Check unadded and uncommitted changes- `git status`
+ Add a file- `git add hello.cpp`
+ Add all files together-  `git add .`
+ Commit added files- `git commit -m "Added some simple files"`
+ Pushing to Github- `git push origin main`
+ See all prv commits in git- `git log`

### 2. Git first then github
(Git using terminal first and then using github)
+ Create new git repo from terminal- `git init` 
+ type these-
    ```
    git remote add origin https://github.com/sayanbose-0000/hello_earthlings.git

    git branch -M main

    git push origin main
    ```
    (` git branch -M main` is necessary- master is the default branch name in git. However, due to changes in github policies, github calls it main branch. So, we rename the master branch to main branch for the same)

+ check origin- `git remote -v`
+ check branch- `git branch`
+ change branch name- `git branch -M main` (here main is the branch name)

### 3. Branch Commands
+ check current branch and all branchse- `git branch` <br>
(`*` shows the current branch name)
+ rename branch- `git branch -M main`<br>
 (master is the default branch name in git. However, due to changes in github policies, github calls it main branch. So, we rename the master branch to main branch for the same)
+ switch to other branch- `git checkout branch_name`
+ create new branch- `git checkout -b branch_name`
+ delete branch- `git branch -d branch_name`<br>
(we can not delete current branch, swtich to another branch to delete the current branch)

### 4. Merging Branches
Two methods:
+ #### Way 1 (using Git)
    - Compare the branches- `git diff branch_name`
    - merging branhes- `git merge branch_name`

+ #### Way 2 (using PR- Pull Request in Github)
    - follow gui options in github website
    - change the same in git- `git pull origin main`

### 5. Undoing Changes
+ staged changes (staged by mistake)
    - resetting a particular file- `git reset file_name`
    - resetting all files together- `git reset`

+ committed changes (comitted by mistake)
    - for going back one commit- `git reset HEAD~1`
    - for going back many commits- `git reset --hard commit_hash` <br>
    (note the commit's hash and type it here)
