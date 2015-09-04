package com.udacity.gradle.builditbigger;

import android.app.Application;
import android.test.ApplicationTestCase;

import java.util.List;

import br.una.citationjavalib.Citation;
import br.una.citationjavalib.CitationProvider;

public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    public void testCitation() {
        List<Citation> citations = CitationProvider.getInstance().getAllCitations();

        for (Citation citation : citations) {
            assertNotNull(citation);
            assertFalse(citation.getCitation().isEmpty());
            assertFalse(citation.getAuthorName().isEmpty());
            assertFalse("O nome do autor " + citation.getAuthorName() + " tem mais de 30 caracteres.", citation
                    .getAuthorName().length() > 30);
            assertFalse(citation.getCitation().length() > 200);
        }

        for (int i = 0; i < citations.size(); i++) {
            Citation cit = CitationProvider.getInstance().getCitation();
            Citation cit2 = CitationProvider.getInstance().getCitation();

            assertNotSame(cit, cit2);
        }
    }
}