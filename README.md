Project for testing git function

- Notice for pushing with Intellij IDEA
    + If pushing failed, setting ./.git/config file like this:
    Before:
        [remote "origin"]
            url = https://github.com/SanmaNKS/git-test2.git
            fetch = +refs/heads/*:refs/remotes/origin/*
    After:
        [remote "origin"]
            url = https://SanmaNKS@github.com/SanmaNKS/git-test2.git
            fetch = +refs/heads/*:refs/remotes/origin/*