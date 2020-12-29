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

# Repositories to attack!

- [Data Dryad](https://datadryad.org/stash)
- [NIST](https://data.nist.gov/sdp/#/)
- [IUCR](https://www.iucr.org/resources/data/databases)
- [ICDD](https://www.icdd.com/)
- [Other Crystallographic](https://en.wikipedia.org/wiki/Crystallographic_database#External_links)
- [NIST Standard Reference](https://www.nist.gov/srd/nist-standard-reference-database-3)
- [Materials Genome Initiative](https://www.mgi.gov/)
- [Materials Project](https://www.materialsproject.org/)
- [NIST Chemistry](https://webbook.nist.gov/chemistry/)
- [Other Chemistry](https://en.wikipedia.org/wiki/List_of_chemical_databases)
- [Atmospheric Radiation Measurement Climate Data](https://adc.arm.gov/armlogin/login.jsp)
- [MDMC](https://www.grantadesign.com/industry/collaborations/consortia/mdmc/)
