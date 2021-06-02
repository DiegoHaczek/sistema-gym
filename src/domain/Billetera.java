package domain;

public interface Billetera {

    void initBilletera(); //Aca se inicia el atributo saldo, puede ser 0, un numero random o el que quieran.

    boolean pagar(int debito); //En un principio se resta el int pasado por parametro,
                               //es boolean ya que si saldo > debito, retorna true. si saldo < debito retorna false,
                               //permitiendo modificar que pasa si retorna true y que pasa si retorna false.

    void agregar(int credito); //En un principio se suma el int pasado por parametro.

    void verSaldo(); //Se muestra el atributo saldo y los datos necesarios segun la clase donde se aplique la interfaz.

}
