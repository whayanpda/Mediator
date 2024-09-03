package org.example;

public class EntryField extends Widget {
    private String text = "";

    public EntryField(DialogDirector director) {
        super(director);
    }

    public void setText(String text) {
        this.text = text;
        changed();
    }

    public String getText() {
        return text;
    }
}


