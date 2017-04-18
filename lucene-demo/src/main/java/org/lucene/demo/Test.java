package org.lucene.demo;

public class Test {
    public static void main(String args[]) {
        Index newIndex = new Index();
        newIndex.index();
        Search newSearch = new Search();
        newSearch.search("UIMA");
    }
}
