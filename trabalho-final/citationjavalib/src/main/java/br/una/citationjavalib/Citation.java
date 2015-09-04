package br.una.citationjavalib;


public class Citation {
    private String authorName;
    private String citation;

    public Citation(String authorName, String citation) {
        super();
        this.citation = citation;
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getCitation() {
        return citation;
    }

    public void setCitation(String citation) {
        this.citation = citation;
    }
}
