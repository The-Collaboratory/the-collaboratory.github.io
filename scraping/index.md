![](../semanticsearch/logo.svg)

# Scraping Documentation



- [How to use this page](#using-this-page)
- [Collaboratory Backend API](backend.html)
- Repositories
    - [Zenodo](zenodo.html)
    - Add more repositories here!

## Using this page
These pages are made by compiling markdown files ([guide](https://commonmark.org/help/), [origin](https://daringfireball.net/projects/markdown/)) into html using [pandoc](https://pandoc.org/), a really lovely universal document converter.

Pre-reqs:

Get pandoc: [install guide](https://pandoc.org/installing.html), or just:
```sh
# For macOS. Your OS's package manager should have as well.
brew install pandoc
```

Download this repo from our GitHub.
```sh
# This will only work after you get access rights
git clone git@github.com:The-Collaboratory/the-collaboratory.github.io.git
```

You'll be working in the scraping directory:
```sh
cd the-collaboratory.github.io/scraping
```

You'll see a markdown compiler script `compilemd.sh`. Use this to easily compile markdown files to html.
```sh
# also you may have to set the execution bit
chmod +x compilemd.sh
```

To make a new page, create a repository.md file. When you're ready, use the compiler to get html out!
```sh
# For example, to make a new Zenodo documentation page
touch zenodo.md
# Start editing!
emacs zenodo.md
# Compile results!
compilemd.sh zenodo.md
```
