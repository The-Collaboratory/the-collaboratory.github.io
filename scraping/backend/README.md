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
| doc_type | "DATASET" or "PAPER" | YES | String |
| publication_date | YYYY-MM-DD formatted date | NO | String |
| doi | The [DOI](https://www.doi.org/) string | NO | String |
| external_code      | Unique identifier for this document in the context of it's publisher    | NO | String |
| publisher | The dataset publisher, e.g. "Zenodo" | YES | String |
| unstructured_authors | Used when the author information cannot be parsed into structured data | NO | String |
| structured_authors | See below | NO | List of objects |
| files | See below | NO | List of objects |
| meta_data | Extra information. Unspecified. | NO | String |

"structuredAuthors" key should look like this:

```json
"structuredAuthors" : [
	{
		"name": "Author 1 Name",
		"affiliation" : "University of Author 1",
		"orcid" : "0000-0002-1825-0097"
	},
	{
		"name":	"Author	2 Name",
                "affiliation" :	"University of Author 2",
                "orcid"	: "0000-0002-1825-0097"
	},
	...
]
```
Only "name" is required.


"files" key should look like this:

```json
"files" : 
	{
		"Argentina_Camarones.xlsx", "Argentina_Camarones_v1.1.xlsx"
	}
	...
Only the "filename" is required.


## Response
The backend should give you a response status code:

| code | meaning |
| --- | --- |
| 200 | OK |

TODO: improve HTTP codes for failure responses.

Body:

```json
{
	"https://doi.org/10.5281/zenodo.4091366":"SUCCESS",
	"https://doi.org/10.5281/zenodo.4090873":"ERROR"
}
```
