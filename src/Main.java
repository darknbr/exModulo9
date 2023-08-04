import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) throws Exception {
        //usar stream min --> cliente que fez a menor quantidade de compras
        //usar stream max --> cliente que fez a maior quantidade de compras
        //usar mapToInt e average --> media de compras dos clientes

        List <Cliente> clientes = new ArrayList<>();

        clientes.add(new Cliente("Danillo", "Dias", 2));
        clientes.add(new Cliente("Daniel", "Dias", 4));
        clientes.add(new Cliente("Dianna", "Dias", 6));
        clientes.add(new Cliente("Douglas", "Bitencourt", 8));
        clientes.add(new Cliente("Marcelo", "Fernandes", 10));
        clientes.add(new Cliente("Marcio", "Silva", 12));
        clientes.add(new Cliente("Murilo", "Fonseca", 14));
        clientes.add(new Cliente("Sandro", "Perin", 16));
        clientes.add(new Cliente("Sobral", "Sousa",18));
        clientes.add(new Cliente("Elidiane", "Coimbra", 20));

        Cliente clienteMenorCompras = clientes.stream()
            .min(Comparator.comparingInt(Cliente::getCompras))
            .orElse(null);
        System.out.println("Cliente com menor quantidade de compras: " + clienteMenorCompras);


        Cliente clienteMaiorCompras = clientes.stream()
            .max(Comparator.comparingInt(Cliente::getCompras))
            .orElse(null);
        System.out.println("Cliente com menor quantidade de compras: " + clienteMaiorCompras);

        double mediaCompras = clientes.stream()
            .mapToInt(Cliente::getCompras)
            .average()
            .orElse(0);
        System.out.println("Media de compras: " + mediaCompras);
            
    }
}
