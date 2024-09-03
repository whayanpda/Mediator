package org.example;

public class LoginDialogDirector extends DialogDirector {
    private EntryField usernameField;
    private EntryField passwordField;
    private Button loginButton;

    @Override
    public void createWidgets() {
        usernameField = new EntryField(this);
        passwordField = new EntryField(this);
        loginButton = new Button(this);
        loginButton.setEnabled(false);
    }

    @Override
    public void widgetChanged(Widget widget) {
        boolean enableLogin = !usernameField.getText().isEmpty() && !passwordField.getText().isEmpty();
        loginButton.setEnabled(enableLogin);
    }


    public EntryField getUsernameField() {
        return usernameField;
    }

    public EntryField getPasswordField() {
        return passwordField;
    }

    public Button getLoginButton() {
        return loginButton;
    }
}
