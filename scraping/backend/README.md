![](../semanticsearch/logo.svg)

# Scraping Documentation
[Back to main page](README.md)

## Backend
After you've scraped the metadata from a repository, you need to upload the results to The Collaboratory's backend to automatically get it added to our database to search through.

Note to self: Consider supplying script to scrapers that checks specification conformation.

Backend spec:

| Key      | Value Description | Required? | Type |
| ----------- | -----------    | -----------  | ----------- |
| title      | The title of the dataset          | YES | String |
| abstract   | The description of the dataset           | YES | String|
| link | A working link to the dataset | YES | String |
| doc_type | DATASET | YES | String |
| publication_date | YYYY-MM-DD formatted date | NO | String |
| doi | The [DOI](https://www.doi.org/) string | NO | String |
| publisher | The dataset publisher, e.g. zenodo | NO | String |
| authors | See below | NO | Array of dicts/json |
| files | List of filenames | NO | List of strings |
| meta_data | Extra information. Unspecified. | NO | String |

"authors" key should look like this:

```json
"authors" : [
	{
		"name": "Author 1 Name",
		"affiliation" : "University of Author 1",
		"orcid" : "orcid id"
	},
	{
		"name":	"Author	2 Name",
                "affiliation" :	"University of Author 2",
                "orcid"	: "orcid id"
	},
	...
]
```

## Response
The backend should give you a response status code:

| code | meaning |
| --- | --- |
| 200 | OK |
| 504? | NOT OK |

Ask Rafa to fill in these details