1. In your terminal window, navigate to a directory where you would like to clone the GitHub project.  In this
example, the directory `/Documents/GitHub` will be used as the root directory for cloning the `LakeshoreMarketPlace` project.

```bash
vismarkjuarez@MacBook-Pro~$ cd Documents/GitHub
vismarkjuarez@MacBook-Pro~/Documents/GitHub$
```

2. Now, clone the project repository by running the following git command:

```bash
vismarkjuarez@MacBook-Pro~/Documents/GitHub$ git clone https://github.com/VismarkJuarez/LakeshoreMarketplace.git
Cloning into 'LakeshoreMarketplace'...
remote: Enumerating objects: 68, done.
remote: Counting objects: 100% (68/68), done.
remote: Compressing objects: 100% (43/43), done.
remote: Total 68 (delta 8), reused 60 (delta 7), pack-reused 0
Receiving objects: 100% (68/68), 13.14 KiB | 3.28 MiB/s, done.
Resolving deltas: 100% (8/8), done.
```

3. Now, open Eclipse and click on `File -> 'Open Projects from File System'` .  You will be prompted to specify the `Import source`, which is simply full path on your computer where your project is located.  In this example, we cloned the `LakeshoreMarketplace` project into the computer's `Documents/GitHub` directory. Click on the `Directory` button, navigate and and select the project folder (`Documents/GitHub/LakeshoreMarketplace`).