![](../semanticsearch/logo.svg)

# Scraping Documentation



- [How to use this page](#using-this-page)
- [Collaboratory Backend API](backend/README.md)
- Repositories
    - [Zenodo](zenodo/README.md)
    - Add more repositories here!

## Using this page
These pages are made using markdown files ([guide](https://commonmark.org/help/), [origin](https://daringfireball.net/projects/markdown/)) compiled by GitHub for README's

Pre-reqs:

Download this repo from our GitHub.
```sh
# This will only work after you get access rights
git clone git@github.com:The-Collaboratory/the-collaboratory.github.io.git
```

You'll be working in the scraping directory:
```sh
cd the-collaboratory.github.io/scraping
```

To make a new page, create a new repository directory.
```sh
# For example, to make a new Zenodo documentation page
mkdir zenodo
cd zenodo
# Start editing!
emacs README.md
# Push results!
git add README.md
git commit -m "first commit for zenodo repo"
git push
```
