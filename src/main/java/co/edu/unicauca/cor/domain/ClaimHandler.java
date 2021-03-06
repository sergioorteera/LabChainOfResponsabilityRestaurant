package co.edu.unicauca.cor.domain;

/**
 * 
 *
 * @author Sergio Erazo, Camilo Perafan
 */
public abstract class ClaimHandler {

    private ClaimHandler nextHandler;
    private String email;

    public ClaimHandler(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public abstract boolean attend(Claim request);

    public ClaimHandler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(ClaimHandler handler) {
        nextHandler = handler;
    }
}
