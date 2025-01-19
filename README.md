# JavaCrawler

A Google crawler that extracts urls from the search engine. 

## Compilation 
Download the Selenium package https://www.selenium.dev/downloads/, after extraction you will find a jar selenium-java-<version>.jar, the main Selenium library and the rest of jars. 
The compilation goes as follow : 

<pre>
javac -cp "C:\path\to\selenium-java-<version>.jar;C:\path\to\libs\*" GoogleCrawler.java
</pre>

## Execution
To run the crawler enter the following command : 
<pre>
java -cp ".:C:\path\to\selenium-java-<version>.jar;C:\path\to\libs\*" GoogleCrawler
</pre>