package com.madeinhk.model;

import android.test.AndroidTestCase;

import junit.framework.Assert;

import java.util.List;


public class ECDictionaryTest extends AndroidTestCase {

    public void setUp() {
        super.setUp();

    }

    public void tearDown() {

    }


    public void testLookup() {
        ECDictionary ecDictionary = new ECDictionary(getContext());
        Word word = ecDictionary.lookup("sun");
        List<Word.TypeEntry> mTypeEntry = word.mTypeEntry;
        Assert.assertEquals(5, mTypeEntry.size());
    }


    public void testLookupBeautiful() {
        ECDictionary ecDictionary = new ECDictionary(getContext());
        Word word = ecDictionary.lookup("flick");
    }
    public void testLookupInstitute() {
        ECDictionary ecDictionary = new ECDictionary(getContext());
        Word word = ecDictionary.lookup("institute");
    }




}