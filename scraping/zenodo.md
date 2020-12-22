![](../semanticsearch/logo.svg)

# Scraping Documentation
[Back to main page](index.html)

## Zenodo

### Notes
Zenodo provides a [REST API](https://developers.zenodo.org/#rest-api) that interacts with their elastic search backend to handle CLI requests. The basic usage is:
```python
import requests
response = requests.get('https://zenodo.org/api/records',
                        params={'q': 'query string goes here',
                                'access_token': ACCESS_TOKEN})
print(response.json())
```
Strangely, the REST API limits the number of responses for a given request to 10,000. Therefore, we can't just scrape everything by making a blank request and iterating through the results.

### Dictionary attack
To get around the weird API limit, we tried a dictionary attack - that is, make a request where the query is any valid string at all, starting with all the single valid chars:
```python
def try_query(data, query):
    start = len(data)
    response = requests.get('https://zenodo.org/api/records',
                            params={'q': query,
                                    'sort': 'mostrecent',
                                    'type': 'dataset',
                                    'size': 10000,
                                    'access_token': ACCESS_TOKEN})

    hits = response.json()['hits']['hits']
    for hit in hits:
        if hit['metadata']['resource_type']['type'] == 'dataset':
            try:
                k,v = format_hit(hit)
            except Exception as e:
                print(type(e), e, hit['id'])
            data[k] = v
    end = len(data)

data = {}
for char in string.ascii_lowercase:
        try_query(data, char)
```
This asymptotically should work, but in practice only gets us around 2/3rds of the datasets within a reasonable amount of time...

### Date-based
How did Dustin solve date-based? REST API does not allow date-based queries, must go directly through front-facing search which has more features.