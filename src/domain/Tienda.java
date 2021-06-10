package domain;


import domain.ListaGenerica;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Tienda {

    private ArrayList<Producto> productos;
    private int caja;


    public Tienda(ArrayList<Producto> productos, int caja) {
        this.productos = productos;
        this.caja = caja;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public int getCaja() {
        return caja;
    }

    public void setCaja(int caja) {
        this.caja = caja;
    }

    public void retirarDeCaja (){
        Scanner scanner = new Scanner(System.in);
        int cantidad = 0;

        while (cantidad==0){

            scanner.nextLine();

            try{
                System.out.println("Ingrese la cantidad a retirar");
                cantidad = scanner.nextInt();
            }catch (InputMismatchException e){                      ///verifica que se haya ingresado un numero
                System.out.println("Debe ingresar un numero");
            }catch (Exception e){
                e.getMessage();
            }
        }

        if (caja>cantidad){                                   ///verifica que el monto sea menor al existente en caja
            caja-=cantidad;}
        else{
            System.out.println("El monto indicado es mayor al existente en la caja");
        }
        System.out.println("Retiro de caja registrado");
    }

    public void reponerCaja (){

        Scanner scanner = new Scanner(System.in);
        int cantidad = 0;

        while (cantidad==0){

            scanner.nextLine();

            try{
                System.out.println("Ingrese la cantidad a reponer");
                cantidad = scanner.nextInt();
            }catch (InputMismatchException e){                      ///verifica que se haya ingresado un numero
                System.out.println("Debe ingresar un numero");
            }catch (Exception e){
                e.getMessage();
            }
        }

            caja+=cantidad;

        System.out.println("Reposicion de caja registrada");

    }

    public void vender() {

        mostrarIdProductos();                                            ///se muestran los id de los productos

        Scanner scanner = new Scanner(System.in);

        int id = -1;
        int cantidad = 0;

        while (id == -1) {
            scanner.nextLine();
            try {
                System.out.println("Ingrese el Id del producto a vender"); ///se pide el id del producto a vender
                id = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar un numero");           ///se verifica que se haya ingresado un num
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

        if (productos.size() >= id) {                 /// verifica que el id exista, si existe continua

            while (cantidad == 0) {
                scanner.nextLine();
                try {
                    System.out.println("Ingrese cantidad a vender");
                    cantidad = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Debe ingresar un numero");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

            if (cantidad < productos.get(id).stock) {            ///verifica que haya stock suficiente

                productos.get(id).stock-=cantidad;
            } else { System.out.println("Stock insuficiente");
            }

        }else{ System.out.println("Id inexistente");
        }


    }

    public void reponerStock() {

        mostrarIdProductos();                                            ///se muestran los id de los productos
                                                                         /// para los id de los productos uso el indice
        Scanner scanner = new Scanner(System.in);                        ///en la lista

        int id = -1;
        int cantidad = 0;

        while (id == -1) {
            scanner.nextLine();
            try {
                System.out.println("Ingrese el Id del producto a reponer"); ///se pide el id del producto a vender
                id = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar un numero");           ///se verifica que se haya ingresado un num
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

        if (productos.size() >= id) {                 /// verifica que el id exista, si existe continua

            while (cantidad == 0) {
                scanner.nextLine();
                try {
                    System.out.println("Ingrese cantidad a reponer");
                    cantidad = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Debe ingresar un numero");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

            productos.get(id).stock += cantidad;
            System.out.println("Stock repuesto");


        } else {
            System.out.println("Id inexistente");
        }
    }

    public void agregarProducto (Producto productoAgregado){

        boolean existe = false;

        for (Producto producto:productos
             ) {
            if (productoAgregado.getNombreProducto().equals(producto.getNombreProducto())) {
                System.out.println("El producto que desea agregar ya existe en la tienda");
                existe=true;
            }
        }
        if (!existe){
        productos.add(productoAgregado);}
    }

    public void quitarProducto (){

      mostrarIdProductos();
      int id=-1;

      Scanner scanner = new Scanner(System.in);

      while (id==-1) {
          scanner.nextLine();

          try{
          System.out.println("Ingrese id del producto a quitar");
          id = scanner.nextInt();
             }
            catch (InputMismatchException e){
                System.out.println("Debe ingresar un numero");
            }
      }

      if (productos.size()>=id){
         productos.remove(id);
         System.out.println("Producto removido");}
      else { System.out.println("Id inexistente");

      }
    }

    public void mostrarIdProductos (){
       int i;
       for (i=0;i<productos.size();i++){

           System.out.println("Id producto: " + i + " " + productos.get(i).getNombreProducto());


       }}


    @Override
    public String toString() {
        return "Tienda{" +
                "productos=" + productos +
                "\n caja=" + caja +
                '}';
    }
}
