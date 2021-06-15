package domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Contabilidad implements Billetera{

    public String nombre = "";
    private int caja;
    public LocalDate fechaHoy = LocalDate.now();
    public DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/u");
    public Map<LocalDate,Integer> movimientos = new HashMap<>();
    public Map<FrecuenciaPago,Integer> precios = new HashMap<>();

    public Contabilidad(String nombre) {
        this.nombre = nombre;
        precios.put(FrecuenciaPago.DIARIA,300);
        precios.put(FrecuenciaPago.SEMANAL,1000);
        precios.put(FrecuenciaPago.MENSUAL,2500);
    }

    @Override
    public void initBilletera() {
        caja = 0;
    }

    @Override
    public boolean pagar(int debito) {
        movimientos.put(fechaHoy,debito * -1); //lo multiplico por -1 para hacerlo negativo y que se note que es un debito
        return true;
    }

    @Override
    public void agregar(int credito) {
        caja += credito;
        movimientos.put(fechaHoy,credito);
    }

    @Override
    public void verSaldo() {
        System.out.println("El saldo actual de la caja es: $" + caja);
    }

}
