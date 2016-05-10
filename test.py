
from bs4 import BeautifulSoup

import requests
import unicodedata
filename = raw_input('Enter the topic you wish to use  ')
path="https://twitter.com/"
filepath=path+filename+"?lang=en";
f = open('out.txt', 'w')
url=filepath
req = requests.get(url)
data=req.text
soup=BeautifulSoup(data,"lxml")
text=soup.find_all('p')
#s=unicodedata.normalize('NFKD', title).encode('ascii','ignore')	
for s in text:
    s=s.getText()
    sd=unicodedata.normalize('NFKD', s).encode('ascii','ignore')
    f.write('\n'+sd+'\n')
if (f!=None):
    print "Data Succesfully written to a file out.txt"
    f.close()
else:
    print "Data writing failed..."
           
