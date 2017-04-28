# Hacker Rank Capture the Flag 2017-04-26
# Extract information from a given website and submit the specified output as Plain Text.
# https://www.hackerrank.com/contests/capture-the-flag/challenges/secret-key

import urllib.request, json

secret_keys_url         =  "https://cdn.hackerrank.com/hackerrank/static/contests/capture-the-flag/secret/key.json"
secret_news_base_url    =  "https://cdn.hackerrank.com/hackerrank/static/contests/capture-the-flag/secret/secret_json/"

'''
Access the secret url
'''
def get_secret_news(secret_key):
    secret_news_url = secret_news_base_url + secret_key + ".json"
    with urllib.request.urlopen(secret_news_url) as url:
        data = json.loads(url.read().decode())
        return data['news_title']
        
 
if __name__ == "__main__":
    list = []
    with urllib.request.urlopen(secret_keys_url) as url:
        data = json.loads(url.read().decode())
        for key in data:
            list.append(get_secret_news(key))
            
    upperList = sorted([x for x in list if x[0].isupper()])
    lowerList = sorted([x for x in list if x[0].islower()])
    
    for news in upperList:
        print(news)
        
    for news in lowerList:
        print(news)
    