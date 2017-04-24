**TESTING GIT FUNCTION**

- Notice for pushing with Intellij IDEA
    + If pushing failed, setting ./.git/config file like this:
    Before:
        ```
        [remote "origin"]
            url = https://github.com/SanmaNKS/git-test2.git
            fetch = +refs/heads/*:refs/remotes/origin/*
        ```
        After:
        ```
        [remote "origin"]
            url = https://SanmaNKS@github.com/SanmaNKS/git-test2.git
            fetch = +refs/heads/*:refs/remotes/origin/*
        ```
    + Try to push again, input password and complete pushing
    
- Markdown README.md guide
    
    Install IDEA Markdown plugin first
    https://confluence.atlassian.com/bitbucketserver/markdown-syntax-guide-776639995.html