package domain;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Producto {

    private String nombreProducto;
    int stock;

    public Producto() {
        CrearProducto();
    }

    public Producto(String nombreProducto, int stock) {
        this.nombreProducto = nombreProducto;
        this.stock = stock;
    }

    public void CrearProducto(){

        Scanner scanner = new Scanner(System.in);

        while (this.nombreProducto==null){
            try{
            System.out.println("Ingrese el nombre del producto");
            this.nombreProducto = scanner.next();}
                catch (Exception e){
                    e.getMessage();
                }}

         while (this.stock==0){
        scanner.nextLine();
            try{
            System.out.println("Ingrese Stock del producto");
                this.stock= scanner.nextInt();
                }
                catch (InputMismatchException e){
                    System.out.println("Debe ingresar un numero");
                }
                catch (Exception e){
                    e.getMessage();
                }}

    }

    ///region getters y setters


    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


    ///endregion

    @Override
    public String toString() {
        return "\n Producto{" +
               " " +nombreProducto +
                ", stock=" + stock +
                '}';
    }

}
