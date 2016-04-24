package application;

import java.util.Random;


public class LaunchClass {
	
	public String dictFile = "/Users/inna/Documents/Java/Coursera/CourseraTextEditor/data/dict.txt";
	
	public LaunchClass() {
		super();
	}
	
	public document.Document getDocument(String text) {
		// Change this to BasicDocument(text) for week 1 only
		//TODO change back!!!
		return new document.EfficientDocument(text);
		//return new document.BasicDocument(text);
	}
	
	public textgen.MarkovTextGenerator getMTG() {
		return new textgen.MarkovTextGeneratorLoL(new Random());
	}
	
	public spelling.WordPath getWordPath() {
		return new spelling.WPTree();
	}
	
    public spelling.AutoComplete getAutoComplete() {
        AutoCompleteMatchCase tr = new AutoCompleteMatchCase();
        spelling.DictionaryLoader.loadDictionary(tr, dictFile);
        return tr;
    }
    
    public spelling.Dictionary getDictionary() {
        spelling.Dictionary d = new spelling.DictionaryBST();
        spelling.DictionaryLoader.loadDictionary(d, dictFile);
    	return d;
    }
    
    public spelling.SpellingSuggest getSpellingSuggest(spelling.Dictionary dic) {
    	//return new spelling.SpellingSuggestNW(new spelling.NearbyWords(dic));
    	return new spelling.NearbyWords(dic);
    
    }
}
