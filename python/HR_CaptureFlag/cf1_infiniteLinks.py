# Hacker Rank Capture the Flag 2017-04-26
# Extract information from a given website and submit the specified output as Plain Text.
# https://www.hackerrank.com/contests/capture-the-flag/challenges/infinite-links

import requests
from lxml import html

base_url   = "https://cdn.hackerrank.com/hackerrank/static/contests/capture-the-flag/infinite/"
start_page = 'qds.html'

visitedPages   = []
collected_text = []

def visit_page(page):
    visitedPages.append(page)
    tree      =  html.fromstring(requests.get(base_url + page).content)
    text_list = tree.xpath('//div/font/text()') 
 
    if text_list:
        collected_text.append(text_list[0])
        
    links = tree.xpath('//div/a/@href')
    
    for link in links:
        if link not in visitedPages:
            visit_page(link)
    



if __name__ == "__main__":
    visit_page(start_page)
    print('Visited ' + str(len(visitedPages)))
    
    upperList = sorted([x for x in collected_text if x[0].isupper()])
    lowerList = sorted([x for x in collected_text if x[0].islower()])
    
    print('----------')
    for news in upperList:
        print(news)
        
    for news in lowerList:
        print(news)
        
    
    
    