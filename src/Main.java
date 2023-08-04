import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        // Criando uma lista de clientes para armazenar informações
        List<Cliente> clientes = new ArrayList<>();

        // Adicionando clientes à lista com seus nomes, sobrenomes e quantidade de compras
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

        // Encontrar o cliente com a menor quantidade de compras usando min()
        Cliente clienteMenorCompras = clientes.stream()
            .min(Comparator.comparingInt(Cliente::getCompras)) // Usando Comparator.comparingInt para comparar a quantidade de compras
            .orElse(null); // Tratando o caso em que a lista está vazia com orElse(null)
        System.out.println("Cliente com menor quantidade de compras: " + clienteMenorCompras);

        //outra forma de implementar o código acima	
        /*int menorCompras = clientes.stream()
            .mapToInt(Cliente::getCompras)
            .min()
            .orElse(0);*/

        // Encontrar o cliente com a maior quantidade de compras usando max()
        Cliente clienteMaiorCompras = clientes.stream()
            .max(Comparator.comparingInt(Cliente::getCompras)) // Usando Comparator.comparingInt para comparar a quantidade de compras
            .orElse(null); // Tratando o caso em que a lista está vazia com orElse(null)
        System.out.println("Cliente com maior quantidade de compras: " + clienteMaiorCompras);

        //outra forma de implementar o código acima
        /*int maiorCompras = clientes.stream()
            .mapToInt(Cliente::getCompras)
            .max()
            .orElse(0);*/

        // Calcular a média de compras de todos os clientes usando mapToInt() e average()
        double mediaCompras = clientes.stream()
            .mapToInt(Cliente::getCompras) // Convertendo o stream de clientes em um IntStream contendo as quantidades de compras
            .average() // Calculando a média usando average()
            .orElse(0); // Tratando o caso em que a lista está vazia com orElse(0)
        System.out.println("Media de compras: " + mediaCompras);

        // Calcular a soma de compras de todos os clientes usando mapToInt() e sum()
        /*int somaCompras = clientes.stream()
            .mapToInt(Cliente::getCompras) // Convertendo o stream de clientes em um IntStream contendo as quantidades de compras
            .sum(); // Calculando a soma usando sum()*/

    }
}

