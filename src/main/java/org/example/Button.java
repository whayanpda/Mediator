package org.example;

public class Button extends Widget {
    private boolean enabled;

    public Button(DialogDirector director) {
        super(director);
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
        System.out.println("Botão de login " + (enabled ? "habilitado" : "desabilitado"));
    }

    public boolean isEnabled() {
        return enabled;
    }
}