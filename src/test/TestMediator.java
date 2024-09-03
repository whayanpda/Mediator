import org.example.*;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestMediator {

    @Test
    public void testButtonInitiallyDisabled() {

        LoginDialogDirector dialog = new LoginDialogDirector();
        dialog.createWidgets();


        assertFalse(dialog.getLoginButton().isEnabled(), "O botão de login deve estar desabilitado inicialmente.");
    }

    @Test
    public void testButtonEnabledWhenFieldsAreFilled() {

        LoginDialogDirector dialog = new LoginDialogDirector();
        dialog.createWidgets();


        dialog.getUsernameField().setText("usuario");
        dialog.getPasswordField().setText("senha");


        assertTrue(dialog.getLoginButton().isEnabled(), "O botão de login deve estar habilitado quando ambos os campos estão preenchidos.");
    }

    @Test
    public void testButtonDisabledWhenUsernameFieldIsEmpty() {

        LoginDialogDirector dialog = new LoginDialogDirector();
        dialog.createWidgets();


        dialog.getPasswordField().setText("senha");


        assertFalse(dialog.getLoginButton().isEnabled(), "O botão de login deve estar desabilitado quando o campo de nome de usuário está vazio.");
    }

    @Test
    public void testButtonDisabledWhenPasswordFieldIsEmpty() {

        LoginDialogDirector dialog = new LoginDialogDirector();
        dialog.createWidgets();


        dialog.getUsernameField().setText("usuario");


        assertFalse(dialog.getLoginButton().isEnabled(), "O botão de login deve estar desabilitado quando o campo de senha está vazio.");
    }

    @Test
    public void testButtonDisabledWhenBothFieldsAreEmpty() {

        LoginDialogDirector dialog = new LoginDialogDirector();
        dialog.createWidgets();


        dialog.getUsernameField().setText("");
        dialog.getPasswordField().setText("");


        assertFalse(dialog.getLoginButton().isEnabled(), "O botão de login deve estar desabilitado quando ambos os campos estão vazios.");
    }
}
