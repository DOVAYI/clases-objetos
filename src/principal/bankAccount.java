package principal;

/**
 * clase que representa una cuenta bancaria
 *
 * @author Luis Alfredo Romero
 */
public class bankAccount {

    /**
     * este atributo representa el numero de cuenta bancaria
     */
    private int accountNumber;
    /**
     * este atributo representa si esta activa la cuenta bancaria
     */
    protected boolean activated = true;
    /**
     * este atributo nos indica si hay saldo en la cuenta
     */
    private float balance;

    /**
     * constructor vacio para instanciar la clase sin inicializar los atributos
     */
    public bankAccount() {
    }

    /**
     * constructor para instanciar la clase, con la opción de inicilizar
     * atributos
     *
     * @param accountNumber requiere numero de cuanta bancaria
     * @param activated requiere indicar si la cuenta esta activa
     * @param balance requiere iniciar saldo
     */
    public bankAccount(int accountNumber, boolean activated, float balance) {

        this.accountNumber = accountNumber;
        this.activated = activated;
        this.balance = balance;

    }

    /**
     * metodo para obtener el saldo
     *
     * @return retorna saldo actual;
     */
    public float getBalance() {
        return balance;
    }

    /**
     * metodo para obtener el numero de cuenta
     *
     * @return retorna el numero de cuenta
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * metodo permite inicilizar o cambiar valor numero de cuenta;
     *
     * @param accountNumber
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * metodo permite obtener el estado de la cuenta
     *
     * @return retorna booleano para indicar si la cuenta esta activa
     */
    public boolean isActivated() {
        return activated;
    }

    /**
     * metodo permite cambiar el estado de la cuenta
     *
     * @param activated recibe true o false para indicar el estado de la cuenta
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    /**
     * me permite calcular el saldo cuando se hace un retiro
     *
     * @param amount representa el monto a retirar,pero es posible la operacion, si la cuenta esta true y monto es menor o 
     * igual al saldo
     * @return retorna el saldo restante
     */
    protected float withdrawa(float amount) {
        if (activated) {
            if (balance >=amount) {
                balance = balance - amount;
                return getBalance();
            }else{
                return 0;
            }
        } else {
            return 0;
        }

    }

}
