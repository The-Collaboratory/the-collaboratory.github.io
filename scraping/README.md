![](../semanticsearch/logo.svg)

# Scraping Documentation

- [Getting Started](#getting-started)
- [Workflow](#workflow)
- [Reviewing](#reviewing)

_See also:_

- [Collaboratory Backend API](backend/README.md)
- [Scraping Snippets](https://github.com/The-Collaboratory/the-collaboratory.github.io/wiki/Scraping-Snippets)
- Repositories
  - [Zenodo](zenodo/README.md)
  - Add more repositories here!

<!-- @import "[TOC]" {cmd="toc" depthFrom=1 depthTo=6 orderedList=false} -->

## Getting Started

Download this repo from our GitHub.

```sh
# This will only work after you get access rights
git clone git@github.com:The-Collaboratory/the-collaboratory.github.io.git
```

You'll be working in the scraping directory:

```sh
cd the-collaboratory.github.io/scraping
```

## Workflow

### 1. Pick an Issue

Websites to scrape will be added as GitHub Issues, and show up automatically on the scraping [project page](https://github.com/The-Collaboratory/the-collaboratory.github.io/projects/1).

Go to that page, pick a task in the "To Do" column. Assign it to yourself and move it to "In Progress".

### 2. Make a branch

Before you start coding, create a new branch. Eg,

```sh
git checkout -b issue-1-scrape-zenodo
```

### 3. Make a new directory

In your branch, make a new directory within the scraping folder. Eg,

```sh
mkdir zenodo
cd zenodo
```

### 4. Scrape away!

Figure out how to scrape the desired data as robusty and completely as possible.

Don't include your `output.json` file for now.

Commit your changes to git and push to the remote repository as you go.

```sh
touch README.md
git add README.md
git commit -m "add readme to zenodo directory"
git push
```

The first time you push to a new branch:

    git push --set-upstream origin test

### 5. Document your solution

Create a README in your folder and document your solution using markdown syntax. See: ([guide](https://commonmark.org/help/), [origin](https://daringfireball.net/projects/markdown/)).

```sh
touch README.md
```

Your README should include:

- A high-level description of your approach, and potentially alternative approaches that you tried.
- Documentation of assumptions your code makes (Eg, "if more than 10,000 records were published on one day the scraper would only get the first 10,000.")
- Evaluation of the success. (How many records & how many fields were you able to scrape out of presumed total possible).

### 6. Create a pull request

When you think you're finished, open a pull reqest to merge your branch into master. You can do this from the GitHub website. Update the project board. Ask somebody on the scraping team to review your code (notes on this below).

### 7. Upload to backend

When the review is complete, upload your results to the backend using the API. See: [Collaboratory Backend API](backend/README.md)

### 8. Close the issue

When all this is complete, you can close the issue. The board will automatically update, moving the issue to "Done".

## Reviewing

Checking each other's code thoroughly ensures high quality results, and high quality, robust, reuable scrapers. To review someone's code you should audit the quality of the results and the quality of the underlying code. Reviewing should be an iterative process, of making suggestions, letting them improve the code, and then reviewing again until everything looks awesome.

### Quality of Results

1. Go the website, see what their records look like, note how many you think appear scrapable.
1. Read all the way thru their README.
1. Git checkout their branch and run the code on your machine.
1. Randomly spot check a handful of results in the output JSON against the pages they link to for quality control.

Do you think it's reasonable to get more results, more fields, or higher quality results? If so, tell them that in the discussion section of the pull request. This is okay!!

### Quality of Code

- Avoid hard-coded information that limits scraper flexibility. It should capture new data if it is run again in the future.
- Avoid failing silently. If you have to skip certain fields or documents because they're formatted badly, maybe log this so we can see how much we're skipping and if it's possible to improve the scraper instead.
- Standard [pep8](https://www.python.org/dev/peps/pep-0008/) python style? Ideally the code is run thru a linter built into most editors so no humans have to think about this too much.
- Small functions (20-30 lines max)

If there are issues with style, readability, or robustness of approach, tell them in the dicssuion section of the pull request.

# Repositories to attack!

(To choose a repository to work on, go to the [project page](https://github.com/The-Collaboratory/the-collaboratory.github.io/projects/1).)

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
